package com.example.todomvvm.tasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.todomvvm.R;
import com.example.todomvvm.database.UserDao;
import com.example.todomvvm.database.UserDatabase;
import com.example.todomvvm.database.UserEntry;

public class RegisterActivity extends AppCompatActivity {
    EditText rusername;
    EditText remailaddress;
    EditText rpassword;
    EditText rrpassword;
    Button register;
    TextView RegisterLogin;
    UserDatabase database;
    UserDao userdao;

    String userName, password, password1, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        rusername= findViewById(R.id.rUsername);
        remailaddress= findViewById(R.id.rEmailAddress);
        rpassword= findViewById(R.id.rPassword);
        rrpassword= findViewById(R.id.rrPassword);
        register = findViewById(R.id.rRegister);
        RegisterLogin= findViewById(R.id.register_login);
        RegisterLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(loginIntent);
            }
        });
        userdao = Room.databaseBuilder(this,UserDatabase.class,"mi-database.db").allowMainThreadQueries()
        .build().UserDao();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName=rusername.getText().toString().trim();
                password=rpassword.getText().toString().trim();
                password1=rrpassword.getText().toString().trim();
                email=remailaddress.getText().toString().trim();

                if (userName.isEmpty()){
                    rusername.setError("You must enter username");
                    rusername.requestFocus();
                    return;
                }

                if (email.isEmpty()){
                    remailaddress.setError("You must enter emailaddress");
                    remailaddress.requestFocus();
                    return;
                }
                if(password.isEmpty()){
                    rpassword.setError("You must enter password");
                    rpassword.requestFocus();
                    return;
                }
                if (password1.isEmpty()){
                    rrpassword.setError("You must reenter the password");
                    rrpassword.requestFocus();
                    return;
                }

                if (password.equals(password1)){
                    UserEntry userentry = new UserEntry(userName, password, email);
                    userdao.insert(userentry);
                    Intent login = new Intent(RegisterActivity.this,LoginActivity.class);
                    startActivity(login);
                    finish();
                }
                else {
                    Toast.makeText(RegisterActivity.this,"Password didn't match .Try again",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}

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

public class LoginActivity extends AppCompatActivity {
    EditText textUsername;
    EditText textPassword;
    Button buttonLogin;
    TextView loginRegister;
    UserDatabase database;
    UserDao userdao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textUsername =(EditText)findViewById(R.id.username);
        textPassword = (EditText)findViewById(R.id.password);
        buttonLogin = (Button)findViewById(R.id.login);
        loginRegister = (TextView)findViewById(R.id.login_register);
        database= Room.databaseBuilder(this,UserDatabase.class,"mi-database.db")
                .allowMainThreadQueries()
                .build();
        userdao = database.UserDao();
                loginRegister.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                        startActivity(registerIntent);
             }
         });
         buttonLogin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String username = textUsername.getText().toString().trim();
                 String password = textPassword.getText().toString().trim();
                 UserEntry userentry = userdao.getUserEntry(username,password);


                 if (username.isEmpty()){
                     textUsername.setError("You must enter username");
                     textUsername.requestFocus();
                     return;
                 }
                 if (password.isEmpty()){
                     textPassword.setError("You must enter the password");
                     textPassword.requestFocus();
                     return;
                 }
                 if(userentry!=null){
                     Intent i = new Intent(LoginActivity.this,MainActivity.class);
                     i.putExtra("UserEntry",userentry);
                     startActivity(i);
                     finish();
                 }
                 else {
                     Toast.makeText(LoginActivity.this,"Couldn't find username",Toast.LENGTH_SHORT).show();
                 }
             }
         });

    }
}

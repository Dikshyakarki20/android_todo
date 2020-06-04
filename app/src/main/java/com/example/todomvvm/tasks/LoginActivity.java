package com.example.todomvvm.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.todomvvm.R;

public class LoginActivity extends AppCompatActivity {
    EditText textUsername;
    EditText textPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textUsername =(EditText)findViewById(R.id.username);
        textPassword = (EditText)findViewById(R.id.password);
        buttonLogin = (Button)findViewById(R.id.login);
    }
}

package com.example.todomvvm.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.todomvvm.R;

public class RegisterActivity extends AppCompatActivity {
    EditText rusername;
    EditText remailaddress;
    EditText raddress;
    EditText rpassword;
    EditText rrpassword;
    Button register;
    Button rcancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        rusername=(EditText)findViewById(R.id.rUsername);
        remailaddress=(EditText)findViewById(R.id.rEmailAddress);
        raddress=(EditText)findViewById(R.id.rAddress);
        rpassword=(EditText)findViewById(R.id.rPassword);
        rrpassword=(EditText)findViewById(R.id.rrPassword);
        register =(Button)findViewById(R.id.rRegister);
        rcancel=(Button)findViewById(R.id.rCancel);
    }
}

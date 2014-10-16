package com.example.SchoolApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import java.util.Map;

public class Login extends Activity {
    /**
     * Called when the activity is first created.
     */

    private EditText btUsername;
    private EditText btPassword;
    public static String username;
    public static String password;
    public static String[] berechtigte ={"paul", "freidoun" ,"thomas","julian","helenal","claudio"};
   Student st;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public void onLogin(View view)
    {
        btUsername=(EditText)findViewById(R.id.etUsername);
        btPassword=(EditText)findViewById(R.id.etPasswort);
      //  st = new Student(btUsername.getText(),btPassword.getText());

        username = btUsername.getText().toString();
        password = btPassword.getText().toString();
        Toast.makeText(Login.this, "Login", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
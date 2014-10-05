package com.example.SchoolApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SchoolApp extends Activity {
    /**
     * Called when the activity is first created.
     */

    private EditText btUsername;
    private EditText btPassword;
    public static String username;
    public static String password;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void onLogin(View view)
    {
        btUsername=(EditText)findViewById(R.id.etUsername);
        btPassword=(EditText)findViewById(R.id.etPasswort);
        username = btUsername.getText().toString();
        password = btPassword.getText().toString();
        Toast.makeText(SchoolApp.this, "Login", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, test.class);
        startActivity(intent);
    }
}
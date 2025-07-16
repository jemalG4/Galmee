package com.galmeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signUpButton = findViewById(R.id.buttonSignUp);
        Button loginButton = findViewById(R.id.buttonLogin);

        signUpButton.setOnClickListener(v -> startActivity(new Intent(this, SignUpActivity.class)));
        loginButton.setOnClickListener(v -> startActivity(new Intent(this, LoginActivity.class)));
    }
}
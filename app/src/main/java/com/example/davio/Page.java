package com.example.davio;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

public class Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        // Reference UI components
        Button loginButton = findViewById(R.id.button2);
        Button signupButton = findViewById(R.id.button3);

        // Set onClickListener for the Login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the login page (replace LoginActivity.class with your actual login activity)
                Intent intent = new Intent(Page.this, Login.class);
                startActivity(intent);
            }
        });

        // Set onClickListener for the Sign Up button
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the sign-up page (replace SignUpActivity.class with your actual sign-up activity)
                Intent intent = new Intent(Page.this, SignUp.class);
                startActivity(intent);
            }
        });

        // Reference the "Next Page" button
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView nextPageButton = findViewById(R.id.backButton);

        // Set onClickListener for the "Next Page" arrow button
        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the second page (replace SecondActivity.class with your actual second activity)
                Intent intent = new Intent(Page.this,  MainActivity.class);
                startActivity(intent);
            }
        });

        // Set onClickListener for the Welcome button

    }
}

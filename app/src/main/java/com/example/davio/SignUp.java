package com.example.davio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        // Reference the "Next Page" button
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView nextPageButton = findViewById(R.id.backButton);

        // Set onClickListener for the "Next Page" arrow button
        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the second page (replace SecondActivity.class with your actual second activity)
                Intent intent = new Intent(SignUp.this,  Page.class);
                startActivity(intent);
            }
        });

        Button SignUp = findViewById(R.id.signUpButton);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the sign-up page (replace SignUpActivity.class with your actual sign-up activity)
                Intent intent = new Intent(SignUp.this, Page.class);
                startActivity(intent);
            }
        });
    }
}
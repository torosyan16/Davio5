package com.example.davio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        // Reference the "Next Page" button
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView nextPageButton = findViewById(R.id.backButton);

        // Set onClickListener for the "Next Page" arrow button
        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the second page (replace SecondActivity.class with your actual second activity)
                Intent intent = new Intent(Login.this,  Page.class);
                startActivity(intent);
            }
        });
    }
}
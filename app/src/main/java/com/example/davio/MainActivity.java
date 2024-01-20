package com.example.davio;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference the "Next Page" button
        ImageView nextPageButton = findViewById(R.id.nextPageButton);

        // Set onClickListener for the "Next Page" arrow button
        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the second page (replace SecondActivity.class with your actual second activity)
                Intent intent = new Intent(MainActivity.this, Page.class);
                startActivity(intent);
            }
        });

        // Add any additional code as needed
    }
}

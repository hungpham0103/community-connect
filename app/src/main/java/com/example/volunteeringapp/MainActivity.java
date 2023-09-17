package com.example.volunteeringapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button browseJobsButton;
    private Button postJobsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        browseJobsButton = findViewById(R.id.browseJobsButton);
        postJobsButton = findViewById(R.id.postJobsButton);

        JobData JobData = new JobData();
        browseJobsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JobListingActivity.class);
                startActivity(intent);
            }
        });

        postJobsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JobPostingActivity.class);
                startActivity(intent);
            }
        });
        //DatabaseHelper dbHelper = new DatabaseHelper(this);
        //SQLiteDatabase db = dbHelper.getWritableDatabase();

    }
}

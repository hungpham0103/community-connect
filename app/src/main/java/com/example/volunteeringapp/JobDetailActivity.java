package com.example.volunteeringapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class JobDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_detail);

        // Retrieve job details from the intent's extras
        String jobName = getIntent().getStringExtra("job_name");
        String jobLocation = getIntent().getStringExtra("job_location");
        String jobDescription = getIntent().getStringExtra("job_description");

        // Display job details in TextView elements in the layout
        TextView jobNameTextView = findViewById(R.id.jobNameTextView);
        TextView jobLocationTextView = findViewById(R.id.jobLocationTextView);
        TextView jobDescriptionTextView = findViewById(R.id.jobDescriptionTextView);

        jobNameTextView.setText(jobName);
        jobLocationTextView.setText("Location: " + jobLocation);
        jobDescriptionTextView.setText(jobDescription);
    }
}


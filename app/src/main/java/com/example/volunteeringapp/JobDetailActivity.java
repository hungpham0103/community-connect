package com.example.volunteeringapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class JobDetailActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_detail);

        String jobName = getIntent().getStringExtra("job_name");
        String jobLocation = getIntent().getStringExtra("job_location");
        String jobDescription = getIntent().getStringExtra("job_description");
        double jobDuration = getIntent().getDoubleExtra("job_duration", 0.0);

        TextView jobNameTextView = findViewById(R.id.jobNameTextView);
        TextView jobLocationTextView = findViewById(R.id.jobLocationTextView);
        TextView jobDescriptionTextView = findViewById(R.id.jobDescriptionTextView);
        TextView jobDurationTextView = findViewById(R.id.jobDurationTextView);

        jobNameTextView.setText(jobName);
        jobDescriptionTextView.setText("Description: " + jobDescription);
        jobLocationTextView.setText("Location: " + jobLocation);
        jobDurationTextView.setText("Expected number of hours: " + String.valueOf(jobDuration));

        Button applyButton = findViewById(R.id.applyButton);
        applyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showConfirmationDialog(jobName);
            }
        });
    }

    private void showConfirmationDialog(String jobName) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Application Successful");
        builder.setMessage("You have successfully applied for the job: " + jobName);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Handle OK button click if needed
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}

package com.example.volunteeringapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

public class JobPostingActivity extends Activity {

    private EditText jobTitleEditText;
    private EditText jobLocationEditText;
    private EditText jobDescriptionEditText;
    private Button addJobButton;
    private List<JobListing> jobListings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_posting);

        jobTitleEditText = findViewById(R.id.jobTitleEditText);
        jobLocationEditText = findViewById(R.id.jobLocationEditText);
        jobDescriptionEditText = findViewById(R.id.jobDescriptionEditText);
        addJobButton = findViewById(R.id.addJobButton);

        addJobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jobTitle = jobTitleEditText.getText().toString();
                String jobLocation = jobLocationEditText.getText().toString();
                String jobDescription = jobDescriptionEditText.getText().toString();


                jobTitleEditText.getText().clear();
                jobLocationEditText.getText().clear();
                jobDescriptionEditText.getText().clear();
            }
        });
    }
}



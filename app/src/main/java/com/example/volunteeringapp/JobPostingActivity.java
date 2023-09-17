package com.example.volunteeringapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

public class JobPostingActivity extends Activity {

    private EditText jobTitleEditText;
    private EditText jobLocationEditText;
    private EditText jobDescriptionEditText;
    private EditText jobDurationEditText;
    private DatePicker jobDatePicker;
    private TimePicker jobTimePicker;
    private Button addJobButton;
    private JobData jobData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_posting);

        jobTitleEditText = findViewById(R.id.jobTitleEditText);
        jobLocationEditText = findViewById(R.id.jobLocationEditText);
        jobDescriptionEditText = findViewById(R.id.jobDescriptionEditText);
        jobDurationEditText = findViewById(R.id.jobDurationEditText);
        jobDatePicker = findViewById(R.id.jobDatePicker);
        jobTimePicker = findViewById(R.id.jobTimePicker);
        addJobButton = findViewById(R.id.addJobButton);

        jobData = JobData.getInstance();

        addJobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jobTitle = jobTitleEditText.getText().toString();
                String jobLocation = jobLocationEditText.getText().toString();
                String jobDescription = jobDescriptionEditText.getText().toString();
                String jobDuration = jobDurationEditText.getText().toString();

                int year = jobDatePicker.getYear();
                int month = jobDatePicker.getMonth();
                int day = jobDatePicker.getDayOfMonth();
                int hour = jobTimePicker.getHour();
                int minute = jobTimePicker.getMinute();

                Calendar selectedDateTime = Calendar.getInstance();
                selectedDateTime.set(year, month, day, hour, minute);

                JobListing jobListing = new JobListing(jobTitle, jobLocation, jobDescription, Double.parseDouble(jobDuration), selectedDateTime);
                jobData.getAllJobListings().add(jobListing);
                clearInputFields();
            }
        });
    }
    private void clearInputFields() {
        jobTitleEditText.getText().clear();
        jobLocationEditText.getText().clear();
        jobDescriptionEditText.getText().clear();
        jobDurationEditText.getText().clear();
    }
}

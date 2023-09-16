package com.example.volunteeringapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JobListingActivity extends Activity {

    private ListView jobListView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_listing);

        jobListView = findViewById(R.id.jobListView);

        // Sample job listings (you should replace this with actual data)
        String[] jobListings = {
                "Volunteer at Local Food Bank",
                "Help with Community Cleanup",
                "Teach Programming to Kids",
                "Assist Elderly with Grocery Shopping",
                // Add more job listings here
        };

        // Create an ArrayAdapter to display job listings
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, jobListings);

        // Set the adapter for the ListView
        jobListView.setAdapter(adapter);

        // Handle item click events (e.g., navigate to job details)
        jobListView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedJob = adapter.getItem(position);
            // Implement the action to view job details or apply for the job
        });
    }
}

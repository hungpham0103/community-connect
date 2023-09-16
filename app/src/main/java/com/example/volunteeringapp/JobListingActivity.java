package com.example.volunteeringapp;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class JobListingActivity extends Activity {

    private ListView jobListView;
    private JobListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_listing);

        jobListView = findViewById(R.id.jobListView);

        JobListing[] jobListings = {
                new JobListing("Volunteer at Local Food Bank", "Location: City A", "foobar"),
                new JobListing("Help with Community Cleanup", "Location: City B", "foobar"),
                new JobListing("Teach Programming to Kids", "Location: City C", "foobar"),
                new JobListing("Assist Elderly with Grocery Shopping", "Location: City D", "foobar"),
        };

        adapter = new JobListAdapter(this, jobListings);
        jobListView.setAdapter(adapter);

        jobListView.setOnItemClickListener((parent, view, position, id) -> {
            JobListing selectedJob = adapter.getItem(position);

            // Create an Intent to start the JobDetailActivity
            Intent intent = new Intent(JobListingActivity.this, JobDetailActivity.class);

            // Pass job details as extras to the intent
            intent.putExtra("job_name", selectedJob.getName());
            intent.putExtra("job_location", selectedJob.getLocation());
            intent.putExtra("job_description", selectedJob.getDescription());

            // Start the JobDetailActivity
            startActivity(intent);
        });



    }
}


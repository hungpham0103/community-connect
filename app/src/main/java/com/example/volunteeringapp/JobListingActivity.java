package com.example.volunteeringapp;

import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

import android.widget.AdapterView;
import android.content.ContentValues;

public class JobListingActivity extends Activity {

    private ListView jobListView;
    private JobListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_listing);

        jobListView = findViewById(R.id.jobListView);

        JobData.getInstance().getAllJobListings();
        adapter = new JobListAdapter(this, JobData.allJobListings);


        adapter = new JobListAdapter(this, JobData.allJobListings);
        jobListView.setAdapter(adapter);


        jobListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position,
                                    long id) {
                JobListing selectedJob = (JobListing) parent.getItemAtPosition(position);

                Intent intent = new Intent(JobListingActivity.this, JobDetailActivity.class);

                intent.putExtra("job_name", selectedJob.getName());
                intent.putExtra("job_location", selectedJob.getLocation());
                intent.putExtra("job_description", selectedJob.getDescription());
                intent.putExtra("job_duration", selectedJob.getDuration());
                intent.putExtra("job_date", selectedJob.getDateTime());

                startActivity(intent);
            }
        });

    }

    ;
    /*
    public static List<JobListing> queryDatabase(Context context) {
        List<JobListing> jobListings = new ArrayList<>();

        DatabaseHelper dbHelper = new DatabaseHelper(context);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String[] projection = {
                "job_title",
                "job_location",
                "job_description",
                "job_duration",
                "job_date"
        };

        Cursor cursor = db.query(
                "job_listings",  // Table name
                projection,     // Columns to retrieve
                null,           // Selection (optional, you can specify conditions here)
                null,           // SelectionArgs (optional)
                null,           // GroupBy (optional)
                null,           // Having (optional)
                null            // OrderBy (optional)
        );

        while (cursor.moveToNext()) {
            String jobTitle = cursor.getString(cursor.getColumnIndex("job_title"));
            String jobLocation = cursor.getString(cursor.getColumnIndex("job_location"));
            String jobDescription = cursor.getString(cursor.getColumnIndex("job_description"));
            int jobDuration = cursor.getInt(cursor.getColumnIndex("job_duration"));
            // long jobDateMillis = cursor.getLong(cursor.getColumnIndex("job_date"));
            // Date jobDate = new Date(jobDateMillis);
            String jobDate = cursor.getString(cursor.getColumnIndex("job_date"));

            JobListing jobListing = new JobListing(jobTitle, jobLocation, jobDescription, jobDuration, jobDate);
            jobListings.add(jobListing);
        }

        cursor.close();
        db.close();

        return jobListings;


    }*/
}



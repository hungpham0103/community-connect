package com.example.volunteeringapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class JobListAdapter extends ArrayAdapter<JobListing> {

    private final Activity context;
    private ArrayList<JobListing> allJobListings;
    private SimpleDateFormat dateFormat;
    private SimpleDateFormat timeFormat;

    public JobListAdapter(Activity context, ArrayList<JobListing> allJobListings) {
        super(context, R.layout.list_item_job, allJobListings);
        this.context = context;
        this.allJobListings = allJobListings;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        this.timeFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.list_item_job, null, true);

        TextView jobNameTextView = view.findViewById(R.id.jobNameTextView);
        TextView jobLocationTextView = view.findViewById(R.id.jobLocationTextView);
        TextView jobDurationTextView = view.findViewById(R.id.jobDurationTextView);
        TextView jobDateTextView = view.findViewById(R.id.jobDateTextView);
        TextView jobTimeTextView = view.findViewById(R.id.jobTimeTextView);

        JobListing jobListing = allJobListings.get(position);
        jobNameTextView.setText(jobListing.getName());
        jobLocationTextView.setText("Location: " + jobListing.getLocation());
        jobDurationTextView.setText("Expected number of hours: " + String.valueOf(jobListing.getDuration()));

        jobDateTextView.setText("Time: " + dateFormat.format( jobListing.getDateTime().getTime()));
        jobTimeTextView.setText("Date: " + timeFormat.format(jobListing.getDateTime().getTime()));

        return view;
    }
}

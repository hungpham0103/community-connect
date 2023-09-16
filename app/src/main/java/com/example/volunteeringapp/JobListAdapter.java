package com.example.volunteeringapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class JobListAdapter extends ArrayAdapter<JobListing> {

    private final Activity context;
    private final JobListing[] jobListings;

    public JobListAdapter(Activity context, JobListing[] jobListings) {
        super(context, R.layout.list_item_job, jobListings);
        this.context = context;
        this.jobListings = jobListings;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.list_item_job, null, true);

        TextView jobNameTextView = view.findViewById(R.id.jobNameTextView);
        TextView jobInfoTextView = view.findViewById(R.id.jobInfoTextView);

        JobListing jobListing = jobListings[position];
        jobNameTextView.setText(jobListing.getName());
        jobInfoTextView.setText(jobListing.getLocation());

        return view;
    }
}


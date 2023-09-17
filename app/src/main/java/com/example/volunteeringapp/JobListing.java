package com.example.volunteeringapp;

import java.util.Calendar;

public class JobListing{
    private String name;
    private String location;
    private String description;
    private double duration;
    private Calendar dateTime;


    public JobListing(String name, String location, String description, double duration, Calendar time) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.duration = duration;
        this.dateTime = time;
    }

    public String getName(){
        return this.name;
    }
    public String getLocation(){
        return this.location;
    }
    public String getDescription(){
        return this.description;
    }
    public double getDuration(){
        return this.duration;
    }
    public Calendar getDateTime() { return dateTime; }



}

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
                new JobListing("Volunteer at Local Food Bank", "Location: Hartford, CT", "As a volunteer at the local food bank, you'll play a vital role in addressing food insecurity in your community. Your responsibilities may include sorting and packaging food donations, assisting clients in selecting food items, and maintaining a clean and organized environment. By dedicating your time to this role, you'll contribute to ensuring that individuals and families in need have access to nutritious meals."),
                new JobListing("Help with Community Cleanup", "Location: New York, NY", "Joining a community cleanup effort means actively participating in maintaining the cleanliness and aesthetics of your neighborhood or public spaces. Tasks may involve picking up litter, removing graffiti, landscaping, and beautification projects. By volunteering for community cleanup, you'll make a visible impact on your environment, creating a cleaner, more attractive place for residents and visitors alike."),
                new JobListing("Teach Programming to Kids", "Location: Boston, MA", "Teaching programming to kids is an opportunity to introduce young learners to the exciting world of computer science and coding. In this role, you'll use your knowledge and enthusiasm for programming languages and technologies to engage children in fun and educational activities. You'll help them develop problem-solving skills, logical thinking, and creativity while nurturing their interest in technology."),
                new JobListing("Assist Elderly with Grocery Shopping", "Location: Seattle, WA", "Assisting the elderly with grocery shopping is a meaningful way to provide support and companionship to seniors who may have difficulty with this everyday task. Your responsibilities may include helping them create shopping lists, navigating the store, carrying groceries, and ensuring they have everything they need. This role not only aids in their physical well-being but also offers social interaction and a sense of community for older individuals."),
                new JobListing("Plant Trees in Community Park", "Location: San Francisco, CA", "Join a team of volunteers dedicated to preserving green spaces. You'll plant trees, care for saplings, and help create a healthier environment for future generations."),
                new JobListing("Mentor High School Students", "Location: Chicago, IL", "Become a mentor to high school students and guide them through their educational journey. Offer support, academic advice, and career insights to help them succeed."),
                new JobListing("Foster Homeless Pets", "Location: Denver, CO", "Provide temporary homes for homeless pets, offering love and care until they find their forever families. Your compassion will make a difference in their lives."),
                new JobListing("Organize Fundraising Events", "Location: Los Angeles, CA", "Coordinate and participate in fundraising events to support local charities. Your efforts will help raise funds for important community initiatives."),
                new JobListing("Tutor English to Immigrants", "Location: Miami, FL", "Help immigrants improve their English language skills, empowering them to better integrate into their new communities and pursue opportunities."),
                new JobListing("Create Art for Hospital Patients", "Location: Philadelphia, PA", "Use your artistic talents to create uplifting and inspirational artwork for hospital patients. Your creations will bring comfort and positivity to those facing health challenges.")
        };

        adapter = new JobListAdapter(this, jobListings);
        jobListView.setAdapter(adapter);

        jobListView.setOnItemClickListener((parent, view, position, id) -> {
            JobListing selectedJob = adapter.getItem(position);

            Intent intent = new Intent(JobListingActivity.this, JobDetailActivity.class);

            intent.putExtra("job_name", selectedJob.getName());
            intent.putExtra("job_location", selectedJob.getLocation());
            intent.putExtra("job_description", selectedJob.getDescription());

            startActivity(intent);
        });



    }
}


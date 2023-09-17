package com.example.volunteeringapp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JobData {
    private static JobData instance;
    public static ArrayList<JobListing> allJobListings;

    public JobData() {
        allJobListings = new ArrayList<>();
        Calendar dateTime1 = new GregorianCalendar(2023, Calendar.SEPTEMBER, 14, 12, 00);
        Calendar dateTime2 = new GregorianCalendar(2023, Calendar.SEPTEMBER, 8, 9, 00);
        Calendar dateTime3 = new GregorianCalendar(2023, Calendar.OCTOBER, 14, 12, 00);
        Calendar dateTime4 = new GregorianCalendar(2023, Calendar.NOVEMBER, 8, 10, 00);
        Calendar dateTime5 = new GregorianCalendar(2023, Calendar.SEPTEMBER, 14, 11, 30);
        Calendar dateTime6 = new GregorianCalendar(2023, Calendar.OCTOBER, 9, 9, 00);
        Calendar dateTime7 = new GregorianCalendar(2023, Calendar.NOVEMBER, 4, 13, 30);
        Calendar dateTime8 = new GregorianCalendar(2023, Calendar.DECEMBER, 3, 14, 00);
        Calendar dateTime9 = new GregorianCalendar(2023, Calendar.DECEMBER, 20, 12, 00);
        Calendar dateTime10 = new GregorianCalendar(2023, Calendar.OCTOBER, 19, 9, 30);
        Calendar dateTime11 = new GregorianCalendar(2023, Calendar.NOVEMBER, 18, 12, 00);
        allJobListings.add(new JobListing("Volunteer at Local Food Bank", "Hartford, CT", "As a volunteer at the local food bank, you'll play a vital role in addressing food insecurity in your community. Your responsibilities may include sorting and packaging food donations, assisting clients in selecting food items, and maintaining a clean and organized environment. By dedicating your time to this role, you'll contribute to ensuring that individuals and families in need have access to nutritious meals.", 2, dateTime1));
        allJobListings.add(new JobListing("Help with Community Cleanup", "New York, NY", "Joining a community cleanup effort means actively participating in maintaining the cleanliness and aesthetics of your neighborhood or public spaces. Tasks may involve picking up litter, removing graffiti, landscaping, and beautification projects. By volunteering for community cleanup, you'll make a visible impact on your environment, creating a cleaner, more attractive place for residents and visitors alike.", 3, dateTime2));
        allJobListings.add(new JobListing("Volunteer at Local Food Bank", "Hartford, CT", "As a volunteer at the local food bank, you'll play a vital role in addressing food insecurity in your community. Your responsibilities may include sorting and packaging food donations, assisting clients in selecting food items, and maintaining a clean and organized environment. By dedicating your time to this role, you'll contribute to ensuring that individuals and families in need have access to nutritious meals.", 2, dateTime3));
        allJobListings.add(new JobListing("Teach Programming to Kids", "Boston, MA", "Teaching programming to kids is an opportunity to introduce young learners to the exciting world of computer science and coding. In this role, you'll use your knowledge and enthusiasm for programming languages and technologies to engage children in fun and educational activities. You'll help them develop problem-solving skills, logical thinking, and creativity while nurturing their interest in technology.", 2.5, dateTime4));
        allJobListings.add(new JobListing("Assist Elderly with Grocery Shopping", "Seattle, WA", "Assisting the elderly with grocery shopping is a meaningful way to provide support and companionship to seniors who may have difficulty with this everyday task. Your responsibilities may include helping them create shopping lists, navigating the store, carrying groceries, and ensuring they have everything they need. This role not only aids in their physical well-being but also offers social interaction and a sense of community for older individuals.", 1, dateTime5));
        allJobListings.add(new JobListing("Plant Trees in Community Park", "San Francisco, CA", "Join a team of volunteers dedicated to preserving green spaces. You'll plant trees, care for saplings, and help create a healthier environment for future generations.", 0.5, dateTime6));
        allJobListings.add(new JobListing("Mentor High School Students", "Chicago, IL", "Become a mentor to high school students and guide them through their educational journey. Offer support, academic advice, and career insights to help them succeed.", 0.5, dateTime7));
        allJobListings.add(new JobListing("Foster Homeless Pets", "Denver, CO", "Provide temporary homes for homeless pets, offering love and care until they find their forever families. Your compassion will make a difference in their lives.", 1.5, dateTime8));
        allJobListings.add(new JobListing("Organize Fundraising Events", "Los Angeles, CA", "Coordinate and participate in fundraising events to support local charities. Your efforts will help raise funds for important community initiatives.", 1, dateTime9));
        allJobListings.add(new JobListing("Tutor English to Immigrants", "Miami, FL", "Help immigrants improve their English language skills, empowering them to better integrate into their new communities and pursue opportunities.", 0, dateTime10));
        allJobListings.add(new JobListing("Create Art for Hospital Patients", "Philadelphia, PA", "Use your artistic talents to create uplifting and inspirational artwork for hospital patients. Your creations will bring comfort and positivity to those facing health challenges.", 0, dateTime11));
    }

    public static JobData getInstance() {
        if (instance == null) {
            instance = new JobData();
        }
        return instance;
    }

    public ArrayList<JobListing> getAllJobListings() {
        return allJobListings;
    }
}

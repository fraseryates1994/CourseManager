package shortcoursemanager;

import java.util.ArrayList;
import java.util.Collections;
import twitter4j.TwitterException;

/**
 *
 * Fraser Yates
 */
public class BusIntManager {

    // Constructor
    public BusIntManager() {
    }
    
    /*
    Function : rankCoursesByBooking
    Parameters : bookingManager
    Returns : String
    comments : Gets courses from booking list and ranks them by bookingCount
    */
    public String rankCoursesbyBooking(BookingManager bm) {

        //create a arraylist of coursecounts
        ArrayList<CourseCount> counts = new ArrayList<>();

        for (Booking booking : bm.getBookings()) {
            //get course from course run and course run from booking
            Course course = booking.getCourseRun().getCourse();
            
            //Loop and check if coursecount exists within course
            int exists = -1;
            for (CourseCount count : counts) {
                if (count.getCourse().getcID().equals(course.getcID())) {
                    exists = counts.indexOf(count);
                }
            }
            //if exists, increment, else add to coursecount
            if (exists == -1) {
                counts.add(new CourseCount(course, 1));
            } else {
                counts.get(exists).incCount();
            }
        }   
        // Sort from high to low
        Collections.sort(counts);
        
        // Convert to String
        StringBuilder sb = new StringBuilder();
        for (CourseCount cc : counts) {
            sb.append(cc);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void setupTwitterApp(OOSD2TwitterAPI twitterapi) {
        twitterapi.setupTwitterApp();
    }

    public String checkTwitterInfoForSubject(String searchterm, OOSD2TwitterAPI twitterapi) throws TwitterException {
        String res = twitterapi.searchTwitter(searchterm);
        return res;
    }
}

package shortcoursemanager;

import java.util.ArrayList;

/**
 *
 * @author Fraser Yates
 */
public class BookingManager {

    private ArrayList<Booking> bookings;
    private int bookingIDindex;
    private String bookingID;
    private CourseRun courseRun;
    private String atendee;

    // CONSTURCTOR
    public BookingManager() {
        bookings = new ArrayList<>();
        bookingIDindex = 0;
    }

    /*
    Function : makeBooking
    Parameters : courseRun and atendee
    Returns : void
    Comments : adds bookings to booking list given a courseRun and atendee
     */
    public void makeBooking(CourseRun courseRun, String atendee) {
        // Make bookingID
        bookingID = "B";
        bookingID += Integer.toString(bookingIDindex);
        // Add to bookings list nd increments index
        bookings.add(new Booking(bookingID, courseRun, atendee));
        bookingIDindex++;
    }

    /*
    Function : searchBooking
    Parameters : bookingID
    Returns : Booking
    Comments : searches bookings for bookingID and returns booking
     */
    public Booking searchBooking(String bookingID) {
        // Loop through bookings
        for (Booking booking : bookings) {
            // If bookingID input matches bookingID in list return booking
            if (booking.getBookingID().equals(bookingID)) {
                return booking;
            }
        }
        return null;
    }

    // GETTERS
    public String getAtendee() {
        return atendee;
    }

    public CourseRun getCourseRun() {
        return courseRun;
    }

    public String getBookingID() {
        return bookingID;
    }

    public int getBookingIDindex() {
        return bookingIDindex;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    // SETTERS
    public void setAtendee(String atendee) {
        this.atendee = atendee;
    }

    public void setCourseRun(CourseRun courseRun) {
        this.courseRun = courseRun;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setBookingIDindex(int bookingIDindex) {
        this.bookingIDindex = bookingIDindex;
    }

    public void setBooking(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

}

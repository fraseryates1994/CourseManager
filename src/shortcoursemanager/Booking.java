package shortcoursemanager;

/**
 *
 * @author Fraser Yates
 */
public class Booking {

    private String bookingID;
    private String atendee;
    private CourseRun run;

    // CONSTRUCTOR
    public Booking(String bookingID, CourseRun run, String atendee) {
        this.bookingID = bookingID;
        this.run = run;
        this.atendee = atendee;
    }
    
    @Override
    public String toString() {
        return bookingID + "_" + run.getRunID() + " " + atendee + " " + run;
    }

    // GETTERS
    public CourseRun getCourseRun() {
        return run;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getAtendee() {
        return atendee;
    }

    // SETTERS
    public void setAtendee(String atendee) {
        this.atendee = atendee;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setCourseRun(CourseRun courseRun) {
        this.run = courseRun;
    }

}

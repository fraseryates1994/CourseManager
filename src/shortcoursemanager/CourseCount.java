package shortcoursemanager;

/**
 *
 * @author Fraser Yates
 */
public class CourseCount implements Comparable<CourseCount> {

    private int bookingCount;
    private Course course;

    // CONSTRUCTOR
    public CourseCount(Course c, int count) {
        this.course = c;
        this.bookingCount = count;
    }
    
    @Override
    public String toString() {
        return course + "=" + bookingCount;
    }

    // GETTERS
    public Course getCourse() {
        return course;
    }

    public int getBookingCount() {
        return bookingCount;
    }

    // SETTERS
    public void setBookingCount(int bookingCount) {
        this.bookingCount = bookingCount;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    /*
    Function : incCount
    Parameters : none
    Returns : none
    */   
    public void incCount() {
        ++bookingCount;
    }
    
    /*
    Function : compareTo
    Parameters : CourseCount
    Returns : Int
    Comments : Edited to return bookingCount in descending order
    */

    @Override
    public int compareTo(CourseCount compareCounts) {
        int compareQuantity = ((CourseCount) compareCounts).getBookingCount();

        //ascending order
        //return this.getBookingCount() - compareQuantity;

        //descending order
        return compareQuantity - this.getBookingCount();
    }
}

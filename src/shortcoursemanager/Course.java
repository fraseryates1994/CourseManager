
package shortcoursemanager;

/**
 *
 * @author Fraser Yates
 */
public class Course {

    private String courseID;
    private String courseTitle;
    
    // CONSTRUCTOR
    public Course(String ID, String Title) {
        this.courseID = ID;
        this.courseTitle = Title;
    }
    
    // toString
    @Override
    public String toString() {
        return courseID + " "+ courseTitle;
    }
    
    // GETTERS
    public String getcID() {
        return courseID;
    }

    public String getcTitle() {
        return courseTitle;
    }
    
    // SETTERS
    public void setcID(String cID) {
        this.courseID = cID;
    }

    public void setcTitle(String cTitle) {
        this.courseTitle = cTitle;
    }

}

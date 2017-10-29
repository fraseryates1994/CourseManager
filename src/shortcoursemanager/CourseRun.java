package shortcoursemanager;

/**
 *
 * @author Fraser Yates
 */
public class CourseRun {

    private String runID;
    private String date;
    private Course course;
    
    // CONSTRUCTOR
    public CourseRun(String runID, Course c, String date) {
        this.runID = runID;
        this.course = c;
        this.date = date;
    }
    
    // toString
    @Override
    public String toString() {
        return runID + " " + date + " " + course.getcTitle();
    }
   
    // GETTERS
    public Course getCourse() {
        return course;
    }

    public String getRunID() {
        return runID;
    }
    
    public String getDate() {
        return date;
    }
    
    // SETTERS
    public void setRunID(String runID) {
        this.runID = runID;
    }
   

    public void setDate(String date) {
        this.date = date;
    }
}

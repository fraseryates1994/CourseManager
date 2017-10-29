package shortcoursemanager;

import java.util.ArrayList;

/**
 *
 * @author Fraser Yates
 */
public class CourseManager {

    private ArrayList<CourseRun> courseRuns;
    private ArrayList<Course> courses;
    private int courseIDindex;
    private int courseRunIDindex;
    private String courseTitle;
    private String courseID;
    private String date;
    private String runID;

    // CONSTRUCTOR
    public CourseManager() {
        courseIDindex = 0;
        courses = new ArrayList<>();
        courseRuns = new ArrayList<>();
    }

    /*
    Function : addCourse
    Parameters: title
    Return : Void
    Comments : Add a course to list given a title
     */
    public void addCourse(String title) {
        // Make course ID
        courseID = "C";
        courseID += Integer.toString(courseIDindex);

        // Add to courses list and increment index each time
        courses.add(new Course(courseID, title));
        courseIDindex++;
    }

    /*
    Function : addCourseRun
    Parameters: courseID and date
    Return : Void
    Comments : Add a courseRun to list given courseID and date
     */
    public void addCourseRun(String courseID, String date) {
        // Search for course given courseID
        Course course = searchCourse(courseID);
        // Create runID
        runID = courseID + "_R" + courseRunIDindex;
        // Add to courseRun list and increment index each time
        courseRuns.add(new CourseRun(runID, course, date));
        courseRunIDindex++;
    }

    /*
    Function : searchCourse
    Parameters : courseID
    Return : Course
    Comments : Search through courses list for courseID and return the course
     */
    public Course searchCourse(String courseID) {
        // Loop through courses list 
        for (Course course : courses) {
            // Check if courseID input matches ID in the list
            if (course.getcID().equals(courseID)) {
                return course;
            }
        }
        return null;
    }

    /*
    Function : searchCourseRun
    Paramters : runID
    Returns : CourseRun
    Comments : search courseRuns list for runID and return the CourseRun associated with it
     */
    public CourseRun searchCourseRun(String runID) {
        // Loop through CourseRun list
        for (CourseRun courseRun : courseRuns) {
            // Check if runId equals runID in courseRun list
            if (courseRun.getRunID().equals(runID)) {
                return courseRun;
            }
        }
        return null;
    }

    // GETTERS
    public ArrayList<CourseRun> getCourseRuns() {
        return courseRuns;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public int getCourseIDindex() {
        return courseIDindex;
    }

    public int getCourseRunIDindex() {
        return courseRunIDindex;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getDate() {
        return date;
    }

    public String getRunID() {
        return runID;
    }

    // SETTERS
    public void setCourseRuns(ArrayList<CourseRun> courseRuns) {
        this.courseRuns = courseRuns;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void setCourseRunIDindex(int courseRunIDindex) {
        this.courseRunIDindex = courseRunIDindex;
    }

    public void setCourseIDindex(int courseIDindex) {
        this.courseIDindex = courseIDindex;
    }

    public void setCourseTitle(String title) {
        this.courseTitle = courseTitle;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRunID(String runID) {
        this.runID = runID;
    }
}

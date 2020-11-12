///////////////////////////////////////////////////////////////////////////////
//
// Title: Course 
//
// Author: Will Langas
// Email: wlangas@wisc.edu
//
///////////////////////////////////////////////////////////////////////////////

/**
 * @author willlangas
 *
 */
public class Course {
  private final String COURSENAME;
  private final String COURSEID;
  
  public Course(String courseName, String courseID) {
    this.COURSENAME = courseName;
    this.COURSEID = courseID;
  }
  
  public String getCourseName() {
    return this.COURSENAME;
  }
  
  public String getCourseID() {
    return this.COURSEID;
  }
}

///////////////////////////////////////////////////////////////////////////////
//
// Title: Student
//
// Author: Will Langas
// Email: wlangas@wisc.edu
//
///////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person {
  private ArrayList<Course> coursesEnrolled = new ArrayList<Course>(0);
  private static int idGenerator = 23000;
  private final int ID;
  
  public Student(String name) {
    super(name, false);
    
    this.ID = idGenerator;
    ++idGenerator;
  }
  
  public int getID() {
    return this.ID;
  }
  
  public void addCourseEnrolled(Course course) {
    coursesEnrolled.add(course);
  }
  
  public Course[] getCourses() {
    Course[] coursesList = new Course[coursesEnrolled.size()];

    for (int i = 0; i < coursesEnrolled.size(); ++i) {
      coursesList[i] = coursesEnrolled.get(i);
    }
    return coursesList;
  }
  
  
  @Override
  public void printInfo() {
    System.out.println("Student Name: " + this.getName());
    System.out.println("Student ID: " + this.ID);
    
    Course[] coursesList = this.getCourses();

    System.out.print("Courses Enrolled In: " + Arrays.toString(coursesList));
  }
  
  @Override
  public boolean equals(Object o) {
    if (o instanceof Student && this.ID == ((Student) o).getID()) {
      return true;
    }
    return false;
  }
}
///////////////////////////////////////////////////////////////////////////////
//
// Title: Teacher 
//
// Author: Will Langas
// Email: wlangas@wisc.edu
//
///////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author willlangas
 *
 */
public class Teacher extends Person {
  ArrayList<Course> coursesTaught = new ArrayList<Course>(0);
  private int salary;
  private static int idGenerator = 1000;
  private final int ID;

  public Teacher(String name, boolean adminStatus, int salary) {
    super(name, adminStatus);
    
    this.salary = salary;
    
    this.ID = idGenerator;
    ++idGenerator;
  }
  
  public void giveRaise(int raise) {
    this.salary += raise;
  }
  
  public void giveDemotion(int demotion) {
    this.salary -= demotion;
  }
  
  public int getSalary() {
    return this.salary;
  }
  
  public int getID() {
    return this.ID;
  }

  public void addCourseTaught(Course course) {
    coursesTaught.add(course);
  }

  public Course[] getCourses() {
    Course[] coursesList = new Course[coursesTaught.size()];

    for (int i = 0; i < coursesTaught.size(); ++i) {
      coursesList[i] = coursesTaught.get(i);
    }
    return coursesList;
  }
  
  @Override
  public boolean equals(Object o) {
    if (o instanceof Teacher && this.ID == ((Teacher) o).getID()) {
      return true;
    }
    return false;
  }

  @Override
  public void printInfo() {
    System.out.println("Teacher Name: " + this.getName());
    System.out.println("Teacher ID: " + this.ID);
    System.out.println("Teacher Salary: " + this.salary);
    
    Course[] coursesList = this.getCourses();

    System.out.print("Courses Taught: " + Arrays.toString(coursesList));
  }
}
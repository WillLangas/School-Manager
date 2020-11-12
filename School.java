///////////////////////////////////////////////////////////////////////////////
//
// Title: School
//
// Author: Will Langas
// Email: wlangas@wisc.edu
//
///////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;

/**
 * The School object will have a list of students and teachers
 *
 * @author willlangas
 *
 */
public class School {

  private ArrayList<Teacher> teachers = new ArrayList<Teacher>(0);
  private ArrayList<Student> students = new ArrayList<Student>(0);
  
  private String name;
  
  public School(String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void changeName(String name) {
    this.name = name;
  }
  
  public void addTeacher(Teacher teacher) {
    teachers.add(teacher);
  }
  
  public void addStudent(Student student) {
    students.add(student);
  }
  
  public ArrayList<Teacher> getTeachers() {
    return teachers;
  }
  
  public ArrayList<Student> getStudents() {
    return students;
  }
  
  public void printInfo() {
    System.out.println("School Name: " + this.name);
    System.out.println("Number of Teachers: " + teachers.size());
    System.out.println("Number of Students: " + students.size());
  }
}

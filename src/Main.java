///////////////////////////////////////////////////////////////////////////////
//
// Title: Main
//
// Author: Will Langas
// Email: wlangas@wisc.edu
//
///////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author willlangas
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Welcome to School Management 1.0");
    System.out.println("Press a corresponding option, or q to quit, then enter to select\n");
    printCommands();

    Scanner scnr = new Scanner(System.in);
    char input = ' ';

    input = scnr.next().charAt(0);

    School school = new School(null);

    while (input != 'q') {
      switch (input) {
        case '1':
          createNewSchool(scnr, school);
          break;

        case '2':
          createNewTeacher(scnr, school);
          break;

        case '3':

          break;

        case '4':

          break;

        case '5':

          break;

        case '6':

          break;
      }

      System.out.println();
      printCommands();
      input = scnr.next().charAt(0);
    }

    System.out.println("Program exited, thank you for using School Management 1.0");
  }

  public static void printCommands() {
    System.out.println("1 Create a new school");
    System.out.println("2 Create a new teacher");
    System.out.println("3 Create a new student");
    System.out.println("4 Create a new course");
    System.out.println("5 List the teachers in the school");
    System.out.println("6 List the students in the school");
    System.out.println("7 To create a record file");
    System.out.println("q To quit");
  }

  public static void createNewSchool(Scanner scnr, School school) {
    try {
      
      System.out.println("Enter new school name: ");
      String schoolName = scnr.next();
      school.changeName(schoolName);
      
      System.out.println("New school: " + schoolName + " was created successfully");
      
    } catch (Exception e) {
      System.out.println("Exception " + e + "encountered when creating a new school");
    }
  }

  public static void createNewTeacher(Scanner scnr, School school) {
    try {
      
      System.out.print("Enter the new teacher's name: ");
      scnr.nextLine();
      String teacherName = scnr.nextLine();
      
      System.out.print("\nIs the teacher an admin? (Enter 'Y' for yes, 'N' for no: ");
      char adminYN = scnr.next().charAt(0);
      boolean adminStatus;
      
      if (Character.toUpperCase(adminYN) == 'Y') {
        adminStatus = true;        
      } else if (Character.toUpperCase(adminYN) == 'N') {
        adminStatus = false;
      } else {
        throw new IllegalArgumentException("\nInvalid input");
      }
      
      System.out.println("\nEnter " + teacherName + "'s salary as an integer: ");
      int teacherSalary = scnr.nextInt();
      
      Teacher newTeacher = new Teacher(teacherName, adminStatus, teacherSalary);
      school.addTeacher(newTeacher);
      System.out.println("New teacher: " + teacherName + " was created successfully");
      
    } catch (Exception e) {
      System.out.println("\nException " + e + " encountered when creating a new teacher");
    }
  }  
}

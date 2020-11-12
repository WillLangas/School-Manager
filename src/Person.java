///////////////////////////////////////////////////////////////////////////////
//
// Title: Person
//
// Author: Will Langas
// Email: wlangas@wisc.edu
//
///////////////////////////////////////////////////////////////////////////////

/**
 * @author willlangas
 *
 */
public class Person {
  private String name;
  private boolean adminStatus;

  public Person(String name, boolean adminStatus) {
    this.name = name;
    this.adminStatus = adminStatus;
  }

  public String getName() {
    return this.name;
  }

  public boolean getStatus() {
    return this.adminStatus;
  }
  
  public void printInfo() {
    System.out.println("Name: " + this.name);
    System.out.print("Is admin?: " + this.adminStatus);
  }
}

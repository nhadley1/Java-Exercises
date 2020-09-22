// LiveCoding3_3.java
// Jim Jerkofsky  11/05/17
// Test subclass Hourly.

import java.util.Scanner;


public class LiveCoding3_3
{
  public static void main(String[] args)
  {
    // Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Set up and display Employee object using full constructor.
    System.out.println("Enter data for Employee object:");
    Employee firstEmployee = Employee.enterEmployee();
    
    System.out.println("\nEmployee:  " + firstEmployee);
    
    // Set up and display Hourly object using full constructor.
    System.out.println("\n\nEnter data for Hourly object:");
    Hourly firstHourly = Hourly.enterHourly();
    
    System.out.println("\n\nHourly:  " + firstHourly);
  }
}
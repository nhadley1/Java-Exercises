// Employee.java
// Jim Jerkofsky  11/06/18
// Superclass for employee data.
import java.util.Scanner;


public class Employee
{
  // Defualt constructor.
  public Employee()
  {
    lastName = "*****";
    age = 0;
  }
  
  // Full constructor.
  public Employee(String name, int years)
  {
    lastName = name;
    age = years;
  }
  
  // Employee's get() methods.
  public String getLastName()
  {
    return lastName;
  }
  
  public int getAge()
  {
    return age;
  }
  
  // Employee's set() methods.
  public void setLastName(String name)
  {
    lastName = name;
  }
  
  public void setAge(int years)
  {
    age = years;
  }
  
  // toString method.
  public String toString()
  {
    String temp = "";
    
    temp = temp + "[" + lastName + "; " + age + "]";
    
    return temp;
  }
  
  // Method to set up and return Employee object.
  public static Employee enterEmployee()
  {
    // Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Input data for Employee object.
    System.out.print("Last name:  ");
    String name = keyboard.nextLine();
    
    System.out.print("Age:        ");
    int years = keyboard.nextInt();
    
    // Instantiate Employee object.
    Employee newEmployee = new Employee(name, years);
    
    // Return Employee object.
    return newEmployee;
  }
  
  // Instance variables.
  private String lastName;
  private int age;
}
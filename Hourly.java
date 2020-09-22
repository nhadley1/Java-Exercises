// Hourly.java
// Jim Jerkofsky 11/06/18
// Subclass of class Employee.
import java.util.Scanner;


public class Hourly extends Employee
{
  // Default constructor.
  public Hourly()
  {
    super();
    
    dept = "*****";
    byHour = 0.0;
  }
  
  // Full constructor.
  public Hourly(String name, int years, String dpt, double wage)
  {
    super(name, years);
    
    dept = dpt;
    byHour = wage;
  }  

  // toString() method.
  public String toString()
  {
    return "[" + super.toString() + "; "+ dept + "; " + byHour + "]";
  }
  
  // get() methods.
  public String getDept()
  {
    return dept;
  }
  
  public double getByHour()
  {
    return byHour;
  }
  
  // set() methods.
  public void setDept(String dpt)
  {
    dept = dpt;
  }
  
  public void setByHour(double wage)
  {
    byHour = wage;
  }
  
  // Method to set up and return Hourly object.
  public static Hourly enterHourly()
  {
    // Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Input data for Hourly object.
    System.out.print("Last name:  ");
    String name = keyboard.nextLine();
    
    System.out.print("Age:        ");
    int years = keyboard.nextInt();
    
    // Clear keyboard buffer.
    keyboard.nextLine();
    
    System.out.print("Department: ");
    String dpt = keyboard.nextLine();
    
    System.out.print("Hourly:    $");
    double wage = keyboard.nextDouble();
    
    // Instantiate Hourly object.
    Hourly newHourly = new Hourly(name, years, dpt, wage);
    
    // Return Hourly object.
    return newHourly;
  }
    


  // Instance variables.
  private String dept;
  private double byHour;
}
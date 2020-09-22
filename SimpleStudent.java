// SimpleStudent.java
// Jim Jerkofsky  10/09/18
// Class to hold student's last name and age.
import java.util.Scanner;


public class SimpleStudent
{
  // Constructor.
  public SimpleStudent(String last, int years)
  {
    lastName = last;
	 age = years;
  }
  
  // SimpleStudent's get() methods.
  public String getLastName()
  {
    return lastName;
  }
  
  public int getAge()
  {
    return age;
  }
  
  // SimpleStudent's set() methods.
  public void setLastName(String last)
  {
    lastName = last;
  }
  
  public void setAge(int years)
  {
    age = years;
  }
    
  // SimpleStudent's toString() method.
  public String toString()
  {
    String stdt = "";
    
    stdt = "[" + lastName + "; " + age + "]";
    
    return stdt;
  }
  
     
  // Method to input data and set up SimpleStudent object.
   public static SimpleStudent enterStudent()
   {
    // Set up Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
    
    // Enter student information.
      System.out.print("Last name:   ");
      String lastName = keyboard.nextLine();
    
      System.out.print("ID#:         ");
      int age = keyboard.nextInt();
   
    
    // Set up SimpleStudent object.
      SimpleStudent student = 
         new SimpleStudent(lastName, age);
    
    // Return reference to LinkedSimpleStudent object to calling method.
      return student;
   }
  
  // SimpleStudent's equals() method.
  // Compares both name and age.
  // Modified so that it works with ArrayList's remove().
  public boolean equals(Object obj)
  {
    SimpleStudent s2 = (SimpleStudent)obj;
  
    boolean flag = (lastName.equals(s2.lastName)) &&
	                (age == s2.age);
	 
	 return flag;
  }
  
  // SimpleStudent's compareTo() method.
  // First compares names.
  // If names are the same, then compares ages.
  // Returns -1 if implicit parameter comes before explicit parameter.
  // Returns 0 if implicit parameter and explicit parameter the same.
  // Returns 1 if implicit parameter comes after explicit parameter.
  public int compareTo(SimpleStudent st2)
  {
    // Compare names.
    int flag = lastName.compareTo(st2.lastName);
    
    if(flag < 0)
    {
      // implicit < explicit.
      return -1;
    }
    else if(flag > 0)
    {
      // implicit > explicit.
      return 1;
    }
    
    // Names are the same; compare ages.
    if(age < st2.age)
    {
      // implicit < explicit.
      return -1;
    }
    
    else if(age > st2.age)
    {
      // implicit > explicit.
      return 1;
    }
    
    else
    {
      // implicit, explicit same.
      return 0;
    }
  }
    
  // Instance variables.
  private String lastName;
  private int age;
}
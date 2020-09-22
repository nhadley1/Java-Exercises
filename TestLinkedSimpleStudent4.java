// TestLinkedSimpleStudent4.java
// Jim Jerkofsky  10/12/18
// Test of LinkedSimpleStudent class.
// Adds student at end of list; for each addition, start at
//   beginning of list.
import java.util.Scanner;


public class TestLinkedSimpleStudent4
{
   public static void main(String[] args)
   {
      // Set up Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
    
      // Input number of students to put in linked list.
      System.out.print("Number of students:  ");
      int limit = keyboard.nextInt();
    
      // Enter student information and add students to linked list.
      LinkedSimpleStudent head = null;
      LinkedSimpleStudent current = null;
    
      for(int ctr = 1; ctr <= limit; ctr++)
      {
         System.out.println("\nStudent #" + ctr);
      
         // Input information and set up LinkedSimpleStudent object.
         LinkedSimpleStudent student = enterStudent();
      
         // Add student to linked list.
         if(head == null)
         {
            // Student is first in linked list; set pointer to first item.
            head = student;
         
         }
         else
         {
            // Add student at end of current list.
            // Begin by traversing list from head to last student.
            current = head;
         
            while(current.getPtr() != null)
            {
               current = current.getPtr();
            }
         
            // Have reached end of list; insert student.
            current.setPtr(student);
         }
      }
    
      // Print out linked list of students.
      System.out.println("\n\nStudents in linked list:");
      printStudents(head);
   }
  
  
   // Method to input data and set up LinkedStudent object.
   public static LinkedSimpleStudent enterStudent()
   {
      // Set up Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
    
      // Enter student information.
      System.out.print("Last name:   ");
      String lastName = keyboard.nextLine();
    
      System.out.print("ID#:         ");
      int age = keyboard.nextInt();
   
    
      // Set up LinkedStudent object.
      LinkedSimpleStudent student = 
         new LinkedSimpleStudent(lastName, age);
    
      // Return reference to LinkedSimpleStudent object to calling method.
      return student;
   }
  
  
  // Method to print linked list of LinkedSimpleStudent objects.
   public static void printStudents(LinkedSimpleStudent head)
   {
      LinkedSimpleStudent next = head;
    
      while(next != null)
      {
         System.out.println(next);
         next = next.getPtr();
      }
   }
}
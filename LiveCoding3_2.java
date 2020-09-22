// LiveCoding3_2.java
// Jim Jerkofsky  11/05/18
// Allows user to set up an unordered list of LinkedSimpleStudent objects.
// Task:  Add method to determine average age of students in list.
import java.util.Scanner;


public class LiveCoding3_2
{
   public static void main(String[] args)
   {
      // Set up Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Ask user number of students to enter.
      System.out.print("Nr. of students:  ");
      int nrStudents = keyboard.nextInt();
      
      System.out.println("\n");
      
      // Clear keyboard buffer.
      keyboard.nextLine();
   
      //Enter students into list.
      LinkedSimpleStudent head = null;
      
      head = addStudents(head, nrStudents);
          
      // Print contents of linked list using loop.
      System.out.println("\n\nCurrent contents of list:");
      printList(head);
      
      // Determnie average age of students in list.
      avgAge(head);
      
   }
  
   // Method to add students to list.
   public static LinkedSimpleStudent addStudents(LinkedSimpleStudent head, int nrStudents)
   {
      // Set up Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);     
  
      LinkedSimpleStudent current = null;
  
      for(int ctr = 1; ctr <= nrStudents; ctr++)
      {
         // Enter student.
         LinkedSimpleStudent newStudent = LinkedSimpleStudent.enterStudent();  
         
         System.out.println();   
        
         // If list is empty, add student at beginning of list.
         if(head == null)
         {
            head = newStudent;
         }
          
         else
         {  current = head;
         
            // List is not empty; add student at end of list.
            while(current.getPtr() != null)
            {
              current = current.getPtr();
            }
            
            // Current points to last student in list.
            current.setPtr(newStudent); 
         }
      }  
      return head;
    }  
    
    // Print current contents of list.
    public static void printList(LinkedSimpleStudent head)
    {
      LinkedSimpleStudent current = head;
      
      while(current != null)
      {
         System.out.println(current);
         
         current = current.getPtr();
      }      
    }
    
    // Method to determine average age of students in list.
    public static void avgAge(LinkedSimpleStudent head)
    {
      LinkedSimpleStudent current = head;
      
      double nrStudents = 0;
      
      double sum = 0;
      
      while(current != null)
      {
        sum = sum + current.getAge();
        
        nrStudents = nrStudents + 1;
        
        current = current.getPtr();
      }
      
      double avg = sum/nrStudents;
      
      System.out.println("Average age: " + avg);
    }
}
//LinkedSimpleStudentManagerTest.java
//Nathan Hadley 10/24/18
//Menu-driven program that exercises LinkedSimpleStudentManager class.
//    Adds student to list.
//    Prints current contents of list.
//    Exits menu.
import java.util.Scanner;

public class LinkedSimpleStudentManagerTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up LinkedSimpleStudentManager object.
    LinkedSimpleStudentManager manager = new LinkedSimpleStudentManager();
    
    // Menu for testing LinkedSimpleStudentManager object.
	 boolean flag = true;
	 
	 while(flag)
	 {
	   int result = 0;
		
		// Print menu.
		System.out.println("\nMenu to exercise LinkedSimpleStudentManager class:");
		System.out.println("1)  Add student.");
		System.out.println("2)  Print current contents of list.");
		System.out.println("0)  Exit menu.");
		System.out.print("Selection:  ");
		result = keyboard.nextInt();
		
		switch(result)
		{
		  //Add student.
		  case 1:
		    System.out.println("\nEnter student to add to list:");
          manager.addStudent(LinkedSimpleStudent.enterStudent());
          break;
		  
		  // Print current contents of list.
		  case 2:
		    System.out.println("\nPrinting current contents of list: ");
          manager.printList();
			 break;
		
		  // Exit menu.
		  case 0:
		    flag = false;
		    break;
			 
		  // Invalid menu selection.
		  default:
		     System.out.println("\nInvalid menu selection.");
           break;
      }
      
    }
  }
} 

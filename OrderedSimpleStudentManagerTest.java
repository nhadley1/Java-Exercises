//OrderedSimpleStudentManagerTest.java
//Nathan Hadley 11/04/18
//Class to test OrderedSimpleStudentNodeManager
//Uses menu driven progam to:
  //Add Simple Student
  //Print Contents of List
  import java.util.Scanner;
  
  public class OrderedSimpleStudentManagerTest
  {
    public static void main(String[] args)
    {
      //Set up Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Set up LinkedListLinkedSimpleStudent object.
      OrderedSimpleStudentManager students = new OrderedSimpleStudentManager();
    
    // Menu to add students and print list.
    int response = 1;
    
    while(response != 0)
    {
      // Print menu.
      System.out.println("1]  Add student:");
      System.out.println("2]  Print list:");
      System.out.println("0]  Exit menu.");
      System.out.print("Menu Choice:  ");
      response = keyboard.nextInt();
      
      // Execute menu choice.
      switch(response)
      {
        // Add student to end of linked list.
        case 1:
           System.out.println("\nEnter student data:  ");
           SimpleStudent student = SimpleStudent.enterStudent();
           students.addStudent(student);
           System.out.println();
           break;
           
        // Print current contents of linked list.
        case 2:
           System.out.println("\nList of students:");
           students.printList();
           System.out.println("\n");
           break;
           
        // Exit menu.   
        case 0:
           System.out.println("\nExiting menu.\n");
           break;
           
        // Invalid menu option entered.
        default:
           System.out.println("\nInvalid menu option entered.\n");
           break;
       }
    }
    }
  }
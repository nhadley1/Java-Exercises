//Program7.java
import java.util.Scanner;

public class Program7
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up List.
    OrderedLinkedListManager myList = new OrderedLinkedListManager();
    
    //Menu.
    int response = 1;
    
    while(response != 0)
    {
      System.out.println("Menu:");
      System.out.println("1]  Add string.");
      System.out.println("2]  Print list.");
      System.out.println("0]  Exit menu.");
      System.out.print("Menu choice:  ");
      response = keyboard.nextInt();
      System.out.println();
      
      switch(response)
      {
        //Add student to list.
        case 1: 
        {
          SimpleStudent newStdt = SimpleStudent.enterStudent();
          
          myList.addStudent(newStdt);
          
          break;
        }
        
        //PrintList
        case 2:
        {
          System.out.println("\nPrinting List:");
          
          myList.printList();
          
          break;
        }
        
        //Exit menu.
        case 0:
        {
          System.out.println("\nExiting Menu!");
          
          break;
        }
        
        default:
        {
          System.out.println("\nInvalid menu input.");
          break;
        }
      }
    }
  }
}
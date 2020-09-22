//OrderedLinkListManagerTest.java
import java.util.Scanner;


public class OrderedLinkListManagerTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up Empty LinkedList.
    OrderedLinkListManager myList = new OrderedLinkListManager();
    
    //Set up menu driven program to enter Strings into Linked List.
    int response = -1;
    
    while(response != 0)
    {
      System.out.println("\nMenu to work with Linked List: ");
      System.out.println("1] Add String.");
      System.out.println("2] Print List.");
      System.out.println("0] Exit Menu.");
      System.out.print("\nEnter Response: ");
      response = keyboard.nextInt();
      
      keyboard.nextLine();
      
      switch(response)
      {
        case 1:
        {
          System.out.print("\nInput String: ");
          String str = keyboard.nextLine();
          
          myList.addString(str);
          break; 
        }
        
        case 2:
        {
          System.out.println("\nPrinting Current contents of Linked List: ");
          myList.printList();
          break;
        }
        
        case 0:
        {
          System.out.println("\nExiting Menu!");
          break;
        }
        
        default:
        {
          System.out.println("\nIncorrect input.");
          break; 
        }
      }
    }
  }
}
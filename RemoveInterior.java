// RemoveInterior.java
// Jim Jerkofsky  11/09/18
// Remove interior node from ordered linked list
//   of LinkedString objects.
import java.util.Scanner;


public class RemoveInterior
{
  public static void main(String[] args)
  {
    // Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Set up empty linked list of LinkedStudent objects.
    LinkedString head = null;
    
    // Menu for linked list manipulation.
    int response = 1;
    
    while(response != 0)
    {
      System.out.println("Menu:");
      System.out.println("1]  Add student.");
      System.out.println("2]  Print list.");
      System.out.println("3]  Remove interior node.");
      System.out.println("0]  Exit menu.");
      System.out.print("Menu choice:  ");
      response = keyboard.nextInt();
      System.out.println();
      
      // Clear keyboard buffer.
      keyboard.nextLine();
      
      switch(response)
      {
        // Add student to list.
        case 1:
        {
          // Input string.
          System.out.print("Type string:  ");
          String nextString = keyboard.nextLine();
          
          // Set up LinkedString object.
          LinkedString next = new LinkedString(nextString);
          
          // Add node to list.
         // add(next);
     
         if(head == null)
         {
           // List is empty; next will be first node in list.
           head = next;
         }
         
         else
         {
           // List is not empty; find position for next in ordered linked list.
           if(next.getString().compareTo(head.getString()) <= 0)
           {
             // Next goes before first node in list.
             next.setPtr(head);
             head = next;    
           }
           
           else
           {
             // Next does not go at beginning of list; find its location in list.
             LinkedString current = head;
             LinkedString previous = null;
             
             // Traverse list to find next's position in list.
             while((current.getPtr() != null) &&
                   (next.getString().compareTo(current.getString()) > 0))
             {
               //Next goes later in list.
               previous = current;
               current = current.getPtr();
             }
             
             // Determine if next goes between two nodes.
             if(next.getString().compareTo(current.getString()) <= 0)
             {
               next.setPtr(current);
               previous.setPtr(next);
             }
             
             else
             {
               // Next goes at end of list.
               current.setPtr(next);
             }
           }
         }
          
          break;
        }
        
        // Print current contents of list.
        case 2:
        {
          // Print list.
          printList(head);
          
          System.out.println("\n");
     
          
          break;
        }
        
        // Remove interior node.
        case 3:
        {
          //Input String to Remove.
          System.out.print("Interior String to Remove: ");
          String toRemove = keyboard.nextLine();
          
          LinkedString current = head; 
          LinkedString previous = null;
          
          while(!current.getString().equals(toRemove))
          {
            previous = current;
            current = current.getPtr();
          }
          
          previous.setPtr(current.getPtr());
          break;
        }
        
        // Exit menu.
        case 0:
        {
          System.out.println("\nExiting menu!\n");
          break;
        }
        
        // Invalid menu option entered.
        default:
        {
          System.out.println("\nInvalid menu choice entered.\n");
          break;
        }
      }
    }
  }
  
  // Method to print current contents of list.
  public static void printList(LinkedString head)
  {
    if(head == null)
    {
       System.out.println("\nList is empty.\n");
    }
          
    else
    {
       LinkedString current = head;
            
       while(current != null)
       {
         System.out.println(current.getString());
         current = current.getPtr();
       }
     } 
  }
}
//LinkedSimpleStudentTest.java
import java.util.Scanner;

public class LinkedStringTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up empty list of string
    LinkedString head = null;
    
    //Set up menu to add string
    int response = 1;
    
    while(response != 0)
    {
      System.out.println("\nMenu:");
      System.out.println("1) Add student.");
      System.out.println("2) Print List.");
      System.out.println("0)Exit Menu.");
      System.out.print("Select menu option: ");
      response = keyboard.nextInt();
      
      //Clear keyboard buffer.
      keyboard.nextLine();
      
      switch(response)
      {
        case 1:
        {
          //Allow user to enter a new string.
          System.out.print("\nEnter a string: ");
          String str = keyboard.nextLine();
          
          LinkedString next = new LinkedString(str);
          
          //List is Empty. Add string to beginning of list.
          if(head == null)
          {
            head = next;
          }
          //List is not empty, traverse list.
          else
          {
            //String goes before head.
            if(next.getString().compareTo(head.getString()) <= 0)
            {
              next.setPtr(head);
              head = next;
            }
            else
            {
              LinkedString current = head;
              LinkedString previous = null;
              
              //Check if String goes between two nodes.
              while((current.getPtr() != null) &&
                (next.getString().compareTo(current.getString()) > 0))
                {
                  current = previous;
                  current = current.getPtr();
                }
                
              //Add string between two nodes.
              if(next.getString().compareTo(current.getString()) <= 0)
              {
                next.setPtr(current);
                previous.setPtr(next);
              }
              //String goes at end of list.
              else
              {
                current.setPtr(next);
              }
            }
          }
          break;
        }
        
        //Print List.
        case 2:
        {
          printList(head);
          
          System.out.println();
          
          break;
        }
        
        //Exit menu.
        case 0: 
        {
          System.out.println("\nExiting Menu.");
          
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
  
  //Method to printList().
  public static void printList(LinkedString head)
  {
    LinkedString current = head;
    
    if(head == null)
    {
      System.out.println("\nList is empty!");
    }
    
    else
    {
      System.out.println("\nPrinting list:");
      
      while(current != null)
      {
        System.out.println(current);
        
        current = current.getPtr();
      }
    }
  }
}
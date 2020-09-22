//OrderedLinkedString.java
import java.util.Scanner;


public class OrderedLinkedString
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up empty List of Linked Strings
    LinkedString head = null;
    
    //Menu Linked List manipulation.
    int response = 1;
    
    while(response != 0)
    {
      System.out.println("\nMenu Options:");
      System.out.println("1) Add String.");
      System.out.println("2) Print List.");
      System.out.println("0) Exit Menu.");
      System.out.print("Choose menu option: ");
      response = keyboard.nextInt();
      
      //Clear keyboard buffer.
      keyboard.nextLine();
      
      switch(response)
      {
        case 1:
        {
          //Input String to be added to list.
          System.out.print("\nString to add to list: ");
          String str = keyboard.nextLine();
          
          LinkedString next = new LinkedString(str);
          
          //List is empty, add String to beginning of list.
          if(head == null)
          {
            head = next;
          }
          //Travese List to find proper string location.
          else
          { 
            //String goes at beginning of list.
            if(next.getString().compareTo(head.getString()) <= 0)
            {
              next.setPtr(head);
              head = next;
            }
            //String does not go at beginning of list, 
            else
            {
              LinkedString current = head;
              LinkedString previous = null;
              
              //Traverse List to find location.
              while((current.getPtr() != null) && 
                   (next.getString().compareTo(current.getString()) > 0))
                   {
                     previous = current;
                     current = current.getPtr();
                   }
              //String goes between two nodes.     
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
          
          System.out.println("\n");
          
          break;
        }
        
        //Exit menu.
        case 0:
        {
          System.out.println("\nExiting menu");
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
  //Method to printList
  public static void printList(LinkedString head)
  {
    if(head == null)
    {
      System.out.println("\nList is empty.");
    }
    else
    {
      LinkedString current = head;
    
      System.out.println("\nPrinting Linked List: ");
      while(current != null)
      {
        System.out.println(current);
      
        current = current.getPtr();
      }
    }
  }
}
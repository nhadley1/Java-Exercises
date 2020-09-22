//LinkedSimpleStudentTest.java
import java.util.Scanner;

public class LinkedStringTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up empty list of string
    LinkedSimpleStudent head = null;
    
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
      
      switch(response)
      {
        case 1:
        {
          //Allow user to enter a new string.
          System.out.print("\nEnter a string: ");
          String str = keyboard.nextLine();
          
          LinkedString next = LinkedString(str);
          
          //List is Empty. Add string to beginning of list.
          if(head == null)
          {
            head = next;
          }
          //List is not empty, check if string goes before head.
          else
          {
            if(next.getString().compareTo(head.getString() <= 0))
            {
              next.setPtr(head);
              head = next;
            }
          }
          break;
        }
        
      }
    }
  }
}
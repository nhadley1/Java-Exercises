//LLBegin.java
import java.util.Scanner;


public class LLBegin
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up empty Linked list of Strings
    LinkedString head = null;
    
    for(int ctr = 0; ctr < 3; ctr++) 
    {
      System.out.print("\nEnter String: ");
      String str = keyboard.nextLine();
     
      LinkedString next = new LinkedString(str);
      
      if(head == null)
      {
        head = next;
      }
      else
      {
        next.setPtr(head);
        head = next;
      }
    }
    //Print Linked List
    LinkedString current = head;
    
    while(current != null)
    {
      System.out.println(current);
      
      current = current.getPtr();
    }
  }
}
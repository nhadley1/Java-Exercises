import java.util.Scanner;


public class LLEnd
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up empty Linked list of Strings
    LinkedString head = null;
    LinkedString current = null;
    
    for(int ctr = 1; ctr <= 3; ctr++) 
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
        current = head;
        
        while(current.getPtr() != null)
        {
          current = current.getPtr();
        }
        
        current.setPtr(next);
      }
    }
    //Print Linked List
    LinkedString curr = head;
    
    while(curr != null)
    {
      System.out.println(curr);
      
      curr = curr.getPtr();
    }
  }
}
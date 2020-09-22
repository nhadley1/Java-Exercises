//LinkListTest.java
import java.util.Scanner;


public class LinkListTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up empty linkedList of strings.
    LinkList head = null;
    LinkList current = null;
    
    //Set up size of Linked List.
    System.out.print("Size: ");
    int size = keyboard.nextInt();
    
    keyboard.nextLine();
    
    //Allow user to fill Linked List
    for(int ctr = 1; ctr <= size; ctr++)
    {
      System.out.print("Enter a string: ");
      String str = keyboard.nextLine();
      
      LinkList next = new LinkList(str);
      
      //Linked List is empty.
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
    
    //Print List.
    LinkList curr = head;
    
    while(curr != null)
    {
      System.out.println(curr);
      
      curr = curr.getPtr();
    }
  }
}
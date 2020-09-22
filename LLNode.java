//LLNode.java
import java.util.Scanner;


public class LLNode
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up empty Linked list of integers.
    Node <Integer> head = null;
    Node <Integer> current = null;
    
    //Allow user to set up the size of Linked List.
    System.out.print("Number of integers to input into Linked List: ");
    int size = keyboard.nextInt();
    
    keyboard.nextLine();
    
    System.out.println("\nAdding integers to Linked List.");
    
    //Allow user to fill Linked List with integers.
    for(int ctr = 1; ctr <= size; ctr++)
    {
      //Input integer.
      System.out.print("Add integer to list: ");
      int nr = keyboard.nextInt();
      
      //Set up next Node.
      Node <Integer> next = new Node<>();
      
      next.setNodeItem(nr);
      
      //List is empty, add to beginning of list.
      if(head == null)
      {
        head = next;
      }
      else
      {
        current = head;
        
        while(current.getNextNode() != null)
        {
          current = current.getNextNode();
        }
        
        current.setNextNode(next);
      }
    }
    
    //Allow user to print LinkedList
    Node<Integer> curr = head;
    
    
    System.out.println("\nPrinting Linked List.");
    while(curr != null)
    {
      System.out.println(curr.getNodeItem());
      
      curr = curr.getNextNode();
    }
  }
}
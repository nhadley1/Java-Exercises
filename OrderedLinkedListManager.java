//OrderedLinkedListManager.java
import java.util.Scanner;


public class OrderedLinkedListManager
{
  //Constructor.
  public OrderedLinkedListManager()
  {
    head = null;
  }
  
       //Method to add to Linked list.
       public void addStudent(SimpleStudent student)
       { 
         Node<SimpleStudent> next = new Node<>();
         next.setNodeItem(student); 
     
         if(head == null)
         {
           // List is empty; next will be first node in list.
           head = next;
         }
         
         else
         {
           // List is not empty; find position for next in ordered linked list.
           if(student.compareTo(head.getNodeItem()) <= 0)
           {
             // Next goes before first node in list.
             next.setNextNode(head);
             head = next;    
           }
           
           else
           {
             // Next does not go at beginning of list; find its location in list.
             Node<SimpleStudent> current = head;
             Node<SimpleStudent> previous = null;
             
             // Traverse list to find next's position in list.
             while((current.getNextNode() != null) &&
                   (student.compareTo(current.getNodeItem()) > 0))
             {
               //Next goes later in list.
               previous = current;
               current = current.getNextNode();
             }
             
             // Determine if next goes between two nodes.
             if(student.compareTo(current.getNodeItem()) <= 0)
             {
               next.setNextNode(current);
               previous.setNextNode(next);
             }
             
             else
             {
               // Next goes at end of list.
               current.setNextNode(next);
             }
           }
         }
       }
       
       //PrintList.
       public void printList()
       {
         Node<SimpleStudent> current = head;
         
         if(head == null)
         {
           System.out.println("\nList is Empty!");
         }
         else
         {
           while(current != null)
           {
             System.out.println(current.getNodeItem());
             
             current = current.getNextNode();
           }
         }
       }  
  
  //Instance Variables.
  private Node <SimpleStudent> head;
}
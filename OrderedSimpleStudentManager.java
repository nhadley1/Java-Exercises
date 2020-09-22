//OrderedSimpleStudentNodeManager.java
//Nathan Hadley 11/4/18
//Class to manage a Linked List using nodes 
//that holds Simple Student objects.
  
  
public class OrderedSimpleStudentManager
{
  //Constructor.
  public OrderedSimpleStudentManager()
  {
    head = null;
  }
  
  //Method to add Simple Student to node in order.
  public void addStudent(SimpleStudent student)
  {
     Node <SimpleStudent> next = new Node<>();
     
     next.setNodeItem(student);
     
     if(head == null)
         {
           // List is empty; next will be first node in list.
           head = next;
         }
         
         else
         {
           // List is not empty; find position for next in ordered linked list.
           if(next.getNodeItem().compareTo(head.getNodeItem()) >= 0)
           {
             // Next goes before first node in list.
             next.setNextNode(head);
             head = next;    
           }
           
           else
           {
             // Next does not go at beginning of list; find its location in list.
             Node <SimpleStudent> current = head;
             Node <SimpleStudent> previous = null;
             
             // Traverse list to find next's position in list.
             while((current.getNextNode() != null) &&
                   (next.getNodeItem().compareTo(current.getNodeItem()) < 0))
             {
               //Next goes later in list.
               previous = current;
               current = current.getNextNode();
             }
             
             // Determine if next goes between two nodes.
             if(next.getNodeItem().compareTo(current.getNodeItem()) >= 0)
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
         //Method to print ordered linked list of Simple Student objects.
         public void printList()
         {
           Node <SimpleStudent> current = head;
           
           while(current != null)
           {
             System.out.println(current.getNodeItem());
             
             current = current.getNextNode();
           }
         }  
  
  
  //Instance Variables.
  private Node <SimpleStudent> head;
}

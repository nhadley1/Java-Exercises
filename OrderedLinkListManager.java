//OrderedLinkedListManager.java


public class OrderedLinkListManager
{
  //Constructor.
  OrderedLinkListManager()
  {
    head = null;
  }
  
  //Method to add String to linked list.
  public void addString(String str)
  {
    Node <String> next = new Node<>();
    
    next.setNodeItem(str);
    
    if(head == null)
    {
      head = next;
    }
    else
    {
      if(next.getNodeItem().compareTo(head.getNodeItem()) <= 0)
      {
        next.setNextNode(head);
        next = head; 
      }
      
      else
      {
        Node <String> previous = null;
        Node <String> current = head;
        
        while((current.getNextNode() != null) && (next.getNodeItem().compareTo(current.getNodeItem()) > 0))
        {
          previous = current;
          current = current.getNextNode();
        }
        
        if(next.getNodeItem().compareTo(current.getNodeItem()) <= 0)
        {
          next.setNextNode(current);
          previous.setNextNode(current);
        }
        else
        {
          current.setNextNode(next);
        }
      }
    }
  }
  
  //Method to print linked List.
  public void printList()
  {
    Node current = head;
    
    if(head == null)
    {
      System.out.println("\nList is empty.");
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
  private Node <String> head;
}
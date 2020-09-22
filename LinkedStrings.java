//LinkedStrings.java


public class LinkedStrings
{
  //Constructor.
  public LinkedStrings()
  {
    head = null;
  }
  
  //Method to add Strings to Linked List
  public void addString(String str)
  {
    //List is empty, add String to beginning of list.
    Nodes <String> next = new Nodes<>();
    
    next.setNodeItem(str);
    
    //List is empty, add String to beginning of the list.
     
  }
  
  
  
  //Instance Variables.
  private Nodes <String> head;
}
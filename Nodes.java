//Nodes.java

public class Nodes<T>
{
  //Constructor.
  public Nodes()
  {
    nextNode = null;
    nodeItem = null;
  }
  
  //Nodes get() methods.
  public Nodes<T> getNextNode()
  {
    return nextNode;
  }
  
  public T getNodeItem()
  {
    return nodeItem;
  }
  
  //Nodes set() methods.
  public void setNextNode(Nodes<T> next)
  {
    nextNode = next;
  }
  
  public void setNodeItem(T item)
  {
    nodeItem = item;
  }
  
  
  //Instance variables
  private Nodes<T> nextNode;
  private T nodeItem;
}
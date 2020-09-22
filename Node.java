//Node.java


public class Node <T>
{
  //Constructor.
  Node()
  {
    nodeItem = null;
    nextNode = null;
  }
  
  //Node's set() methods.
  public void setNextNode(Node<T> next)
  {
    nextNode = next;
  }
  
  public void setNodeItem(T item)
  {
    nodeItem = item;
  }  
  
  //Node's get() methods.
  public Node<T> getNextNode()
  {
    return nextNode;
  }
  
  public T getNodeItem()
  {
    return nodeItem;
  }
  
  
  //Instance Variables
  private Node <T> nextNode;
  private T nodeItem;
}
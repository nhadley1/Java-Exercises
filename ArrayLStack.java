//ArrayLStack.java
import java.util.ArrayList;

public class ArrayLStack
{
  //Constructor.
  public ArrayLStack(int size)
  {
    stack = new ArrayList<>(size);
    top = 0;
    stackSize = size;
  }
  
  //pop().
  public int pop() 
  {
    top--;
    int popped = stack.get(top);
    stack.remove(top);
    return popped;
  }
  
  //push().
  public void push(int nr)
  {
    stack.add(nr);
    top++;
  }
  
  //StackFull().
  public boolean stackFull()
  {
    if(top == stackSize)
    {
      return true;
    }
    else
    {
      return false;
    }
  }  
   
  //StackEmpty().
  public boolean stackEmpty()
  {
    if(top == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  //PrintStack()
  public void printStack()
  {
    for(int ctr = 0; ctr < stack.size(); ctr++)
    {
      System.out.println("Stack[" + ctr + "]: " + stack.get(ctr));
    }
  }
  //Instance Variables
  private ArrayList <Integer> stack;
  private int top;
  private int stackSize;
}
// IntStack.java
// Jim Jerkofsky  09/25/18
// Integer stack.
// Uses array list to store stack.
import java.util.ArrayList;

public class IntStack 
{
  // Constructor.
  public IntStack(int size)
  {
    stack = new ArrayList<Integer>(size);
	 top = 0;
    stackSize = size;
  }
  
  // Pop method.
  public int pop()
  {
    top--;
	 return stack.remove(0);
    
  }
  
  // Push method.
  public void push(int nr)
  {
    stack.add(0, nr);
	 top++;
  }
  
  // Stack full method.
  public boolean stackFull()
  {
    if(stackSize == stack.size())
	   return true;
	 else
	   return false;
  }
  
  // Stack empty method.
  public boolean stackEmpty()
  {
    if(top == 0)
	   return true;
	 else
	   return false;
  }
  
  // Print stack method.
  public void printStack()
  {
    for(int ctr = 0; ctr < top; ctr++)
	 {
	   System.out.println("Stack[" + ctr + "] = " + stack.get(top-ctr-1));
	 }
  }
  

  // Instance variables.
  private ArrayList<Integer> stack;
  private int top;
  private int stackSize;

}
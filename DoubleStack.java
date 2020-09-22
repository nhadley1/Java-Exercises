// DoubleStack.java
// Jim Jerkofsky  09/28/18
// Double stack.

public class DoubleStack 
{
  // Constructor.
  public DoubleStack(int size)
  {
    stack = new double[size];
	 top = 0;
  }
  
  // Pop method.
  public double pop()
  {
    top--;
	 return stack[top];
  }
  
  // Push method.
  public void push(double nr)
  {
    stack[top] = nr;
	 top++;
  }
  
  // Stack full method.
  public boolean stackFull()
  {
    if(top == stack.length)
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
	   System.out.println("Stack[" + ctr + "] = " + stack[ctr]);
	 }
  }
  

  // Instance variables.
  private double[] stack;
  private int top;

}

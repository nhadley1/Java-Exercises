//Stack.java


public class Stack
{
  //Constructor.
  public Stack(int size)
  {
    stack = new int[size];
    top = 0;
  }
  
  //pop().
  public int pop()
  {
    top--;
    return stack[top];
  }
  
  //push().
  public void push(int nr)
  {
    stack[top] = nr;
    top++;
  }
  
  //stackEmpty().
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
  
  //Stackfull().
  public boolean stackFull()
  {
    if(top == stack.length)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  //Print stack.
  public void printStack()
  {
    for(int ctr = 0; ctr < top; ctr++)
    {
      System.out.println("Stack[" + ctr + "]: " + stack[ctr]);
    }
  }
  
  //Instance Variables.
  private int[] stack;
  private int top;
}
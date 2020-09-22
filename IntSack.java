//IntSack.java
import java.util.Scanner;

public class IntSack
{
  //Constructor.
  public IntSack(int size)
  {
    stack = new int[size];
    top = 0;
  }
  
  //push()
  public void push(int nr)
  {
    stack[top]= nr; 
    top++;
  }
  
  //pop()
  public int pop()
  {
    top--;
    return stack[top];  
  }
  
  //stackFull()
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
  
  //stackEmpty()
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
    for(int ctr = 0; ctr < top; ctr++)
    {
      System.out.println("Stack[" + ctr + "]: " + stack[ctr]);
    }
  }

  
  //Instance Variables.
  private int[] stack;
  int top;
}
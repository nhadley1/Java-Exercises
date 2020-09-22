//IntStk.java
import java.util.ArrayList;

public class IntStk
{
  //Constructor.
  public IntStk(int size)
  {
    stk = new ArrayList <Integer>(size);
    top = 0;
    sz = size;
  }
  
  //push().
  public void push(int nr)
  {
    stk.add(nr);
    top++;
  }
  
  //pop().
  public int pop()
  {
    top--;
    int popped = stk.get(top);
    stk.remove(top);
    return popped;
  }
  
  //StackFull()
  public boolean stackFull()
  {
    if(top == sz)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  //StackEmpty()
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
      System.out.println("Stack[" + ctr + "]: " + stk.get(ctr));
    }
  }


  //Instance Variables.
  private ArrayList <Integer> stk;
  private int top;
  private int sz;
}
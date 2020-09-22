//StackInt.java
import java.util.ArrayList;


public class StackInt
{
  //Constructor.
  public StackInt(int size)
  {
    nrs = new ArrayList<>(size);
    top = 0;
    stackSize = size;
  }
  
  //Instance Variables.
  private ArrayList <Integer> nrs;
  private int top;
  private int stackSize; 
}
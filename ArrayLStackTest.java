//AListStack.java.
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLStackTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input size of Array List.
    System.out.print("Size: ");
    int size = keyboard.nextInt();
    
    //Set up object of AListStack class.
    ArrayLStack stk = new ArrayLStack(size);
    
    //Menu Driven Program to work with stack.
    int result = 0;
    
    boolean flag = true;
     
    while(flag)
    {
      System.out.println("\nChoose Menu option:");
      System.out.println("1)Pop");
      System.out.println("2)Push");
      System.out.println("3)Print Stack");
      System.out.println("0)Exit Menu");
      
      System.out.print("\nMenu selection: ");
      result = keyboard.nextInt();
      
      switch(result)
      {
        case 1:
        if(stk.stackEmpty())
        {
          System.out.println("\nStack Empty");
        }
        else
        {
          System.out.println("\nItem popped: " + stk.pop());
        }
        break;
        
        case 2:
        if(stk.stackFull())
        {
          System.out.println("\nStack Full");
        }
        else
        {
          System.out.print("\nItem to push: ");
          int nr = keyboard.nextInt();
          stk.push(nr);
        }
        break;
        
        case 3:
        if(stk.stackEmpty())
        {
          System.out.println("\nStack Empty.");
        }
        else
        {
          stk.printStack();
        }
        break;
        
        case 0:
        System.out.println("\nExit Menu.");
        flag = false;
        break;
        
        default:
        System.out.println("\nInvalid menu input.");
        break;


      }
      
      
    }
    
  }
}
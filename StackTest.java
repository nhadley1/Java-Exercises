//StackTest.java
import java.util.Scanner;


public class StackTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to set up size of stack.
    System.out.print("Size of stack: ");
    int size = keyboard.nextInt();
    
    //Set up Stack item.
    Stack intStack = new Stack(size);
    
    //Set up response.
    int response = -1;
    
    while(response != 0)
    {
      System.out.println("\nStack Menu: ");
      System.out.println("1] push: ");
      System.out.println("2] pop: ");
      System.out.println("3] print stack: ");
      System.out.println("0] Exit menu: ");
      System.out.print("Choice: ");
      response = keyboard.nextInt();
      
      switch(response)
      {
        case 1: 
        {
          if(intStack.stackFull())
          {
            System.out.println("\nStack Full!");
          }
          else
          {
            System.out.print("Input number to push: ");
            int nr = keyboard.nextInt();
            intStack.push(nr);
          }
          break;
        } 
           case 2: 
           {
             if(intStack.stackEmpty())
             {
               System.out.println("\nStack Empty!");
             }
             else
             {
               int nr = intStack.pop();
               System.out.println("\nNumber popped: " + nr);
             }
             break;
           }
          
          case 3:
          {
            if(intStack.stackEmpty())
             {
               System.out.println("\nStack Empty!");
             }
             else
             {
               System.out.println("\nPrinting stack:");
               intStack.printStack();
             }
             break;
          }
          
          case 0: 
          {
            System.out.println("\nExiting menu.");
            break;
          }
          
          default:
          {
            System.out.println("\nInvalid input.");
          }
      }
    }
  }
}
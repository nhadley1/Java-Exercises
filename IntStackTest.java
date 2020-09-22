// IntStackTest.java
// Jim Jerkofsky  09/25/18
// Menu-driven program to test IntStack class.
import java.util.Scanner;

public class IntStackTest
{
  public static void main(String[] args)
  {
    // Set up Scanner object for keyboard input.
	 Scanner keyboard = new Scanner(System.in);
	 
	 // Input size of stack desired.
	 System.out.print("Size of stack:  ");
	 int limit = keyboard.nextInt();
	 
	 // Set up IntStack object.
	 IntStk stk = new IntStk(limit);
	 
	 // Menu for testing IntStack object.
	 boolean flag = true;
	 
	 while(flag)
	 {
	   int result = 0;
		
		// Print menu.
		System.out.println("\n");
		System.out.println("1)  Push");
		System.out.println("2)  Pop");
		System.out.println("3)  Print stack");
		System.out.println("0)  Exit menu");
		System.out.print("Selection:  ");
		result = keyboard.nextInt();
		
		switch(result)
		{
		  //Push an item onto stack.
		  case 1:
		    if(stk.stackFull())
			 {
			   System.out.println("\nStack is full.");
			 }
			 else
		    {
			   System.out.print("\nItem to push:  ");
			   int nr = keyboard.nextInt();
			   stk.push(nr);
			 }
			 break;
		  
		  // Pop an item off stack.
		  case 2:
		    if(stk.stackEmpty())
			 {
			   System.out.println("\nStack is empty.");
			 }
			 else
			 {  
			   int nr = stk.pop();
			   System.out.println("\nItem popped:  " + nr);
			 }
			 break;
		
		  // Print current contents of stack.
		  case 3:
		    if(stk.stackEmpty())
			    System.out.println("\nStack is empty.");
			 else
			 {
		      System.out.println("\nCurrent contents of stack:");
			   stk.printStack();
		    }
			 break;
		  
		  // Exit menu.
		  case 0:
		    flag = false;
		    break;
			 
		  // Invalid menu selection.
		  default:
		     System.out.println("\nInvalid menu selection.");
           break;
		}
    }
  }
}
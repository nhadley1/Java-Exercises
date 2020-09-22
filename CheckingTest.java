// CheckingTest.java
// Jim Jerkofsky  11/17/18
// Program to test Checking and InsufficientFundsException classes.
// Exception handled in Checking's withdraw method.
import java.util.Scanner;


public class CheckingTest
{
  public static void main(String[] args)
  {
    // Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Input initial balance for checking account.
    System.out.print("Initial deposit:   $");
    int amount = keyboard.nextInt();
    
    // Set up checking account.
    Checking myAccount = new Checking(amount);
    
    // Allow user to make deposits, withdrawals, check current balance.
    int response = 1;
    
    while(response != 0)
   {
     System.out.println("\nMenu:");
     System.out.println("1)  Make deposit.");
     System.out.println("2)  Make withdrawal.");
     System.out.println("3)  Check current balance.");
     System.out.println("0)  Exit menu.");
     
     System.out.print("Enter choice:  ");
     response = keyboard.nextInt();
     
     switch(response)
     {
       // Deposit.
       case 1:
         System.out.print("\nAmount of deposit:  $");
         amount = keyboard.nextInt();
         myAccount.deposit(amount);
         break;
       
       // Withdrawal.  
       case 2:
         System.out.print("\nAmount of withdrawal:  $");
         amount = keyboard.nextInt();
         myAccount.withdraw(amount);
         break;
         
       // Print current balance.
       case 3:
         System.out.println("\nCurrent balance:  $" + 
                 myAccount.getBalance() + "\n");
         break;
         
       // Exit menu.
       case 0:
         break;
         
       // Invalid menu selection.
       default:
         System.out.println("\nInvalid menu selection.\n");
         break;
      }

    }
   
    
    // Closing message.
    System.out.println("\n\nFinal balance:  $" + myAccount.getBalance()); 
  }
}
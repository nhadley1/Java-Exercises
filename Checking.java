// Checking.java
// Jim Jerkofsky  11/17/18
// Class that models a checking account.


public class Checking
{
  // Constructor.
  public Checking(int amount)
  {
    balance = amount;
  }
  
  // Deposit method.
  public void deposit(int amount)
  {
    balance = balance + amount;
  }
  
  // Withdrawal method.
  // If amount of withdrawal exceeds current balance,
  //   InsufficientFundsException thrown.
  public void withdraw(int amount)
  {
    try
    {
      if(amount > balance)
      {
        throw new InsufficientFundsException("\n\nWithdrawal of $" +
           amount + " exceeds balance of $" + balance + ".\n");
      }
      else
      {
        balance = balance - amount;
      }
    }
    catch(InsufficientFundsException except)
    {
      System.out.println(except);
    }
    
  }
  
  // Method to return current balance.
  public int getBalance()
  {
    return balance;
  }
  
  // Instance variables.
  private int balance;
}
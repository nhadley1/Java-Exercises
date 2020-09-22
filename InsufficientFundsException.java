// InsufficientFundsException.java
// Jim Jerkofsky  11/17/19
// Exception thrown when attempt made to withdraw amount from
//   checking account exceedng current balance.


public class InsufficientFundsException extends IllegalArgumentException
{
  // Default constructor.
  public InsufficientFundsException()
  {
  
  }
  
  // Full constructor.
  public InsufficientFundsException(String reason)
  {
    super(reason);
  }
}
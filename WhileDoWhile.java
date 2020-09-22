import java.util.Scanner;


public class WhileDoWhile
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Input target number.
    System.out.print("Enter target number: ");
    int target = keyboard.nextInt();
    
    //Allow user to input numbers.
    int nr = target + 1;
    
    while(nr != target)
    {
      System.out.print("Enter number: ");
      nr = keyboard.nextInt();
    }
    
    System.out.println("\nLoop ended, target number entered.");
    
    int nr2 = target+1;
    
    System.out.println("");
    do
    {
      System.out.print("Enter number: ");
      nr2 = keyboard.nextInt();
    }
    while(nr2 != target);
    
    System.out.println("\nLoop ended, target number entered.");
  }
}
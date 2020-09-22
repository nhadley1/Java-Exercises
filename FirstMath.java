import java.util.Scanner;

public class FirstMath
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input number and power to raise it to.
    System.out.print("Enter base number: ");
    double base = keyboard.nextDouble();
    
    System.out.print("Enter exponent: ");
    double exp = keyboard.nextDouble();
    
    double power = Math.pow(base,exp);
    
    System.out.print("Number raised to power: " + power);
  }
}
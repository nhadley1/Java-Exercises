//Practice.java
import java.util.Scanner;

public class Practice
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input integers.
    System.out.print("Input integer: ");
    int nr1 = keyboard.nextInt();
    
    System.out.print("Input integer: ");
    int nr2 = keyboard.nextInt();
    
    int sum = nr1 + nr2;
    
    System.out.println("\nSum: " + sum);
  }
}
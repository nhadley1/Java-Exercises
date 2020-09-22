//HasNext.java
import java.util.Scanner;

public class HasNext
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Input Integer: ");
    
    while(!keyboard.hasNextInt())
    {
      System.out.print("Only integer values allowed. Try again: ");
      keyboard.next();
    }
    
    int age = keyboard.nextInt();
    
    System.out.println("Age = " + age);
    
  }
}
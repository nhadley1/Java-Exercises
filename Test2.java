//Test2
import java.util.Scanner;


public class Test2
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Input a string.
    System.out.print("Input a string: ");
    String str = keyboard.nextLine();
    
    //Print string.
    System.out.println("\nString input: " + str);
    
    String upper = str.toUpperCase();
    
    System.out.println("\nString in all upper case: " + upper);
    
  }
}
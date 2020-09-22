// ReverseString.java
// Jim Jerkofsky  11/24/18
// Recursive method to reverse string.
import java.util.Scanner;


public class ReverseString
{
  public static void main(String[] args)
  {
    // Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Print opening message.
    System.out.println("This program will use a recursive method to reverse a string:  ");
    
    // Input string to reverse.
    System.out.print("\nInput a string:  ");
    String str = keyboard.nextLine();
    
    // Print back string input.
    System.out.println("\nString input:   " + str);
  
  
    // Call method to reverse string.
    String str2 = reverseString(str);
  
    // Print back reversed string.
    System.out.println("\nThe string in reverse order:  " + str2);
  }
  
  
  // Recursive method to reverse string.
  public static String reverseString(String s)
  {
     if(s.length() == 1)
       return s;
       
     else
     {
       return reverseString(s.substring(1)) + s.substring(0, 1);
     }
  }
}

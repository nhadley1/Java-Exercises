//Palimdrome.java
import java.util.Scanner;

public class Palindrome
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input String.
    System.out.print("Enter String: ");
    String str = keyboard.nextLine();
    
    if(palindrome(str))
    {
      System.out.println("\nPalindrome.");
    }
    else
    {
      System.out.println("\nNot Palindrome.");
    }
  }
  
  //Method to determine whether string is a palindrome.
  public static boolean palindrome(String str)
  {
    if(str.length() == 0 || str.length() == 1)
    {
      return true;
    }
    
    // String contains more than one one character.
    if(str.substring(0,1).compareTo(str.substring(str.length()-1)) != 0)
    {
      return false;
    }
    
    else
    {

      return palindrome(str.substring(1, str.length()-1));
    }
  }
}
//Order strings
import java.util.Scanner;


public class order
{
  public static void main(String[] args)
  {
    //Set up Scanner object for user input
    Scanner keyboard = new Scanner(System.in);
    
    //Type two strings
    System.out.print("Type a string: ");
    String str1 = keyboard.nextLine();
    
    System.out.print("Type a string: ");
    String str2 = keyboard.nextLine();
    
    if(str1.compareToIgnoreCase(str2) <= 0)
    {
      System.out.println("\nLexicographical Order Ignore Case: " + str1 + " " + str2);
    }
    
    else
    {
      System.out.println("\nLexicographical Order Ignore Case: " + str2 + " " + str1);
    }
    
    if(str1.compareTo(str2) <= 0)
    {
      System.out.println("\nLexicographical Order Ignore Case: " + str1 + " " + str2);
    }
   
    else
    {
      System.out.println("\nLexicographical Order Ignore Case: " + str2 + " " + str1);
    }

  }
}
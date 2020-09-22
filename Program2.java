//Program2.java
//Nathan Hadley 02/05/2018
//User inputs string and program prints the String
//down the page and determines number of upper-case
//letters in the string
import java.util.Scanner;


public class Program2
{
  public static void main(String[] args)
  {
     //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Input a string.
    System.out.print("Type a string: ");
    String str = keyboard.nextLine();
    
    //Print back string input.
    System.out.println("\nString input: " + str);
     
    //Determine the number of upper-case characters in the string
    int cap = 0;
    
    for(int ctr = 0; ctr < str.length(); ctr++)
    {
      char ltr = str.charAt(ctr);
      
      if(ltr >= 'A' && ltr <= 'Z')
      {
        cap++;
      }
    }
    
    //Print number of upper-case characters.
    System.out.println("\nString input contains " + cap + " upper-case characters.");
    
    //Print text vertically.
    System.out.println("\nPrinting string down page using substring():");
    int ctr = 0;
    
    for(ctr = 0; ctr < str.length(); ctr++)
    {
      System.out.println(str.substring(ctr,ctr + 1));
    }
  }
}
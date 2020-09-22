//DownPage.java
import java.util.Scanner;


public class DownPage
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input String.
    System.out.print("Input String: ");
    String str = keyboard.nextLine();
    
    //Print String.
    System.out.println("\nString Input: " + str);
    
    //Print String down page.
    System.out.println("\nPrinting word down page:");
      
    for(int ctr = 0; ctr < str.length(); ctr ++)
    {
       System.out.println(str.charAt(ctr));
    }
  }
}
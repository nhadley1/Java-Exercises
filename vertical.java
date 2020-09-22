//Vertical
//Print Vertically down page.
import java.util.Scanner;


public class vertical
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);
    
    //input a string
    System.out.print("Type a string: ");
    String str = keyboard.nextLine();
    
    //print text vertically
    for(int ctr = 0; ctr < str.length(); ctr++)
    {
      System.out.println(str.charAt(ctr));
    }
  }
}

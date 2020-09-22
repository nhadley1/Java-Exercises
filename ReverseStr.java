//ReverseStr.java
import java.util.Scanner;


public class ReverseStr
{
  public static void main(String[] args)
  {
    //Set up Scanner objetc for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input a string.
    System.out.print("String: ");
    String str = keyboard.nextLine();
    
    String str2 = reverse(str);
    
    System.out.println(str2);
  }
  
  //Method to reverse string.
  public static String reverse(String s)
  {
    if(s.length() == 0)
    {
      return s;
    }
    else
    {
      return reverse(s.substring(1)) + s.substring(0,1);
    }
  }
  
}
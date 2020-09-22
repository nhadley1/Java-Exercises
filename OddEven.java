import java.util.Scanner;


public class OddEven
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input integer
    System.out.print("Type an integer: ");
    int nr = keyboard.nextInt();
    
    //Determine if integer is even or odd
    if((nr / 2) * 2 == nr)
      System.out.println("\nThe integer " + nr + " is even.");
      
    else
      System.out.println("\nThe integer " + nr + " is odd.");
  } 
}
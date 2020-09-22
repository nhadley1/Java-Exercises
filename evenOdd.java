import java.util.Scanner;

public class evenOdd
{
public static void main(String[] args)
  {
    //Set up keyboard object for user input
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Type an integer: ");
    int x = keyboard.nextInt();
    
    if((x / 2) * 2 == x)
      System.out.println("\n" + x + " is even."); 
    else 
      System.out.println("\n" + x + " is odd."); 
  }
}

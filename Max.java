import java.util.Scanner;


public class Max
{
  public static void main(String[] args)
  {
  //Set up Scanner object for keyboard input
  Scanner keyboard = new Scanner(System.in);
  
  //Input two integers
  System.out.print("Type an integer: ");
  int nr1 = keyboard.nextInt();
  
  System.out.print("Type an integer: ");
  int nr2 = keyboard.nextInt();
  
  int larger = max(nr1, nr2);
  
  System.out.println("\nLargest of " + nr1 + " and " + nr2 + " : " +  larger);
  
  }
  public static int max(int a, int b)
  {
  if(a > b)
    return a;
    
  else
    return b;
  }  
  
}
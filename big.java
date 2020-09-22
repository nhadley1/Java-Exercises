import java.util.Scanner;

public class big
{
  public static void main(String[] args)
  {
  //Set up Scanner object for keyboard input
  Scanner keyboard = new Scanner(System.in);
  
  //Input three integers
  System.out.print("Type an integer: ");
  int nr1 = keyboard.nextInt();
  
  System.out.print("Type an integer: ");
  int nr2 = keyboard.nextInt();
  
  System.out.print("Type an integer: ");
  int nr3 = keyboard.nextInt();
  
  if(nr1 + nr2 == nr3)
    System.out.print("\nNumber 1 + Number2 = Number 3"); 
  else if(nr1 + nr3 == nr2)
    System.out.print("\nNumber 1 + Number3 = Number 2");
  else if(nr2 + nr3 == nr1)
    System.out.print("\nNumber 2 + Number3 = Number 1");
  else
    System.out.print("\nTwo numbers don't add up to the other.");
  }
}
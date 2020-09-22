import java.util.Scanner;

public class Dur
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input integer values.
    System.out.print("Input first integer: ");
    int nr1 = keyboard.nextInt();
    
    System.out.print("Input second integer: ");
    int nr2 = keyboard.nextInt();
    
    //Call Method to determine max.
    int maximum = maxInt(nr1, nr2);
    
    System.out.println("Max: " + maximum);
  }
  
  //Method to find max integer.
  public static int maxInt(int nr1, int nr2)
  {
    int max = 0;
  
    if(nr1>nr2)
    {
      max = nr1;
    }
    
    else
    {
      max = nr2;
    }
    
    return max;
  }
}
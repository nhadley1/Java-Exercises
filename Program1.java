//Program1.java
//Nathan Hadley 1/23/2018
//Product if Second integer is positive, sum if otherwise, determine if integers are distinct or equal
import java.util.Scanner;


public class Program1
  {
    public static void main(String[] args)
    {
      //Set up Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //input three integers from keyboard.
      System.out.print("Input first integer:  ");
      int nr1 = keyboard.nextInt();
      
      System.out.print("Input second integer: ");
      int nr2 = keyboard.nextInt();
      
      System.out.print("Input third integer:  ");
      int nr3 = keyboard.nextInt();
      
      //Determine if second integer is positive, to multiply, or negative to add and print
      if(nr2 > 0)
        {
        int product = nr1 * nr2 * nr3;
        System.out.println("\n" + nr1 + " * " + nr2 + " * " + nr3 + " = " + product);
        }
      else
        {
        int sum = nr1 + nr2 + nr3;
        System.out.println("\n" + nr1 + " + " + nr2 + " + " + nr3 + " = " + sum);
        }
        
      //Determine if integers are distinct or equal and print
      if((nr1 != nr2)&&(nr1 != nr3)&&(nr2 != nr3))
        System.out.println("\nThe three integers are all distinct.");
      else if((nr1 == nr2)&&(nr2 == nr3))
        System.out.println("\nAll three of the integers equal.");
      else
        System.out.println("\nExactly two of the integers are equal.");
    }
  }
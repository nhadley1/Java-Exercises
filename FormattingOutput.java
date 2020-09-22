// FormattingOutput.java
// Jim Jerkofsky  04/15/18
// Experimenting with formatting numeric output.
import java.util.Scanner;


public class FormattingOutput
{
  public static void main(String[] args)
  {
    // Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Input two floating-point numbers.
    System.out.print("First floating-point value:  ");
    double nr1 = keyboard.nextDouble();
    
    System.out.print("Second floating-point value: ");
    double nr2 = keyboard.nextDouble();
    
    // Calculate quotient:  nr1/nr2.
    double quotient = nr1/nr2;
    
    // Print unformatted quotient.
    System.out.println("\n" + nr1 + "/" + nr2 + " = " + quotient);
/*    
    // Print using printf() for two decimal places.
    System.out.print("\nPrinting with %.2f format: " + nr1 + "/" + nr2 + " = ");
    System.out.printf("%.2f", quotient);
*/
   
    System.out.print("\nPrinting with %.2f format:  ");
    System.out.printf("%.2f/%.2f = %.2f", nr1, nr2, quotient);


  }
}
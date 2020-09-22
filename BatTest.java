//BatTest.java
import java.util.Scanner;


public class BatTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Input umber of bats to input.
    System.out.print("Input number of Bats to set up: ");
    int nrBats = keyboard.nextInt();
    
    //Set up Bat Array.
    ArrayOfBat bats = new ArrayOfBat(nrBats);
    
    //Call method to fill bat array.
    System.out.println("\nEnter Bat's information");
    bats.fillBatArray();
    
    //Call method to print bat array.
    System.out.println("\nBats currently in array: ");
    bats.printBatArray();
    
    
    
    
  }
}
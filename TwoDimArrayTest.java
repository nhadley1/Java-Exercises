//TwoDimArrayTest.java
//Nathan Hadley 9/9/2018
//Tests the TwoDimArray class.
import java.util.Scanner;

public class TwoDimArrayTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input number of rows and columns.
    System.out.print("Enter number of rows in array:    ");
    int rows = keyboard.nextInt();
    
    System.out.print("Enter number of columns in array: ");
    int columns = keyboard.nextInt();
    
    //Set up array. 
    int[][] nrs = new int[rows][columns];
    
    //Set up object of TwoDimArray class.
    TwoDimArray twoDim = new TwoDimArray(rows, columns);
    
    //Call method to fill array with integers.
    System.out.println("\nFill array with integers: ");
    twoDim.fillArray(nrs);
    
    //Call method to print contents of array.
    System.out.println("Contents of array: ");
    twoDim.printArray();
    
    //Call method to sum integers in array and print.
    System.out.println("\nSum of integers in array: " + twoDim.sumArray(nrs));
    
    //Call method to determine largest integer in array and print.
    System.out.println("\nLargest integer in array: " + twoDim.largestInArray(nrs));
    
    System.out.println();
    //Call method to determine if array is a square and print result.
    //If true, call method to sum integers on the main diagonal.
    if(twoDim.isSquare(rows, columns) == true)
    {
      System.out.println("Array is a square:\nSum of integers on main diagonal: " + twoDim.sumDiagonal(nrs));
    }
    else
    {
      System.out.println("Array is not a square, no main diagonal.");
    }
    
  }
}
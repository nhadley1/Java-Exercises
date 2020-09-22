//Nathan Hadley
//anti-diag.java
//Sums anti-diagonal of a square array (Right to left).
import java.util.Scanner;

public class AntiDiag
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to enter nr. of rows and columns.
    System.out.print("Enter number of rows: ");
    int rows = keyboard.nextInt();
    
    System.out.print("Enter number of columns: ");
    int columns = keyboard.nextInt();
    
    //Set up 2-D array.
    int[][] nrs = new int[rows][columns];
    
    //Allow user to fill array.
    for(int ctr1 = 0; ctr1 < rows; ctr1++)
    {
      for(int ctr2 = 0; ctr2 < columns; ctr2++)
      {
        System.out.print("Cell[" + ctr1 + "][" + ctr2 + "]:");
        nrs[ctr1][ctr2] = keyboard.nextInt();
      }
    }
    
    System.out.println();
    
    //Print Array.
    for(int ctr1 = 0; ctr1 < rows; ctr1++)
    {
      for(int ctr2 = 0; ctr2 < columns; ctr2++)
      {
        System.out.println("Cell[" + ctr1 + "][" + ctr2 + "]:" + nrs[ctr1][ctr2]);
      }
    }
    
    //Find sum of anti-diagonal.
    if(rows == columns)
    {
      int sum = 0;
       
      for(int ctr1 = 0; ctr1 < rows; ctr1++)
      {
        for(int ctr2 = 0; ctr2 < columns; ctr2++)
        {
          if(rows-1 == ctr1+ctr2)
          {
            sum = sum + nrs[ctr1][ctr2];
          }
        }
      }
      System.out.println("\nAnti-Diagonal Sum: " + sum);
    }

    
  }
}
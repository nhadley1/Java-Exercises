//TwoDimArray.java
//Nathan Hadley 9/9/2018
//Class to set up two dimensional integer array
//Methods to:
//Fill array.
//Print array.
//Sum array.
//Find largest integer.
//Determine if array is square.
//Sum main diagonal if array is square.
import java.util.Scanner;

public class TwoDimArray
{
  //Constructor.
  public TwoDimArray(int rows, int columns)
  {
    nrs = new int[rows][columns];
  }
  
  //Method to fill existing array.
  public void fillArray(int[][]array)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
  
    for(int ctr1 = 0; ctr1 < array.length; ctr1++)
    {
      for(int ctr2 = 0; ctr2 < array[ctr1].length; ctr2++)
      {
        System.out.print("Cell[" + ctr1 + "][" + ctr2 + "]: ");
        array[ctr1][ctr2] = keyboard.nextInt();
      }
      System.out.println();
    }
  }
  
  //Method to print array.
   public void printArray()
  {
    for(int ctr1 = 0; ctr1 < nrs.length; ctr1++)
    {
      for(int ctr2 = 0; ctr2 < nrs[ctr1].length; ctr2++)
      {
        System.out.print(nrs[ctr1][ctr2] + "\t");
      }
      System.out.println(); 
    } 
  }
  
  //Method to determine sum of integers in array.
  public int sumArray(int[][]array)
  {
    int sum = 0;
    for(int ctr1 = 0; ctr1 < array.length; ctr1++)
    {
      for(int ctr2 = 0; ctr2 < array[ctr1].length; ctr2++)
      {
        sum = array[ctr1][ctr2] + sum;
      }
    }
    return sum; 
  }

  //Method to determine largest integer in array.
  public int largestInArray(int[][]array)
  {
    int largest = array[0][0];
    
    for(int ctr1 = 0; ctr1 < array.length; ctr1++)
    {
      for(int ctr2 = 0; ctr2 < array[ctr1].length; ctr2++)
      {
        if(array[ctr1][ctr2] > largest)
        {
          largest = array[ctr1][ctr2];
        }
      }
       
    }
    
    return largest; 
  }
  
  //Method to determine if array is a square.
  public boolean isSquare(int rows, int columns)
  {
    if(rows == columns)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
    
  //Method to sum elements of main diagonal.
  public int sumDiagonal(int[][]array)
  {
    int sum = 0;
    
    for(int ctr1 = 0; ctr1 < array.length; ctr1++)
    {
      {
        for(int ctr2 = 0; ctr2 < array[ctr1].length; ctr2++)
        {
          if (ctr1 == ctr2)
          {
            sum = array[ctr1][ctr2] + sum;
          }
        }
      }
    }
    return sum;
  }  

  
  //Instance Variables.
  private int[][] nrs;
}

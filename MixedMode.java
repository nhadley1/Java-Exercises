import java.util.Scanner;


public class MixedMode
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Input size of integer array.
    System.out.print("Number of integers to store in array: ");
    int limit = keyboard.nextInt();
    
    //Set up array to hold integers.
    int[] nrs = new int[limit];
    
    //Call Method to fill array.
    fillArray(nrs);
    
    //Call Method to print array.
    printArray(nrs);
    
    //Call Method to find average.
    double avg = findAvg(nrs);
    
    //Print average.
    System.out.println("\nAverage of array: " + avg);
  }
  //Method to find average of integers in array.
  public static double findAvg(int[] array)
  {
    int sum = 0; 
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      sum = array[ctr] + sum;
    }
     
    double average = 1.0 * sum / array.length;
    
    return average;
  }
  
  //Method to fill array
  public static void fillArray(int[] array)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard2 = new Scanner(System.in);
    
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      System.out.print("Integer #" + (ctr+1) + ": ");
      array[ctr] = keyboard2.nextInt();
    }
  }
  
  //Method to print array.
  public static void printArray(int[] array)
  {
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      System.out.println("Integer #" + (ctr+1) + ": " + array[ctr]);
    }
  }
}

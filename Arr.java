//arr.java
import java.util.Scanner;


public class Arr
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);
    
    //Input number of integers to store.
    System.out.print("Number of integers to store: ");
    int limit = keyboard.nextInt();
    
    keyboard.nextLine();
    
    //Set up array to hold integers.
    int nrs[] = new int[limit];
   
    //Input Numbers
    for(int ctr = 0; ctr < nrs.length; ctr++)
    {
      System.out.print("Integer #" + (ctr+1) + ": ");
      nrs[ctr] = keyboard.nextInt();
    }
    
    //Print array.
    for(int ctr = 0; ctr < nrs.length; ctr++)
    {
        
      System.out.print("\nArray[" + ctr + "]: " + nrs[ctr]);
    }
    
    //Call Max Method
    int max = maximum(nrs);
    
    //Print max value in array.
    System.out.println();
     
    System.out.println("\nMax Value: " + max);
    
    //Call method to average array.
    System.out.println("\nAverage: " + averageArray(nrs));
  }
  
  //Method to find max value in array.
  public static int maximum(int array[])
  {
    int maxVal = array[0];
    
    for(int ctr = 1; ctr < array.length; ctr++)
    {  
      if(array[ctr] > maxVal)
      {
        maxVal = array[ctr];
      }
    }
    return maxVal;
  }
  
    //Method to average numbers in array
  public static double averageArray(int[] array)
  {
    int sum = 0;
    
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      sum = array[ctr] + sum;
    }
    double avg = sum / array.length;
    
    return avg;
  }
  
}
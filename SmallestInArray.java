//Smallest in array
import java.util.Scanner;


public class SmallestInArray
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);
    
    //Input number of integers to store.
    System.out.print("Number of integers to store: ");
    int limit = keyboard.nextInt();
    
    //Set up array to hold integers.
    int nrs[] = new int[limit]; 
    
    //Call method to fill array.
    fillArray(nrs);
    
    //Call Method to print Integers.
    System.out.println("\nIntegers input:");
    printArray(nrs);
    
    //Call method to determine smallest and print.
    int smNr = smallest(nrs);
    
    System.out.println("\nSmallest: " + smNr);
    
    //Call Method to determine number of smallest and print.
    int nrSm = nrSmallest(nrs);
    
    System.out.println("\nNumber of times smallest number occurs: " + nrSm);  
  }
  //Method to fill integer array.
  public static void fillArray(int[] array)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard2 = new Scanner(System.in);
    
    //Input array
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      System.out.print("Integer #" + (ctr+1) + ": ");
      array[ctr] = keyboard2.nextInt();
    } 
  }
  
  //Method to print integer array
  public static void printArray(int[] array)
  {
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      System.out.println("Integer #" + (ctr+1) + ": " + array[ctr]);
    }
  }
  
  //Method to determine smallest value in array.
  public static int smallest(int[] array)
  {
    int sm = array[0];
    
    for(int ctr = 1; ctr < array.length; ctr++)
    {
      if(array[ctr] < sm)
      {
        sm = array[ctr];
      }
    }
    return sm;
  }
  
  //Method to determine how many times smallest value occurs in array.
  public static int nrSmallest(int[] array)
  {
    int nrSm = 0;
    int sm = array[0];
  
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      if(array[ctr] < sm)
      {
        sm = array[ctr];
      } 
    }
    
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      if(array[ctr] == sm)
      {
        nrSm++;
      }
    }
    return nrSm;
  }
}
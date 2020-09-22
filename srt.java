//Srt.java
import java.util.Scanner;

public class srt
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up size of array.
    System.out.print("Size of array: ");
    int limit = keyboard.nextInt();
    
    //Set up integer array.
    int[] nrs = new int[limit];
    
    //Fill array.
    for(int ctr = 0; ctr < nrs.length; ctr++)
    {
      System.out.print("Nr#" + (ctr+1) + ": ");
      nrs[ctr] = keyboard.nextInt();
    }
    
    //Print array unsorted.
    for(int ctr = 0; ctr < nrs.length; ctr++)
    {
      System.out.println("Nr#" + (ctr+1) + ": " + nrs[ctr]);
    }
    
    //Sort array.
    int temp = 0;
    
    for(int ctr1 = 0; ctr1 < (nrs.length - 1); ctr1++)
    {
      for(int ctr2 = 0; ctr2 < (nrs.length - 1); ctr2++)
      {
        if(nrs[ctr2] > nrs[ctr2+1])
        {
          temp = nrs[ctr2];
          
          nrs[ctr2] = nrs[ctr2+1];
          
          nrs[ctr2+1] = temp;
        }
      }
    }
    
    //Print Sorted array.
    for(int ctr = 0; ctr < nrs.length; ctr++)
    {
      System.out.println("Nr#" + (ctr+1) + ": " + nrs[ctr]);
    }
  }
}
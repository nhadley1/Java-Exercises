import java.util.Scanner;


public class Sorting
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up number of elements in array.
    System.out.print("Size of array: ");
    int limit = keyboard.nextInt();
    
    //Set up integer array.
    int[] nrs = new int[limit];
    
    //Call method to fill array.
    fillArray(nrs);
    
    //Call Method to print array.
    System.out.println("\nCurrent contents of array: ");
    printArray(nrs);
    
    //Call Bubble sort method.
    bubbleSort(nrs);
    System.out.println("\nSorted array: ");
    printArray(nrs);  
  }
  
  //Method to fill array.
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
  
  //Method to sort array.
  public static int[] bubbleSort(int[] array)
  {
    int temp = 0;
    
    for(int ctr = 0; ctr < array.length-1; ctr++)
    {
      for(int ctr2 = 0; ctr2 < array.length-1; ctr2++)
      {
        if(array[ctr2] > array[ctr2+1])
          {
            temp = array[ctr2];
            array[ctr2] = array[ctr2+1];
            array[ctr2+1] = temp;
          }
      }
    }
    return array;
  }
}

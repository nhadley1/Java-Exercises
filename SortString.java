import java.util.Scanner;


public class SortString
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up size of array
    System.out.print("Size of array: ");
    int limit = keyboard.nextInt();
    
    //Set up array to hold strings.
    String[] strs = new String[limit];
    
    //Call Method to fill array.
    fillArray(strs);
    
    //Call Method to print array.
    System.out.println("\nCurrent contents of array: ");
    printArray(strs);
    
    //Call Method to alphabetize array.
    alphaSort(strs);
    System.out.println("\nAlphabetical order: ");
    printArray(strs);
  }
  
  //Method to fill array.
  public static void fillArray(String[] array)
  { 
    //Set up Scanner object for keyboard input.
    Scanner keyboard2 = new Scanner(System.in);
    
    for(int ctr = 0; ctr < array.length; ctr++)
      {
        System.out.print("String #" + (ctr+1) + ": ");
        array[ctr] = keyboard2.nextLine();
      }
  }
  
  //Method to print array.
  public static void printArray(String[] array)
  {
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      System.out.println("String #" + (ctr+1) + ": " + array[ctr]);
    }
  }
  
  //Method to sort Strings alphabetically.
  public static String[] alphaSort(String[] array)
  {
    String temp = "";
    
    for(int ctr = 0; ctr < array.length-1; ctr++)
    {
      for(int ctr2 = 0; ctr2 < array.length-1; ctr2++)
      {
        if(array[ctr2].compareToIgnoreCase(array[ctr2+1]) > 0)
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
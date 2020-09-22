//Program3WMeth
import java.util.Scanner;


public class Program3WMeth
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Number of Strings to store in array.
    System.out.print("Store how many strings in array: ");
    int limit = keyboard.nextInt();
    
    //Set up arry to hold strings.
    String[] strs = new String[limit];
    
    //Call Method to fill array.
    fillArray(strs);
    
    //Call Method to print array.
    System.out.println("\nStrings Input: ");
    printArray(strs);
    
    //Call Method to determine # upper-case, lower-case and spaces.
    int nrUp = nrUpperCase(strs);
    System.out.println("\nNumber of upper-case: " + nrUp);
     
    int nrLow = nrLowerCase(strs);
    System.out.println("Number of lower-case: " + nrLow);
    
    int nrSp = nrSpaces(strs);
    System.out.println("Number of spaces:     " + nrSp);
    
    //Call Method to determine the longest string in array and its length.
    String longestStr = findLongest(strs);
    
    System.out.println("\nLongest String: " + longestStr);
    System.out.println("\nLength of longest String: " + longestStr.length());
  }
  
  //Method to fill String array.
  public static void fillArray(String[] array)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard2 = new Scanner(System.in);
  
    for(int ctr = 0; ctr < array.length; ctr++)
      {
        System.out.print("String #" + (ctr + 1) + ": ");
        array[ctr] = keyboard2.nextLine();
      }
  }
  
  //Method to print String array.
  public static void printArray(String[] array)
  {
    for(int ctr = 0; ctr < array.length; ctr++)
      System.out.println("String #" + (ctr + 1) + ": " + array[ctr]);
  }
  
  //Method to count upper-case characters in strings of array.
  public static int nrUpperCase(String[] array)
  { 
    int nrUpper = 0;
  
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      for(int ctr2 = 0; ctr2 < array[ctr].length(); ctr2++)
        {
          char ch = array[ctr].charAt(ctr2);
        
          if(Character.isUpperCase(ch))
          {
            nrUpper++;
          }
        }
    }
    return nrUpper;
  }
  //Method to count lower-case characters in strings of array.
  public static int nrLowerCase(String[] array)
  { 
    int nrLower = 0;
  
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      for(int ctr2 = 0; ctr2 < array[ctr].length(); ctr2++)
        {
          char ch = array[ctr].charAt(ctr2);
        
          if(Character.isLowerCase(ch))
          {
            nrLower++;
          }
        }
    }
    return nrLower;
  }
  
  //Method to determine number of spaces in strings of array.
  public static int nrSpaces(String[] array)
  { 
    int nrSpaces = 0;
  
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      for(int ctr2 = 0; ctr2 < array[ctr].length(); ctr2++)
        {
          char ch = array[ctr].charAt(ctr2);
        
          if(ch == ' ')
          {
            nrSpaces++;
          }
        }
    }
    return nrSpaces;
  }
  
  //Method to determine longest string and its length.
  public static String findLongest(String[] array)
  {
    String longest = "";
    int lgth = 0;
  
    for(int ctr = 0; ctr < array.length; ctr++)
    {
      if(array[ctr].length() > longest.length())
      {
        longest = array[ctr];
      }
    }
    return longest;
  }
}

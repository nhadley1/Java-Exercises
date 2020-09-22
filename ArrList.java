//ArrList.java
import java.util.Scanner;
import java.util.ArrayList;


public class ArrList
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input size of array List
    System.out.print("Enter size: ");
    int size = keyboard.nextInt();
    
    //set up array List with specified size.
    ArrayList <Integer> nrs = new ArrayList<>(size);
    
    //Fill Array list 
    for(int ctr = 0; ctr < size; ctr++)
    {
      System.out.print("input an integer: ");
      int nr = keyboard.nextInt();
      nrs.add(nr);
    }
    
    System.out.println("\nPrinting Array List: ");
    printArray(nrs);
    
    sortList(nrs);
    
    System.out.println("\nPrinting Array List: ");
    printArray(nrs);
    
    removeSearched(nrs);
    
    System.out.println("\nPrinting Array List: ");
    printArray(nrs);
 
  }
  
  //Method to allow user print arrayList.
  public static void printArray(ArrayList<Integer> nrs)
  {
    for(int ctr = 0; ctr < nrs.size(); ctr++)
    {
      System.out.println("List " + ctr + ": " + nrs.get(ctr));
    }
  }
  
  //Method to sort arraylist
  public static void sortList(ArrayList<Integer> nrs)
  {
    int temp = 0;
    
    for(int ctr = 0; ctr < nrs.size()-1; ctr++)
    {
      for(int ctr2 = 0; ctr2 < nrs.size()-1; ctr2++)
      {
        if(nrs.get(ctr2) > nrs.get(ctr2+1))
        {
          temp = nrs.get(ctr2);
          nrs.set(ctr2, nrs.get(ctr2+1));
          nrs.set((ctr2+1), temp);
        }
      }
    }
  }
  
  //Method to remove searched nr.
  public static void removeSearched(ArrayList<Integer> nrs)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to search array list: 
    System.out.print("\nRemove item from array list: ");
    int nr = keyboard.nextInt();
    
    for(int ctr = 0; ctr < nrs.size(); ctr++)
    {
      if(nr == nrs.get(ctr))
      {
        nrs.remove(ctr);
      }
    }
  }

}
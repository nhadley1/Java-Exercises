//AList.java
import java.util.Scanner;
import java.util.ArrayList;

public class AList
{
  public static void main(String[] args)
  {
    //Set up ArrayList
    ArrayList <Integer> nrs = new ArrayList<>();
    
    //Add ArrayList.
    nrs.add(5);
    nrs.add(3);
    nrs.add(4);
    nrs.add(3);
    
    //Check if array list is sorted.
    boolean sorted = true;
    
    for(int ctr = 0; ctr < nrs.size()-1; ctr++)
    {
      for(int ctr2 = 0; ctr2 < nrs.size()-1; ctr2++)
      {
        if(nrs.get(ctr2) > nrs.get(ctr2+1))
        {
          sorted = false;
        }
      }
      break; 
    }
    
    if(sorted)
    {
      System.out.println("\nArray List is sorted.");
    }
    else
    {
      System.out.println("\nArray List is not sorted.");
    }

    
    //Print ArrayList.
    for(int ctr = 0; ctr < nrs.size(); ctr++)
    {
      System.out.println("Nrs[" + ctr + "]: " + nrs.get(ctr)); 
    }
    
    System.out.println();
    
    //Sort ArrayList
    int temp = 0;
    
    for(int ctr = 0; ctr < nrs.size()-1; ctr++)
    {
      for(int ctr2 = 0; ctr2 < nrs.size()-1; ctr2++)
      {
        if(nrs.get(ctr2) > nrs.get(ctr2+1))
        {
          temp = nrs.get(ctr2);
          nrs.set(ctr2, nrs.get(ctr2+1)); 
          nrs.set(ctr2+1, temp);
        }
      } 
    }
    
    //Print ArrayList.
    System.out.println("Sorted ArrayList");
    
    for(int ctr = 0; ctr < nrs.size(); ctr++)
    {
      System.out.println("Nrs[" + ctr + "]: " + nrs.get(ctr)); 
    }
    
    //Check if arrayList is sorted.
    sorted = true;
    
    for(int ctr = 0; ctr < nrs.size()-1; ctr++)
    {
      for(int ctr2 = 0; ctr2 < nrs.size()-1; ctr2++)
      {
        if(nrs.get(ctr) > nrs.get(ctr+1))
        {
          sorted = false;
        }
      }
      break; 
    }
    

    
    if(sorted)
    {
      System.out.println("\nArray List is sorted.");
    }
    else
    {
      System.out.println("\nArray List is not sorted.");
    }

    
    //Scanner object.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input number.
    System.out.println("\nInput number to be tested:");
    int test = keyboard.nextInt();
    
    //Test for number.
    boolean flag = false;
    
    for(int ctr = 0; ctr < nrs.size(); ctr++)
    {
       if(nrs.get(ctr) == test)
       {
         flag = true;
       }
       break;
    }
    
    //Test number of times number is found in arrayList.
    int found = 0;
    
    for(int ctr = 0; ctr < nrs.size(); ctr++)
    {
       if(nrs.get(ctr) == test)
       {
         found = found +1;
       }
    }

    
    if(flag)
    {
      System.out.println(test + " was found in array " + found + " time(s).");
    }



  }
}
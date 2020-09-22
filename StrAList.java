//StrAList.java
import java.util.Scanner;
import java.util.ArrayList;

public class StrAList
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
  
    //Set up Array List of Strings
    ArrayList <String> words = new ArrayList<>();
  
    //Allow user to chose size of array.
    System.out.print("Size of array: ");
    int limit = keyboard.nextInt();
    
    keyboard.nextLine();
  
    //Allow user to fill ArrayList with words.
    for(int ctr = 0; ctr < limit; ctr++)
    {
      System.out.print("Add word to array list: ");
      String word = keyboard.nextLine();
      words.add(word); 
    }
    
    //Find largest string in ArrayList
    int length = words.get(0).length();
    
    int index = 0; 
    
    for(int ctr = 0; ctr < words.size(); ctr++)
    {
      if(words.get(ctr).length() > length);
      {
        length = words.get(ctr).length();
        index = ctr;
      } 
    }
    System.out.println("\nLongest String in ArrayList is " + words.get(index));
    
    //Sort ArrayList
    String temp = "";
    
    for(int ctr = 0; ctr < words.size() - 1; ctr++)
    {
      for(int ctr2 = 0; ctr2 < words.size()-1; ctr2++)
      {
        if(words.get(ctr2).compareTo(words.get(ctr2+1)) > 0)
        {
          temp = words.get(ctr2);
          words.set(ctr2, words.get(ctr2+1));
          words.set(ctr2+1, temp);
        }
      }
    }
    
    System.out.println("\nSorted ArrayList:");
    
    //Print ArrayList.
    for(int ctr = 0; ctr < words.size(); ctr++)
    {
      System.out.println(words.get(ctr));
    }
    
    //Search ArrayList
    System.out.print("\nSearch for word in Array List: ");
    String search = keyboard.nextLine();
    
    boolean flag = false;
    
    for(int ctr = 0; ctr < words.size(); ctr++)
    {
      if(words.contains(search))
      {
        flag = true;
      }
      break;
    }
    
    if(flag)
    {
      System.out.println("\nThe String " + search + " is in the array list");
    }
    else
    {
      System.out.println("\nThe String " + search + " is not in the array list");
    }
    
    //Remove String if less than length 4
    for(int ctr = 0; ctr < words.size()-1; ctr++)
    {
      if(words.get(ctr).length() < 4)
      {
        words.remove(ctr);
      }
    }
    
    //Print ArrayList.
    System.out.println("\nStrings with 4 or more characters:");
    for(int ctr = 0; ctr < words.size(); ctr++)
    {
       System.out.println(words.get(ctr));
    }
    
    System.out.print(words.clone());

  }
  
  
  
  
    
}
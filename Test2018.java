//Test2018.java
import java.util.Scanner;
import java.util.ArrayList;

public class Test2018
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up random size of ArrayList 1-6.
    int nrStrings = 0;
    
    for(int ctr = 0; ctr < 10; ctr++)
    {
      nrStrings = (int)(Math.random() * 6+1);
    }    
    //Print number of Strings being set up in ArrayList.
    System.out.println("Nr. Strings: " + nrStrings);
        
    //Set up ArrayList of Strings.
    ArrayList<String> words = new ArrayList<String>();
    
    //Allow User to input Strings into ArrayList.
    for(int ctr = 0; ctr < nrStrings; ctr++)
    {
      System.out.print("Word " + (ctr+1) + ": ");
      String word = keyboard.nextLine();
      words.add(word);
    }
    
    System.out.println();
    
    //Print ArrayList.
    for(int ctr = 0; ctr < words.size(); ctr++)
    {
      System.out.println("Word " + (ctr+1) + ": " + words.get(ctr));
    }
    
    //Search ArrayList.
    boolean flag = false;
    
    System.out.print("\nSearch word in ArrayList: ");
    String searched = keyboard.nextLine();
    
    for(int ctr = 0; ctr < words.size(); ctr++)
    {
      if(words.contains(searched))
      {
        System.out.println("\nThe word " + searched + " is in ArrayList.");
      }
      else
      {
        System.out.println("\nThe word " + searched + " is not in ArrayList.");
      }
    }
    
    //Sort ArrayList
    String temp = "";
    
    for(int ctr = 0; ctr < words.size()-1; ctr++)
    {
      for(int ctr2 = 0; ctr2 < words.size()-1; ctr2++) 
      {
        String str1 = words.get(ctr2);
        String str2 = words.get(ctr2+1);
      
        if(str2.compareTo(str1) < 0)
        {
          words.set(ctr2, str2);
          words.set(ctr2+1, str1);
        }
      }
    }
    
    System.out.println();
    
    //Print ArrayList.
    for(int ctr = 0; ctr < words.size(); ctr++)
    {
      System.out.println("Word " + (ctr+1) + ": " + words.get(ctr));
    }

    
    
  }
}
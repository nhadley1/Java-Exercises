//Program3.java
//Nathan Hadley 2/16/18
//User determines number of strings to input, inputs strings,
//then program returns number of upper-case characters, number
//of lower-case characters, number of spaces, and the longest string 
//in array, along with it's length. 
import java.util.Scanner;


public class Program3
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Input number of strings to store.
    System.out.print("Number of strings to store: ");
    int nrStrings = keyboard.nextInt();
    
    //Clear keyboard buffer.
    keyboard.nextLine();
   
    //Set up array to hold strings.
    String[] strings = new String[nrStrings];
    
    //Input strings from keyboard.
    System.out.println("\nInput Strings: ");
    
    for(int ctr = 0; ctr < nrStrings; ctr++)
    {  
      System.out.print("String # " + (ctr+1) + ": ");
      strings[ctr] = keyboard.nextLine();
    }
    
    //Print back strings input.
    System.out.println("\nStrings input: ");
    
    for(int ctr = 0; ctr < nrStrings; ctr ++)
    {
      System.out.println("String # " + (ctr + 1) + ": " + strings[ctr]);
    }
    
    //Calculate number of upper-case characters, lower-case characters and spaces.
    int nrUpperCase = 0;
    
    int nrLowerCase = 0;
    
    int nrSpaces = 0;
    
    for(int ctr = 0; ctr < nrStrings; ctr++)
    {
      for(int ctr2 = 0; ctr2 < strings[ctr].length(); ctr2++)
      { 
        char ltr = strings[ctr].charAt(ctr2);
        
        if(ltr >= 'A' && ltr <= 'Z')
        {
          nrUpperCase++;
        }
        
        else if(ltr >= 'a' && ltr <= 'z')
        {
          nrLowerCase++;
        }
        
        else if(ltr == ' ')
        {
          nrSpaces++;
        }
      }
    }
    
    //Print number of upper-case characters, lower-case characters, and spaces.
    System.out.println("\nNumber of upper-case characters: " + nrUpperCase);
    
    System.out.println("Number of lower-case characters: " + nrLowerCase);
    
    System.out.println("Number of Spaces:                " + nrSpaces);
    
    //Determines the longest string and its length.6
    int lgth = 0;
    
    String longest = null;
    
    for(int ctr = 0; ctr < nrStrings; ctr++)
    {
      if(strings[ctr].length() > lgth)
      {  
        lgth = strings[ctr].length();
        longest = strings[ctr];
      }   
    }
    
    //Print longest string.
    System.out.println("\nThe longest string:       " + longest);
    
    //Print length of longest string
    System.out.println("Length of longest String: " + lgth);
       
  }
}
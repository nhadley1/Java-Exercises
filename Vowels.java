//Vowels.java
import java.util.Scanner;


public class Vowels
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input character.
    System.out.print("Input a character: ");
    char ch = keyboard.next().charAt(0);
    
    System.out.println("Character: " + ch);
    
    char chUp = Character.toUpperCase(ch);
    
    switch(chUp)
    {
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
      System.out.println("\nCharacter is a vowel.");
      break;
      
      default:
      System.out.println("\nCharacter in not vowel.");
      break;
    }
  }
} 
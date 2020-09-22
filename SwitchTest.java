import java.util.Scanner;


public class SwitchTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input character.
    System.out.print("Type a character: ");
    char ch = keyboard.next().charAt(0);
    
    System.out.println("\nCharacter input: " + ch);
    
    char chUp = Character.toUpperCase(ch);
    
    switch(chUp)
    {
      case 'A': 
      System.out.print("\nVowel");
      break;
      
      case 'E': 
      System.out.print("\nVowel");
      break;
      
      case 'I': 
      System.out.print("\nVowel");
      break;

      case 'O': 
      System.out.print("\nVowel");
      break;
      
      case 'U': 
      System.out.print("\nVowel");
      break;

      default:
      System.out.print("\nNot a vowel.");
      break;
    } 
  }
}
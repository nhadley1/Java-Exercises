//Menu.java
import java.util.Scanner;


public class Menu
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    int choice = 1;
    
    while(choice != 0)
    {
      System.out.println("\n1) Choice1 \n2) Choice2 \n3) Choice3 \n0) Exit Menu");
      System.out.print("\nSelect Menu option: ");
      choice = keyboard.nextInt();
      
      switch(choice)
      {
        case 1:
        System.out.println("\nChoice 1 selected");
        break;
      
        case 2:
        System.out.println("\nChoice 2 selected");
        break;
        
        case 3:
        System.out.println("\nChoice 3 selected");
        break;
        
        case 0:
        System.out.println("\nExiting menu.");
        break;
        
        default:
        System.out.println("\n" + choice +" is not a menu item.");
        break;
      }
    } 
  }
}
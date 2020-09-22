//ItemTest.java
//Nathan Hadley 9/31/18
//Tests the Item class.
import java.util.Scanner;

public class ItemTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Call method to enter item information.
    Item itm = Item.enterItem();
    
    //Print contents of Item object using toString() method.
    System.out.println("\nInventory item: " + itm);
  
    //Calculate value of inventory item on hand and print.
    double value = itm.getPrice() * itm.getOnHand();
    
    System.out.println("\nThe value of the " + itm.getName() + " currently on hand is $" + value);
  }
}
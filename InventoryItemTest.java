// InventoryTest.java
// Nathan Hadley  03/18/18
// Test program for InventoryItem class.
import java.util.Scanner;


public class InventoryItemTest
{
  public static void main(String[] args)
  {
    // Set up Scanner object for keyboard input.
	 Scanner keyboard = new Scanner(System.in);
	 
	 // Input data for inventory item.
	 System.out.println("Input data for first item:");
	 System.out.print("Item name:      ");
	 String item = keyboard.nextLine();
	 
	 System.out.print("Price:         $");
	 double cost  = keyboard.nextDouble();
	 
	 System.out.print("Nr. in Stock:   ");
	 int nrStock = keyboard.nextInt();
	 
	 // Set up InventoryItem object.
	 InventoryItem item1 = new InventoryItem(item, cost, nrStock);
	 
	 // Check InventoryItem's toString() method.
	 System.out.println("\nInventory Item #1 " + item1);
    
    double currentVal = nrStock*cost;
    
    item1.valInventory(currentVal);
    
    System.out.println("\nCurrent value of " + item1.getItem() + " inventory = " + currentVal);
	 
	 // Clear keyboard buffer.
	 keyboard.nextLine();
	 
	 // Input data to check InventoryItem's set() and get() methods.
	 System.out.println("\n\nInput new data for InvetoryItem to check set() and get() methods.");
  	 System.out.print("Name of Item:     ");
	 item = keyboard.nextLine();
	 
	 item1.setItem(item);
	 
	 System.out.print("Price:           $");
	 cost = keyboard.nextDouble();
	 
	 item1.setCost(cost);
	 
	 System.out.print("Number in stock:  ");
	 nrStock = keyboard.nextInt();
	 
	 item1.setStock(nrStock);
    
    item1.valInventory(currentVal);
    
    System.out.println("\nInventory Item #1: [" + item1.getItem()+ "; "  + item1.getCost() + "; " + item1.getStock() + "]");
    System.out.println("\nCurrent value of " + item1.getItem() + " inventory = " + currentVal);
  }
}
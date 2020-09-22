// Inventory.java
// Jim Jerkofsky  11/04/18
// Object of Intentory class holds:
//    String (name of item)
//    double (price of item)
//    int    (number on hand)
import java.util.Scanner;


public class Inventory
{
  // Default constructor.
  public Inventory()
  {
    name = "***";
    price = 0.0;
    nrOnHand = 0;
  }
  
  // Constructor.
  public Inventory(String nam, double prce, int nr)
  {
    name = nam;
    price = prce;
    nrOnHand = nr;
  }
  
  // Inventory's set() methods.
  public void setName(String nam)
  {
    name = nam;
  }
  
  public void setPrice(double prce)
  {
    price = prce;
  }
  
  public void setNrOnHand(int nr)
  {
    nrOnHand = nr;
  }
  
  // Inventory's get() methods.
  public String getName()
  {
    return name;
  }
  
  public double getPrice()
  {
    return price;
  }
  
  public int getNrOnHand()
  {
    return nrOnHand;
  }
  
  // Method to input data and set up Inventory object.
  public static Inventory enterInventory()
  {
    // Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Enter Inventory data/
    System.out.print("Name:        ");
    String name = keyboard.nextLine();
    
    System.out.print("Price:      $");
    double price = keyboard.nextDouble();
    
    System.out.print("Nr. on hand: ");
    int nrOnHand = keyboard.nextInt();
    
    // Set up and return Inventory item.
    return new Inventory(name, price, nrOnHand);
  }
  
  // Inventory's toString() method.
  public String toString()
  {
    return "[" + name + "; " + price + "; " + nrOnHand + "]";
  }

  // Instance variables.
  private String name;
  private double price;
  private int nrOnHand;
}
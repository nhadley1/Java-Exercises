//Item.java
//Nathan Hadley 8/31/2018
// Class models an Inventory Item.
// Data stored:
//     Item name.
//     Item cost.
//     Number of particular item in stock.
import java.util.Scanner;

public class Item
{
  //Constructor
  public Item(String nm, double cost, int hand)
  {
    name = nm;
    price = cost;
    onHand = hand;
  }
    
  //Item's get() methods.
  public String getName()
  {
    return name;
  }
    
  public double getPrice()
  {
    return price;
  }
  
  public int getOnHand()
  {
    return onHand;
  }
    
  //Item's set() methods.
  public void setName(String nm)
  {
    name = nm;
  }
    
  public void setPrice(double cost)
  {
    price = cost;
  }
    
  public void setOnHand(int hand)
  {
    onHand = hand;
  }
    
  //Item's .toString()method 
  public String toString()
  {
    String itm;
    
    itm = "[" + name + "; " + price + "; " + onHand + "]";
      
    return itm;
  }
    
  //Instance Variables.
  private String name;
  private double price;
  private int onHand;


  //Method to enter item.
  public static Item enterItem()
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Enter Item information.
    System.out.print("Name:        ");
    String name = keyboard.nextLine();
    
    System.out.print("Price:      $");
    double price = keyboard.nextDouble();
    
    System.out.print("Nr. on hand: ");
    int onHand = keyboard.nextInt();
    
    //Set up Item object.
    Item itm = new Item(name, price, onHand);
    
    return itm;
  }  
}    
  
  


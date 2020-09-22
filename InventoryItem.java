//InventoryItem.java
//Nathan Hadley 3/18/2018
// Class models an Inventory Item.
// Data stored:
//     Item name
//     Item cost
//     Number of particular item in stock

public class InventoryItem
{
  //Constructor.
  public InventoryItem(String itm, double price, int stock)
  {
    item = itm;
    cost = price;
    nrStock = stock;
  }
  
  //InventoryItem's get() methods.
  public String getItem()
  {
    return item;
  }
  
  public double getCost()
  {
    return cost;
  }
  
  public int getStock()
  {
    return nrStock;
  }
  
  //InventoryItem's set() methods.
  public void setItem(String itm)
  {
    item = itm;
  }
  
  public void setCost(double price)
  {
    cost = price;
  }
  
  public void setStock(int stock)
  {
    nrStock = stock;
  }
  
  //InventoryItem's .toString() method.
  public String toString()
  {
    String inventory = "";
    
    inventory = inventory + "[" + item + "; " + cost + "; " + nrStock + "]";
    
    return inventory;
  }
  
  public double valInventory(double currentVal)
  {
     currentVal = cost * nrStock;
     
     return currentVal;
  }
  
  //Instance Variables.
  private String item;
  private double cost;
  private int nrStock;
}
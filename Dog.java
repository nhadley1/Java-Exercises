//Dog.java
//Nathan Hadley


public class Dog extends Pet
{
  //Default Constructor.
  public Dog()
  {
    breed = "***";
    value = 0.0;
  }
  
  //Constructor.
  public Dog(String brd, double val, String nm, int ag, double lbs)
  {
    super(nm, ag, lbs);
    
    breed = brd;
    value = val;
  }
  
  //Dog's set() methods.
  public void setBreed(String brd)
  {
    breed = brd;
  }
  
  public void setValue(double val)
  {
    value = val;
  }
  
  //Dog's get() methods.
  public String getBreed()
  {
    return breed;
  }
  
  public double getValue()
  {
    return value;
  }
  
  //Dog's toString() method
  public String toString()
  {
    return "[" + super.toString() + ", " + breed + ", " + value + "]";
  }
  
  //Instance Variables
  private String breed;
  private double value;
}
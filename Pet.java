//Pet.java

public class Pet
{
  //Default Constructor.
  public Pet()
  {
    name = "*****";
    age = 0;
    weight = 0.0;
  }
  
  //Constructor.
  public Pet(String nm, int ag, double lbs)
  {
    name = nm;
    age = ag;
    weight = lbs;
  }
  
  //Pet's set() methods.
  public void setName(String nm)
  {
    name = nm;
  }
  
  public void setAge(int ag)
  {
    age = ag;
  }
  
  public void setWeight(double lbs)
  {
    weight = lbs;
  }
  
  //Pet's get() methods.
  public String getName()
  {
    return name;
  }
  
  public int getAge()
  {
    return age;
  }
  
  public double getWeight()
  {
    return weight;
  }
  
  //Pet's toString() method.
  public String toString()
  {
    return "[" + name + ", " + age + ", " + weight + "]"; 
  } 
  
  //Instance Variables.
  private String name;
  private int age;
  private double weight;
}
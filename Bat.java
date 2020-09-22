//Bat.java
import java.util.Scanner;

public class Bat
{
  //Constructor.
  Bat(String nm, int ag, String brd)
  {
    name = nm;
    age = ag;
    breed = brd;
  } 
  
  //Bat's get() methods.
  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }
  
  public String getBreed()
  {
    return breed;
  }
  
  //Bat's set() methods.
  public void setName(String nm)
  {
    name = nm;
  }
  
  public void setAge(int ag)
  {
    age = ag;
  }  
  
  public void setBreed(String brd)
  {
    breed = brd;
  }
  
  //Bat's .toString() method.
  public String toString()
  {
    String bt = "";
    
    bt = "[" + name + "; " + age + "; " + breed + "]";
    
    return bt;
  }
  
  //enterDog() method.
  public static Bat enterBat()
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Input data for bat object.
    System.out.print("Input bat name: ");
    String name = keyboard.nextLine();
    
    System.out.print("Input bat age: ");
    int age = keyboard.nextInt();
    
    //Clear keyboard buffer.
    keyboard.nextLine();
   
    System.out.print("Input bat breed: ");
    String breed = keyboard.nextLine();
    
    //Set up object of Bat class.
    Bat newBat = new Bat(name, age, breed);
    
    //Return bat to calling method.
    return newBat;  
  }
  
  //Instance Variables.
  private String name;
  private int age;
  private String breed;
}
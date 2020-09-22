//TestPetDOg.java
import java.util.Scanner;

public class TestDog
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up Dog object.
    System.out.println("Input dog information: ");
    Dog dg = enterDog();
    
    System.out.println(dg);
  }
  
  //Method to set up and return dog object.
  public static Dog enterDog()
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Enter Information for Dog.
    System.out.print("Name: ");
    String name = keyboard.nextLine();
    
    System.out.print("Breed: ");
    String breed = keyboard.nextLine();
    
    System.out.print("Age: ");
    int age = keyboard.nextInt();
    
    System.out.print("Weight: ");
    double weight = keyboard.nextDouble();
    
    System.out.print("Value: ");
    double value = keyboard.nextDouble();
    
    Dog dg = new Dog(breed, value, name, age, weight);
    
    return dg;
  }
}
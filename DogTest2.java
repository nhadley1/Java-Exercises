// DogTest2.java
// Nathan Hadley  04/05/18
// Program to test class Dog.
// Sets up and displays an array of Dog objects.
import java.util.Scanner;

public class DogTest2
{
  public static void main(String[] args)
  {
    // Set up Scanner object for keyboard input.
	 Scanner keyboard = new Scanner(System.in);
	 
    // Input number of Dog objects to store.
    System.out.print("\nNumber of dogs:   ");
    int nrDogs = keyboard.nextInt();
    
    // Clear input buffer of newline character.
    keyboard.nextLine();
    
    // Set up array to hold Dog objects.
    Dog[] dogs = new Dog[nrDogs];
    
    System.out.println("\nEnter data for dogs:");
    
    // Store dogs into array.
    for(int ctr = 0; ctr < nrDogs; ctr++)
    {
      System.out.println("\nEnter Dog #" + (ctr+1) + ":");
      dogs[ctr] = enterDog();
    }
 
    // Print current contents of array of dogs.
    System.out.println("\nCurrent contents of array of dogs:");
    
    for(int ctr = 0; ctr < nrDogs; ctr++)
    {
      System.out.println("Dog #" + (ctr+1) + ":  " + dogs[ctr]);
    }
    
    // Allow user to search array for a dog by name and breed.
    System.out.println("\nSearch array of dogs:");
    
    System.out.print("Name:     ");
    String name = keyboard.nextLine();
    
    System.out.print("Breed:    ");
    String breed = keyboard.nextLine();
    
    // Call method to search array for indicated dog.
    searchForDog(name, breed, dogs);
    
    fillDog(Dog[] dogs);
  }
  
  // Method to set up and return Dog object.
  public static Dog enterDog()
  {
    // Set up Scanner object for keyboard input.
	 Scanner keyboard = new Scanner(System.in);

    // Input information for dog.
    System.out.print("Name:        ");
	 String name = keyboard.nextLine();
	 
	 System.out.print("Breed:       ");
	 String breed = keyboard.nextLine();
	 
	 System.out.print("Age:         ");
	 int age = keyboard.nextInt();
	 
	 System.out.print("Weight:      ");
	 double weight = keyboard.nextDouble();
	 
	 // Set up object of class Dog.
	 Dog newDog = new Dog(name, breed, age, weight);  
    
    // Return Dog object to calling method.
    return newDog;  
  }
  
  // Method to search array of dogs (by name and breed).
  public static void searchForDog(String name, String breed, Dog[] dogs)
  {
    for(int ctr = 0; ctr < dogs.length; ctr++)
    {
      if((name.equalsIgnoreCase(dogs[ctr].getName())) &&
         (breed.equalsIgnoreCase(dogs[ctr].getBreed())))
      {
        // Dog (name and breed) found in array.
        System.out.println("\n" + dogs[ctr] + " is in the array.\n");
           return;
      }
    }
    
    // Dog (name and breed) not in array.
    System.out.println("\nDog: " + name + "; " + breed + " not in array.\n");
  }
}
//Program5Test.java
//Nathan Hadley 3/25/18
//
import java.util.Scanner;

public class Program5Test
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Input data for Program5.
    System.out.println("Input data for Program% object:");
    System.out.print("String:         ");
    String str = keyboard.nextLine();
    
    System.out.print("First Integer:  ");
    int firstInt = keyboard.nextInt();
    
    System.out.print("Second Integer: ");
    int secondInt = keyboard.nextInt();
    
    System.out.print("Floating-point: ");
    double fp = keyboard.nextDouble();
    
    //Set up Program5 object.
    Program5 obj1 = new Program5(str, firstInt, secondInt, fp);
    
    //Check Program5's .toString() method.
    System.out.println("\nObj1: " + obj1);
    
    //Call Method to sum object's numeric values
    System.out.println("\nSum of Obj1's numeric values: " + obj1.numSum());
    
    //Call Method to flip object's String variable cases.
    System.out.println("\nObj1's string with cases flipped: " + obj1.switchCase());
    
    
  }
}
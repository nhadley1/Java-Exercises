//StudyTest.java
import java.util.Scanner;


public class StudyTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Input data for Study object.
    System.out.println("Input Study object's attributes:");
    System.out.print("String:         ");
    String str = keyboard.nextLine();
    
    System.out.print("Integer 1:      ");
    int nr1 = keyboard.nextInt();
    
    System.out.print("Integer 2:      ");
    int nr2 = keyboard.nextInt();
    
    System.out.print("Floating-point: ");
    double fp = keyboard.nextDouble();
    
    //Set up Study Object.
    Study obj1 = new Study(str, nr1, nr2, fp);
    
    //Test Study's .toString() method.
    System.out.println("\nObj1: "  + obj1.toString());    
    
    //Call method to sum numeric values.
    System.out.println("\nSum of obj1's numeric value's: " + obj1.sumNum());
    
    //Call method to switch characters.
    System.out.println("\nObj1's string character's flipped: " + obj1.switchCase());
    
    
  }
}
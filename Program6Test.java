//Program6Test.java
//Nathan Hadley 4/9/18
//Program to test class Program5.
import java.util.Scanner;


public class Program6Test
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to input information for Program6 object.
    System.out.println("Setting up first Program6 object: ");
    System.out.println("Enter data for Program6 object: ");
    
    System.out.print("Integer:   ");
    int nr1 = keyboard.nextInt();
    
    System.out.print("Double:    ");
    double fpt = keyboard.nextDouble(); 
    
    //Clear keyboard buffer.
    keyboard.nextLine();  
    
    System.out.print("String #1: ");
    String str1 = keyboard.nextLine();
    
    System.out.print("String #2: ");
    String str2 = keyboard.nextLine();
    
    //Set up object of class Program6.
    Program6 obj1 = new Program6(nr1, fpt, str1, str2);
    
    //Call Program6's toString() method.
    System.out.println("\nProgram6 obj1: " + obj1);
    
    //Call method to raise fpt to nr1.
    System.out.println("\n" + fpt + " raised to the " + nr1 + " power = " + obj1.fptPow());
    
    //Call method to sort Strings lexicographically.
    System.out.println("\nChecking sortStrings() method: " + obj1.sortStrings());
    
    //Call method to get return integer index of str1.
    System.out.println("\nChecking Program6's getSubstring() method:");
    
    System.out.print("Beginning index: ");
    int idx1 = keyboard.nextInt();
    
    System.out.print("Ending index:    ");
    int idx2 = keyboard.nextInt() + 1;
    
    System.out.println("\ngetSubstring(" + idx1 + ", " + (idx2-1) + ") = " + obj1.getSubstring(idx1, idx2));
    
    
  }
}

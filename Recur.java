//Recur.java
import java.util.Scanner;

public class Recur
{
   public static void main(String[] args)
   {
      //Set up Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //Allow user to input integer.
      System.out.print("Input an integer: ");
      int nr = keyboard.nextInt();
      
      //Call factorial method.
      int ans = fact(nr);
      System.out.println("\nFactorial of integer input: " + ans);
   }
   //Method to solve factorial.
   //0 and exception handling can be added to this.
   public static int fact(int nr)
   {
      if(nr <= 1)
      {
         return 1;
      }
      else
      {
         return nr * fact((nr - 1));
      }
     
   }
   
   //Method to 
}
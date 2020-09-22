import java.util.Scanner;

public class Hello{
   public static void main(String[] args)
   {
      //Set up a Scanner Object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //Allow user to input an integer.
      System.out.print("Input a number: ");
      int nr = keyboard.nextInt();
      
      //Print input number.
      System.out.println("Number input: " + nr);
      
      //Show the sum of the number 1..n.
      int sum = 0;
      
      for(int i = 0; i <= nr; i++){
         sum += i;
      }
      
      System.out.print("Sum 1..n = " + sum);
      System.out.println("\n");
      
      //Experimenting with for each loops.
      String[] cars = {"Honda", "Volvo", "Toyota"};
      
      for (String i : cars){
         System.out.println(i);
      }
   }
}

import java.util.Scanner;


public class Even
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);
    
    //Input Integer
    System.out.print("Type an integer: ");
    int nr1 = keyboard.nextInt();
    
    //Determine if even
    boolean flag = evenOdd(nr1);
    
    if (flag == true)
    {
      System.out.println("\nInteger is even.");
    }  
    
    else
    {
      System.out.println("\nInteger is odd.");
    }
  }
public static boolean evenOdd(int a)
{
  if(a % 2 == 0)
    return true;
    
  else
    return false; 
} 
}
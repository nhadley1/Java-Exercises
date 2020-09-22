//BookTest.java
import java.util.Scanner;


public class BookTest
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up object of book class.
    BookArray books = new BookArray(3);
    
    books.fillArray();
    
    books.printArray();
  }
}
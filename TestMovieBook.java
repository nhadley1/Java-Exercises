// TestMovieBook.java
// Jim Jerkofsky  11/10/18
// Test class Movie and subclass Book.
import java.util.Scanner;


public class TestMovieBook
{
  public static void main(String[] args)
  {
    // Set up Movie object.
    Movie movie1 = Movie.enterMovie();
    
    // Display Movie object.
    System.out.println("\nMovie:   " + movie1);
    
    // Set up Book object.
    Book book1 = Book.enterBook();
    
    // Display Book object.
    System.out.println("\nBook:    " + book1);
    
  }
  
}
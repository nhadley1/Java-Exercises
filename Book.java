// Book.java
// Jim Jerkofsky  11/10/18
// Object contains information book:
//   Title
//   Author
//   Nr. of pages
import java.util.Scanner;


public class Book extends Movie
{
  // Default constructor.
  public Book()
  {
    title = "###";
    author = "####";
    nrPages = 0;
  }
  
  // Full constructor.
  // ENTER FULL CONSTRUCTOR.
  public Book(String tit, String writer, int runTime, String ttl, String auth, int pages) 
  {
    super(tit, writer, runTime);
    
    title = ttl;
    author = auth;
    nrPages = pages;
  }
  
  // Book's get() methods.
  public String getTitle()
  {
    return title;
  }
  
  public String getAuthor()
  {
    return author;
  }
  
  public int getNrPages()
  {
    return nrPages;
  }
  
  // Book's set() methods.
  public void setTitle(String ttl)
  {
    title = ttl;
  }
  
  public void setAuthor(String athr)
  {
    author = athr;
  }
  
  public void setNrPages(int nrpgs)
  {
    nrPages = nrpgs;
  }
  
  // toString() method.
  // ENTER TOSTRING METHOD.
  public String toString()
  {
    return "[" + super.toString() + "; " + title + "; " + author + "; " + nrPages + "]";
  }



  // Method to collect data and set up Book object.
  public static Book enterBook()
  {
    // Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Input data for Movie object.
    System.out.print("\nMovie Title:          ");
    String title = keyboard.nextLine();
    
    System.out.print("Writer:               ");
    String writer = keyboard.nextLine();
    
    System.out.print("Run Time (minutes):   ");
    int runTime = keyboard.nextInt();
    
    keyboard.nextLine();
    
    System.out.print("Book Title:           ");
    String title2 = keyboard.nextLine();    
    
    System.out.print("Author:               ");
    String author = keyboard.nextLine();
    
    System.out.print("Nr. of pages:         ");
    int nrPages = keyboard.nextInt();
    
    // Return Book object.
    return new Book(title, writer, runTime, title2, author, nrPages);
  }


  // Instance variables.
  private String title;
  private String author;
  private int nrPages;
}


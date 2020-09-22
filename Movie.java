// Movie.java
// Jim Jerkofsky  11/10/18
// Object contains information on a movie:
//   Title
//   Writer
//   Run time (minutes)
import java.util.Scanner;


public class Movie
{
  // Default constructor.
  public Movie()
  {
    title = "***";
    writer = "****";
    runTime = 0;
  }
  
  // Full constructor.
  public Movie(String ttl, String wrtr, int rntm)
  {
    title = ttl;
    writer = wrtr;
    runTime = rntm;
  }
  
  // Movie's get() methods.
  public String getTitle()
  {
    return title;
  }
  
  public String getWriter()
  {
    return writer;
  }
  
  public int getRunTime()
  {
    return runTime;
  }
  
  // Movie's set() methods.
  public void setTitle(String ttl)
  {
    title = ttl;
  }
  
  public void setWriter(String wrtr)
  {
    writer = wrtr;
  }
  
  public void setRunTime(int rntm)
  {
    runTime = rntm;
  }
    
  
  // toString method.
  public String toString()
  {
    return "[" + title + "; " + writer + "; " + runTime + "]";
  }
  
  // Method to collect data and set up Movie object.
  public static Movie enterMovie()
  {
    // Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Input data for Movie object.
    System.out.print("\nTitle:                ");
    String title = keyboard.nextLine();
    
    System.out.print("Writer:               ");
    String writer = keyboard.nextLine();
    
    System.out.print("Run Time (minutes):   ");
    int runTime = keyboard.nextInt();
    
    // Return Movie object.
    return new Movie(title, writer, runTime);
  }

  // Instance variables.
  private String title;
  private String writer;
  private int runTime;
}
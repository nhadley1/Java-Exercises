//BookArray.java


public class BookArray
{ 
  //Constructor.
  public BookArray(int sz)
  {
    size = sz;
    books = new Book[size];
  }
  
  //Method to fill array.
  public void fillArray()
  {
    for(int ctr = 0; ctr < size; ctr++)
    {
      books[ctr] = Book.enterBook();
    } 
  }
  
  //Method to print array.
  public void printArray()
  {
    for(int ctr = 0; ctr < size; ctr++)
    {
      System.out.println("Book[" + (ctr+1) + "]: " + books[ctr]);
    }
  }
  
  
  //Instance variables.
  private Book[] books;
  private int size;
}
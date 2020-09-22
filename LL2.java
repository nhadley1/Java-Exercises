//LL2.java
import java.util.Scanner;

public class LL2
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to set up size of linked list.
    System.out.print("# students to set up: ");
    int nrStudents = keyboard.nextInt();
    
    System.out.println();
    
    keyboard.nextLine();
    
    //Set up head ptr.
    LinkedSimpleStudent head = null;
    
    //Set up pointer to current student.
    LinkedSimpleStudent studPtr = null;
    
    //Input students.
    for(int ctr = 1; ctr <= nrStudents; ctr++)
    {
      System.out.print("Enter name of student #" + ctr + ": ");
      String name = keyboard.nextLine();
      
      System.out.print("Enter age of student #" + ctr + ": ");
      int age = keyboard.nextInt();
      
      keyboard.nextLine();
      
      LinkedSimpleStudent newStudent = new LinkedSimpleStudent(name, age);
      
      if(head == null)
      {
        head = newStudent;
        studPtr = head;
      }
      else
      {
        studPtr.setPtr(newStudent);
        studPtr = newStudent;
      }
    }
    
    //Print Contens of linked list using loop.
    System.out.println("\nPrinting contents of linked list using list.");
    LinkedSimpleStudent current = head;
    
    while(current != null)
    {
      System.out.println(current);
      
      current = current.getPtr();
    }
  }
}
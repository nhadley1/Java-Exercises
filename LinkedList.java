//LinkedList.java
import java.util.Scanner;

public class LinkedList
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to choose up number of LinkedSimpleStudents.
    System.out.print("Number of LinkedSimpleStudents: ");
    int size = keyboard.nextInt();
    
    System.out.println();
    
    //Clear keyboard buffer.
    keyboard.nextLine();
    
    LinkedSimpleStudent head = null;
    
    //Set up pointer for traversing list.
    LinkedSimpleStudent stdtPtr = null;
    
    for(int ctr = 1; ctr <= size; ctr++)
    {
      System.out.print("Name of Student #" + ctr + ": ");
      String name = keyboard.nextLine();
      
      System.out.print("Age of Student #" + ctr + ": ");
      int age = keyboard.nextInt();
      
      keyboard.nextLine();
      
      LinkedSimpleStudent newStudent = new LinkedSimpleStudent(name, age);
      
      if(stdtPtr == null)
      {
        //List is empty; enter student at beginning of list.
        head = newStudent;
        stdtPtr = head;
      }
      else
      {
        stdtPtr.setPtr(newStudent);
        stdtPtr = newStudent;
      }
    }
    
    //Print Contents of linkedlist using loop.
    System.out.println("\nPrinting contents of linked list using loop:");
    LinkedSimpleStudent current = head;
    
    while(current != null)
    {
      System.out.println(current);
      
      current = current.getPtr();
    }

  }
}
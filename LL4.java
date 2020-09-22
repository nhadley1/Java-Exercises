//LL4.java
import java.util.Scanner;

public class LL4
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Allow user to set size
    System.out.print("Size: ");
    int size = keyboard.nextInt();
    
    keyboard.nextLine();
    
    //Set up head ptr.
    LinkedSimpleStudent head = null;
    
    //Set up stdPtr.
    LinkedSimpleStudent stdPtr = null;
    
    for(int ctr = 1; ctr <= size; ctr++)
    {
      System.out.print("Name of Student #" + ctr + ": ");
      String name = keyboard.nextLine();
      
      System.out.print("Age of Student #" + ctr + ": ");
      int age = keyboard.nextInt();
      
      keyboard.nextLine();
      
      LinkedSimpleStudent newStudent = new LinkedSimpleStudent(name, age);
      
      if(head==null)
      {
        head = newStudent;
        stdPtr = head;
      }
      else
      {
        stdPtr.setPtr(newStudent);
        stdPtr = newStudent;
      }
    }
    //Print Linked List
    LinkedSimpleStudent current = head;
    
    while(current != null)
    {
      System.out.println(current);
      current = current.getPtr();
    }
  }
}
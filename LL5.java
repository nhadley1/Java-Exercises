//LL5.java
import java.util.Scanner;

public class LL5
{
  public static void main(String[] args)
  {
     //Set up Scanner object for keyboard input.
     Scanner keyboard = new Scanner(System.in);
     
     //Set up size of linked list.
     System.out.print("Size: ");
     int size = keyboard.nextInt();
     
     keyboard.nextLine();
     
     //Set up head.
     LinkedSimpleStudent head = null;
     
     //Set up stdPtr.
     LinkedSimpleStudent stdPtr = null;
     
     //Allow user to input into Linked List.
     for(int ctr = 1; ctr <= size; ctr++)
     {
       System.out.print("Name of student #" + ctr + ": ");
       String name = keyboard.nextLine();
       
       System.out.print("Age of student #" + ctr + ": ");
       int age = keyboard.nextInt();
       
       keyboard.nextLine();
       
       LinkedSimpleStudent newStudent = new LinkedSimpleStudent(name, age);
       
       if(head == null)
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
     //Print
     LinkedSimpleStudent current = head;
     
     while(current != null)
     {
       System.out.println(current);
       current = current.getPtr();
     }
  }
}
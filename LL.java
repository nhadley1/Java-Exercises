//LL.java
import java.util.Scanner;

public class LL
{
  public static void main(String[] args)
  {
    //Set up 3 Link Students.
    LinkedSimpleStudent s1 = new LinkedSimpleStudent("One", 1);
    LinkedSimpleStudent s2 = new LinkedSimpleStudent("Two", 2);
    LinkedSimpleStudent s3 = new LinkedSimpleStudent("Three", 3);
    
    //Set up head to point to first LinkedSimpleStudent object.
    LinkedSimpleStudent head = s1;
    
    //Link remaining.
    s1.setPtr(s2);
    s2.setPtr(s3);
    
    //Print contents of linked list using loop.
    System.out.println("\nPrinting contents of linked list using loop:");
    LinkedSimpleStudent current = head;
    
    while(current != null)
    {
      System.out.println(current);
      
      current = current.getPtr();
    }
  }
}
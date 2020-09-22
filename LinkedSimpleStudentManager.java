//LinkedSimpleStudentManager.java
//Nathan Hadley 10/24/18
//Class to manage a Linked List of Simple Students
//    Method to add student to list.
//    Method to print current contents of list.

public class LinkedSimpleStudentManager
{
  //Constructor.
  LinkedSimpleStudentManager()
  {
    head = null;
  }
  
  //Method to add student to list.
  public void addStudent(LinkedSimpleStudent student)
  {
       LinkedSimpleStudent current = head;
       
       if(head == null)
         {
           // Student is first in linked list; set pointer to first item.
           head = student;
         }
         else
         {
           // Add student at end of current list.
           // Begin by traversing list from head to last student.
           while(current.getPtr() != null)
           {
             current = current.getPtr();
           }
         
           // Have reached end of list; insert student.
           current.setPtr(student);
         } 
  }
  
  //Method to print current contents of list.
  public void printList()
  {
     LinkedSimpleStudent current = head;
     
     if(head == null)
     {
       System.out.println("List is Empty");
     }
     else
     {
       while(current != null)
       {
         System.out.println(current);
         current = current.getPtr();
       }
     }
  }
 
  //Instance Variables.
  private LinkedSimpleStudent head;
}
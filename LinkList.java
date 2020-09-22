//LinkList.java
import java.util.Scanner;

public class LinkList
{
  //Constructor.
  public LinkList(String st)
  {
    str = st;
    ptr = null;
  }
  
  //set string method.
  public void setString(String st)
  {
    str = st;
  }
  
  //Set ptr method.
  public void setPtr(LinkList pt)
  {
    ptr = pt;
  }
  
  //get string method.
  public String getString()
  {
    return str;
  }
  
  //getPtr()
  public LinkList getPtr()
  {
    return ptr;
  }
  
  // toString method.
  public String toString()
  {
    return str;
  }

  
  //Instance Variables.
  private LinkList ptr;
  private String str;
}
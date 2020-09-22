// LinkedString.java
// Object contain:
//    String
//    Pointer


public class LinkedString
{
  // Constructor.
  public LinkedString(String st)
  {
    str = st;
    ptr = null;
  }
  
  // setString method.
  public void setString(String st)
  {
    str = st;
  }
  
  // getString method.
  public String getString()
  {
    return str;
  }
  
  // getPtr() method.
  public LinkedString getPtr()
  {
    return ptr;
  }
  
  // setPtr() method.
  public void setPtr(LinkedString pt)
  {
    ptr = pt;
  }
  
  
  // toString method.
  public String toString()
  {
    return str;
  }
  


  // Instance variables.
  private String str;
  private LinkedString ptr;
}
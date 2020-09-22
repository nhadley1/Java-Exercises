//Snake.java


public class Snake
{
  //Set up Constructor.
  public Snake(String nm, String brd, int ag, int lgth)
  {
    name = nm;
    breed = brd;
    age = ag;
    length = lgth;
  }
  
  //Snake's get() methods.
  public String getName()
  {
    return name;
  }
  
  public String getBreed()
  {
    return breed;
  }
  
  public int getAge()
  {
    return age;
  }
  
  public int getLength()
  {
    return length;
  }
  
  //Snake's set() Methods.
  public void setName(String nm)
  {
    name = nm;
  }
  
  public void setBreed(String brd)
  {
    breed = brd;
  }
  
  public void setAge(int ag)
  {
    age = ag;
  }
  
  public void setLength(int lgth)
  {
    length = lgth;
  }
  
  //Snakes .toString() method.
  public String toString()
  {
    String snk = "";
    
    snk = "[" + name + "; " + breed + "; " + age + "; " + length + "]";
    
    return snk;
  }

  //Set up instance variables.
  private String name;
  private String breed;
  private int age;
  private int length;
}

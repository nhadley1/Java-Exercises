//Study.java

public class Study
{
  //Constructor
  public Study(String string, int int1, int int2, double flt)
  {
    str = string;
    nr1 = int1;
    nr2 = int2;
    fp = flt;
  }
  
  //Study's get() methods.
  public String getStr()
  {
    return str;
  }
  
  public int getNr1()
  {
    return nr1; 
  }
  
  public int getNr2()
  {
    return nr2;
  }
  
  public double getFp()
  {
    return fp;
  } 
  
  //Study's set() methods.
  public void setStr(String string)
  {
    str = string;
  }
  
  public void setNr1(int int1)
  {
    nr1 = int1;
  }
  
  public void setNr2(int int2)
  {
    nr2 = int2;
  }
  
  public void set(double flt)
  {
    fp = flt;
  }
  
  //Study's .toString method.
  public String toString()
  {
    String stu = "";
    
    stu = stu + "[" + str + "; " + nr1 + "; " + nr2 + "; " + fp + "]";
    
    return stu;
  }
  
  //Method to sum numeric values.
  public double sumNum()
  {
    double sum = nr1 + nr2 + fp;
    
    return sum;
  }
  
  //Method to switch cases.
  public String switchCase()
  {
    
    
    String switchedCase = "";
    
    for(int ctr = 0; ctr < str.length(); ctr++)
    {
      char ch = str.charAt(ctr);
    
      if(Character.isUpperCase(ch))
      {
        switchedCase += Character.toLowerCase(ch);
      }
      
      else if(Character.isLowerCase(ch))
      {
        switchedCase += Character.toUpperCase(ch);
      }
      
      else
      {
        switchedCase += ch;
      }
    } 
      return switchedCase;
  }
  
  //Instance Variables.
  private String str;
  private int nr1;
  private int nr2;
  private double fp;
}
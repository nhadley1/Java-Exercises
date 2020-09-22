//Program5.java
//Nathan Hadley 3/25/18
//

public class Program5
{
  //Constructor.
  Program5(String string, int first, int second, double flt)
  {
    str = string;
    firstInt = first;
    secondInt = second;
    fp = flt;
  }

  //Program5's get() methods.
  public String getStr()
  {
    return str;
  }
  
  public int getFirstInt()
  {
    return firstInt;
  }

  public int getSecondInt()
  {
    return secondInt;
  }
  
  public double getFp()
  {
    return fp;
  }
  
  public void setStr(String string)
  {
    str = string;
  }
  
  public void setFirstInt(int first)
  {
    firstInt = first;
  }
  
  public void setSecondInt(int second)
  {
    secondInt = second;
  }
  
  public void setFp(int flt)
  {
    fp = flt;
  }
  
  //Program5's .toString() method.
  public String toString()
  {
    String pro5 = "";
    
    pro5 = pro5 + "[" + str + "; " + firstInt + "; " + secondInt + "; " + fp + "] ";
    
    return pro5;
  }
  
  public double numSum()
  {
     double sum = firstInt + secondInt + fp;
     
     return sum; 
  }
  
  public String switchCase()
  {
    String switchedCase = str;
  
    for(int ctr = 0; ctr < str.length(); ctr++)
    {
      char ch = str.charAt(ctr);
    
      if(str.substring(ctr, ctr+1).compareTo(str) >= 'A' && str.substring(ctr, ctr+1).compareTo(str) <= 'Z')
      {
        str = str.substring(ctr, ctr+1).toLowerCase();
        
      }
      
      else if(str.substring(ctr, ctr+1).compareTo(str) >= 'a' && str.substring(ctr, ctr+1).compareTo(str) <= 'z')
      {
         str = str.substring(ctr, ctr+1).toUpperCase();
         
      }
    }
    
   
    
    return switchedCase;
  }
  
  //Instance Variables.
  private String str;
  private int firstInt;
  private int secondInt;
  private double fp;
}
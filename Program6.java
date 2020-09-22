//Program6.java
//Nathan Hadley 4/9/18
//Class for Program6
//Raises floating point value to integer value.
//Sorts two strings lexicographically.
//Returns a substring of the first string instance variable input.


public class Program6
{
  //Program6's Constructor.
  Program6(int n1, double fp, String st1, String st2)
  {
    nr1 = n1;
    fpt = fp;
    str1 = st1;
    str2 = st2;
  }
  
  //Program6's get() methods.
  public int getNr1()
  {
    return nr1;
  }
  
  public double getFpt()
  {
    return fpt;
  }
  
  public String getStr1()
  {
    return str1;
  }
  
  public String getStr2()
  {
    return str2;
  }
  
  //Program6's set() methods.
  public void setNr1(int n1)
  {
    nr1 = n1;
  }
  
  public void setFpt(double fp)
  {
    fpt = fp;
  }
  
  public void setStr1(String st1)
  {
    str1 = st1;
  }
  
  public void setStr2(String st2)
  {
    str2 = st2;
  }
  
  //Program6's .toString() method.
  public String toString()
  {
    String prg6 = "";
    prg6 = "[" + nr1 + "; " + fpt + "; " + str1 + "; " + str2 + "]";
    return prg6;
  }
  
  //Method to raise flaoting point number to integer value. 
  public double fptPow()
  {
    return Math.pow(fpt, nr1);
  }
  
  //Method to sort strings lexicographically.
  public String sortStrings()
  {
    String strSort ="";
    
    if(str1.compareTo(str2) < 0)
    {
      strSort = str1 + " - " + str2;
    }
    
    else
    {
      strSort = str2 + " - " + str1;
    }
    return strSort;
  }
  
  //Method to return substring of integer index of str1.
  public String getSubstring(int idx1, int idx2)
  {
    return str1.substring(idx1, idx2);
  }

  //Instance Variables.
  private int nr1;
  private double fpt;
  private String str1;
  private String str2;
}
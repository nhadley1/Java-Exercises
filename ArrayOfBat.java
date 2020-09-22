//ArrayOfBat.java

public class ArrayOfBat
{
  //Constructor.
  ArrayOfBat(int nBats)
  {
    nrBats = nBats;
    bats = new Bat[nrBats];
  } 
  
  //Method to fillBatArray;
  public void fillBatArray()
  {
    for(int ctr = 0; ctr < nrBats; ctr++)
    {
      System.out.println("Bat#" + (ctr+1) + ":");
      
      bats[ctr] = Bat.enterBat();
    }
  }
  
  //Method to printBatArray;
  public void printBatArray()
  {
    for(int ctr = 0; ctr < nrBats; ctr++)
    {
      System.out.println("Bat#" + (ctr+1) + ": " + bats[ctr]);
      
    }
  }
  
  //Instance Variables.
  int nrBats;
  Bat[] bats;
}

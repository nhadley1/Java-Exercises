//Dice.java


public class Dice
{
  public static void main(String[] args)
  {
    //Roll Dice 6 times.
    for(int ctr = 0; ctr < 6; ctr++)
    {
      int roll = (int)(Math.random()*7);
      System.out.println("roll " + ctr + ": " + roll);
    }
  }
}
//Fighter.java
import java.util.Scanner;

public class Fighter
{
  //Default Constructor.
  public Fighter()
  {
    name = "Fighter";
    health = 20;
    defense = 0;
    attack = 3;
  }
  
  //Constructor.
  public Fighter(String nm, int hp, int def, int atk)
  {
    name = nm;
    health = hp;
    defense = def;
    attack = atk;
  }
  
  //Fighter's get() methods.
  public String getName()
  {
    return name;
  }
  
  public int getHealth()
  {
    return health;
  }
  
  public int getDefense()
  {
    return defense;
  }
  
  public int getAttack()
  {
    return attack;
  }
  
  //Fighter's set() methods.
  public void setName(String nm)
  {
    name = nm;
  }
 
  public void setHealth(int hp)
  {
    health = hp;
  }
  
  public void setDefense(int def)
  {
    defense = def;
  }
  
  public void setAttack(int atk)
  {
    attack = atk;
  }
  
  //enterFighter()
  public Fighter enterFighter()
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Name of Fighter: ");
    String name = keyboard.nextLine();
    
    System.out.print("Health: ");
    int health = keyboard.nextInt();
    
    System.out.print("Defense: ");
    int defense = keyboard.nextInt();
    
    System.out.print("Attack: ");
    int attack = keyboard.nextInt();
    
    Fighter newFighter = new Fighter(name, health, defense, attack);
    
    return newFighter;
  }
  
  //Fighter's toString() method.
  public String toString()
  {
    return "[" + name + "; " + health + "; " + defense + "; " + attack + "]";
  } 



  //Instance Variables.
  private String name;
  private int health;
  private int defense;
  private int attack;
}
import java.util.Scanner;
import java.util.Random;


public class Enemy
{
  public static void main(String[] args)
  {
    //Set up Scanner Object for keyboard input
    Scanner keyboard = new Scanner(System.in);
    
    //Set up health.
    int health = 50;
    
    while(health > 0)
    {
    //Allow User to select move.
    System.out.println("Choose a move using A, S, W, or D: ");
    char ch = keyboard.next().charAt(0);
    
    char chUp = Character.toUpperCase(ch);
      switch(chUp)
      {
        case 'A':
        Random rand = new Random();
        int a = rand.nextInt(5) + 6;
        health = health - a;
        System.out.println("Health: " + health);
        continue;
        
        case 'S':
        Random rand1 = new Random();
        int s = rand1.nextInt(2) + 6;
        health = health - s;
        System.out.println("Health: " + health);
        continue;
        
        case 'W':
        Random rand2 = new Random();
        int w = rand2.nextInt(3)+4;
        health = health - w;
        System.out.println("Health: " + health);
        continue;
        
        case 'D':
        Random rand3 = new Random();
        int d = rand3.nextInt(7)+8;
        health = health - d;        
        System.out.println("Health: " + health);
        continue;
        
        default:
        System.out.println("Select move with A, S, W, D"); 
        continue;
      }
      
    }
  }
}
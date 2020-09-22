//JustPlaying.java
import java.util.Scanner;

public class JustPlaying
{
   public static void main(String[] args)
   {
      //Allow user input with Scanner object.
      Scanner keyboard = new Scanner(System.in);
      
      //Define enemy base health.
      int enemyHP = 50;
      
      //Allow user to choose an attack.
      while(enemyHP > 0)
      {
         System.out.println("Enemy Health: " + enemyHP);
         System.out.println("Choose Attack: ");
         System.out.println("1): Bash");
         System.out.println("2): Smash");
         System.out.println("3): Dash");
         System.out.println("4): Crash");
      
         int att = keyboard.nextInt();
      
         switch(att)
         {
            case 1:
               System.out.println("Bash!");
               enemyHP = bash(enemyHP);
               break;
            case 2:
               System.out.println("Smash!");
               enemyHP = smash(enemyHP);
               break;
            case 3:
               System.out.println("Dash!");
               enemyHP = dash(enemyHP);
               break;
            case 4:
               System.out.println("Crash!");
               enemyHP = crash(enemyHP);
               break;
            default:
               System.out.print("Invalid input!");
               break;
         }
         //Check for win condition.
         win(enemyHP);
      }
   }
   
   public static int bash(int enemyHP)
   {
      enemyHP = enemyHP - 7;
      return enemyHP;
   }
   
   public static int smash(int enemyHP)
   {
      enemyHP = enemyHP - 5;
      return enemyHP;
   }
   
   public static int dash(int enemyHP)
   {
      enemyHP = enemyHP - 4;
      return enemyHP;
   }
   
   public static int crash(int enemyHP)
   {
      enemyHP = enemyHP - 10;
      return enemyHP;
   }
   
   //Check win condition.
   public static void win(int enemyHP)
   {
      if(enemyHP <= 0)
      {
         System.out.println("Enemy defeated!");
      }
   }
}
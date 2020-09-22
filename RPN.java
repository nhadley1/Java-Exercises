//RPN.java
//Reverse Polish Notation using stack.
import java.util.Scanner;

public class RPN
{
  public static void main(String[] args)
  {
    //Set up Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Set up DoubleStack.
    DoubleStack stk = new DoubleStack(20);
    
    //Set up variables to use in expression.
    double first = 0;
    double second = 0;
    double result = 0;
    
    //Allow user to enter RPN expression.
    System.out.print("Type an RPN Expression (\":\" to end):  ");
    String token = keyboard.next();
    
    //Solve RPN expression.
    while(token.compareTo(":") != 0)
    {
      switch(token)
      {
        //Addition
        case("+"):
        first = stk.pop();
        second = stk.pop();
        
        result = second + first;
        stk.push(result);
        break;
        
        //Subtraction.
        case("-"):
        first = stk.pop();
        second = stk.pop();
        
        result = second - first;
        stk.push(result);
        break;
        
        //Multiplication.
        case("*"):
        first = stk.pop();
        second = stk.pop();
        
        result = second * first;
        stk.push(result);
        break;

        //Division.
        case("/"):
        first = stk.pop();
        second = stk.pop();
        
        result = second / first;
        stk.push(result);
        break;
        
        default:
        
        //Numeric found
        stk.push(Double.parseDouble(token));
        break;
      }
        
        //Read Next token.
        token = keyboard.next();
    } 
        //Pop Value of expression off stack and display.
        System.out.println("\nValue of expression = " + stk.pop());
      
    }
  }

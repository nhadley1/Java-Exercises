//Program that prints fizz every time the number is divisible by 3
//Buzz everytime the number is divisible by 5.
//Fizz buzz when both are true.
//For set 1..100

import java.util.Scanner;

public class FizzBuzz{
   public static void main(String args[]){
      for(int i=1; i<=100; i++){
         //Could also use 15 because AND represents multiplication.
         if(i % 3 == 0 && i % 5 == 0){
            System.out.println("Fizzbuzz");
         }
         else if(i % 3 == 0){
            System.out.println("Fizz");
         }
         else if(i % 5 == 0){
            System.out.println("Buzz");
         }
         else{
            System.out.println(i);
         }
      }
   }
}
/*
This is my comment space

Algorithm: step-by-step process to accomplish a task
Pseudocode: simplified version of code used to design a program
Sequencing: Creating the order of steps for an algorithm
Java Program Structure: Class -> Contain Objects
public class Sandwich{ -> blueprint
   public static void main() <--entry point into our program

                     }

Compile -> turns java into computer code which is a class file
method -> a function/ chunk of code that completes a process/ performs a specific task
syntax:
keywords: words alreadys assigned to an action
Class names are capitalized.
Object: instance of a Class

variables all have datatype and names 

1. Primitive type vars hold simple data 
2. Object variables (Reference Vars) -> holds an object/complex data

Primitive vars:
int
double
operations : int/int=integer division, int * double = double 
boolean 
reference types
string


Concatenate: put more than one string together using "+"
*/
// still think 3 slashes are better,

public class Main {

   public static void main(String []args) {
      /*System.out.println("Hi there");
      System.out.println("It makes no sense to divide a number by zero!");
      System.out.println(0/3);*/
      /* 
      double price = 23.25;
      System.out.println("The price is " + price);
      //System.out.println(price);

      String name = "Bob";
      System.out.println("Hi " + name);

      int intNum = 4;

      System.out.println((double) intNum);

      double dbNum =4.6;
      double negNum = -3.4;
      System.out.println((int) dbNum);
      // when we cast double to ints, it truncates our decimal, we can round manually using math
      int roundedPos = (int)(dbNum +0.5);

      System.out.println(roundedPos);

      //reverse for negative numbers

      int roundedNeg = (int)(negNum - 0.5);

      System.out.println(roundedNeg);*/

      int grade1 = 94;
      int grade2 = 86;
      int grade3 = 67;
      double average;
      int sum = grade1 + grade2 + grade3;
      average = ((double)sum / 3);

      System.out.println(average);



   }
}

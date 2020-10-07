package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number:");

    int number = input.nextInt();
    int A = number % 2;
    
    if (A == 0) {
      System.out.println("Number is even");
    } else {
      System.out.println("Number is odd");
    }
  }
}
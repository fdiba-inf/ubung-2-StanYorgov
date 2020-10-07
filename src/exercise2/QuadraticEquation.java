package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
  public static void main(String[] args) {
    Scanner A = new Scanner(System.in);
    System.out.print("Enter a number for a:");
    int a = A.nextInt();

    Scanner B = new Scanner(System.in);
    System.out.print("Enter a number for b:");
    int b = B.nextInt();

    Scanner C = new Scanner(System.in);
    System.out.print("Enter a number for c:");
    int c = C.nextInt();

    if (a != 0) {
      double D = Math.sqrt( (b * b) - 4 * a * c );

      if (D >= 0) {
       double x1 = ( (-b - D) / 2 * a );
       double x2 = ( (-b + D) / 2 * a );
       System.out.println("x1= " + x1);
       System.out.println("x2= " + x2);

      } else {
        System.out.println("Imaginary values");
      } 

    } else  if (b != 0) {
      double x = -(c / b);
      System.out.println("x= " + x);

    } else {
      if (c != 0) {
        System.out.println("No values");

      } else {
        System.out.println("Many values");

      }
      
    } 

  }

}
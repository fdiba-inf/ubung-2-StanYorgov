package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a = input.nextInt();
    double b = input.nextInt();
    double c = input.nextInt();

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
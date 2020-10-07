package exercise2;

import java.util.Scanner;

public class Circle {

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter the radius of the cirlce:");
      double Radius = input.nextInt();
      double C = 2 * Math.PI * Radius;
      double A = Math.PI * Radius * Radius;

      System.out.println("Circumference: " + C);
      System.out.println("Area: " + A);
  }

}
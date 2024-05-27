/*2)Write a class with the name Perimeter using Menu driven(Switch case) that computes the perimeter of a square, a rectangle and a circle.

Formula:

Perimeter of a square = 4 * s

Perimeter of a rectangle = 2 * (l + b)

Perimeter of a circle = 2 * (22/7) * r
*/
package com.alnassignment;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Perimeter of a square");
            System.out.println("2. Perimeter of a rectangle");
            System.out.println("3. Perimeter of a circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the side length of the square: ");
                    double s = sc.nextDouble();
                    double squarePerimeter = calculateSquarePerimeter(s);
                    System.out.println("Perimeter of the square: " + squarePerimeter);
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter the breadth of the rectangle: ");
                    double b = sc.nextDouble();
                    double rectanglePerimeter = calculateRectanglePerimeter(l, b);
                    System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                    break;
                case 3:
                    System.out.print("Enter the radius of the circle: ");
                    double r = sc.nextDouble();
                    double circlePerimeter = calculateCirclePerimeter(r);
                    System.out.println("Perimeter of the circle: " + circlePerimeter);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
    }

    public static double calculateSquarePerimeter(double s) {
        return 4 * s;
    }

    public static double calculateRectanglePerimeter(double l, double b) {
        return 2 * (l + b);
    }

    public static double calculateCirclePerimeter(double r) {
        return 2 * (22.0 / 7) * r;
    }
}


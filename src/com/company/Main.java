package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static boolean myMenu = true;


    public static void main(String[] args) {

        while (myMenu) {


            showMenu();


            int choice = 0;

            while (true) {
                try {
                    choice = sc.nextInt();
                    sc.nextLine();
                    break;

                } catch (Exception e) {
                    sc.nextLine();
                    System.out.println(" You should insert in 1, 2 or 3 'NOT TEXT!'");
                }
            }


            switch (choice) {

                case 1:
                    circleCalculations();
                    break;
                case 2:
                    RectangleCalculations();
                    break;
                case 3:
                    SquareCalculations();
                    break;

                default:
                    System.out.println("Wrong choice. Try again");
            }

            System.out.println("\n1. Calculate again");
            System.out.println("2. Exit");

            int respond = sc.nextInt();

            if (respond == 2) {
                myMenu = false;
            }
        }

    }

    private static void showMenu() {
        System.out.println("\n========================================");
        System.out.println("                   Menu");
        System.out.println("========================================");
        System.out.println("which geometric figure do you want to perform a calculation for?");
        System.out.println("\n1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("========================================");
        System.out.println("\nPlease make a choice: ");
    }

    public static void SquareCalculations() {

        System.out.println("What is the square length?");
        double length = sc.nextDouble();
        Square s = new Square();
        s.setLength(length);
        System.out.println("the area of the Square is: " + s.area() +
                "\nand the Perimeter of the Square is: " + s.perimeter());

    }

    public static void RectangleCalculations() {
        System.out.println("What is the rectangle length?");
        double length = sc.nextDouble();
        System.out.println("What is the rectangle width?");
        double width = sc.nextDouble();
        Rectangle r = new Rectangle();
        r.setLength(length);
        r.setWidth(width);
        System.out.println("the area of the rectangle is: " + r.area() +
                "\nand the Perimeter of the rectangle is: " + r.perimeter());


    }

    public static void circleCalculations() {

        System.out.println("What is the circle radius?");
        double radius = sc.nextDouble();

        Circle c = new Circle();
        c.setRadius(radius);

        System.out.println("the area of the circle is: " + c.area() +
                " and the circumference is: " + c.circumference());


    }
}

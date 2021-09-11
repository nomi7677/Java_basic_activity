package code.diff.basics;

import java.util.Scanner;

public class Read {

    public static void main(String[] args) {

        // Output

        // Problem 1
        System.out.println("Hello World");

        // Problem 2
        System.out.println("Stop");
        System.out.println("Drop");
        System.out.println("Roll");

        // Problem 3
        System.out.print("Stop");
        System.out.print("Drop");
        System.out.println("Roll");

        // ================================================================
        // Math Operators

        // Problem 4
        System.out.println(3+5);

        // Problem 5
        System.out.println(9-7);

        // Problem 6
        System.out.println(5*5);

        // Problem 7
        System.out.println(4/2);

        // Problem 8
        System.out.println(5/2);

        // Problem 9
        System.out.println(5/2.0);

        // Problem 10
        System.out.println(5%2);

        // Problem 11
        System.out.println(10%2);

        // Problem 12
        System.out.println(Math.pow(3,2));

        // Problem 13
        System.out.println(Math.pow(4,2));

        // ================================================================
        // Variables

        // Problem 14
        int myNumber = 6;
        System.out.println(myNumber);

        // Problem 15
        int yourNumber = 6;
        System.out.println(2*yourNumber);

        // Problem 16
        int a = 6;
        int b = 3;
        System.out.println(a*b);

        // Problem 17
        double sideLength = 4;
        double area = Math.pow(sideLength,2);
        System.out.println(area);

        // ================================================================
        // Input

        // Problem 18
        Scanner myScanner = new Scanner(System.in);
        System.out.println(myScanner.nextInt());

        // Problem 19
        Scanner ourScanner = new Scanner(System.in);
        int c = ourScanner.nextInt();
        int d = ourScanner.nextInt();
        System.out.println(c+d);

        // Problem 20
        Scanner yourScanner = new Scanner(System.in);
        double lengthOfSide = yourScanner.nextDouble();
        double areaOfSquare = Math.pow(lengthOfSide,2);
        System.out.println(areaOfSquare);

    }

}

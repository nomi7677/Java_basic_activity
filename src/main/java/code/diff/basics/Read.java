package code.diff.basics;

import java.util.Scanner;

public class Read {

    public static void main(String[] args) {

        // Output

        // Problem 1
        System.out.println("Hello World");

        // Its printing the text and output is Hello World

        // Problem 2
        System.out.println("Stop");
        System.out.println("Drop");
        System.out.println("Roll");

        // Its printing text Stop, Drop and Roll on separate lines

        // Problem 3
        System.out.print("Stop");
        System.out.print("Drop");
        System.out.println("Roll");

        // Its printing text Stop, Drop and Roll on same lines
        
        // ================================================================
        // Math Operators

        // Problem 4
        System.out.println(3+5);

        // It is performing arithmetic addition operation. output is 8

        // Problem 5
        System.out.println(9-7);
        // It is performing arithmetic subtr operation. output is 2
        // Problem 6
        System.out.println(5*5);

        // It is performing arithmetic multiplication operation. output is 25

        // Problem 7
        System.out.println(4/2);
        // It is performing arithmetic div operation and output is 2

        // Problem 8
        System.out.println(5/2);
        // It is performing arithmetic div operation and output is 2
        // Problem 9
        System.out.println(5/2.0);
        // It is performing arithmetic div operation and output is 2.5
        // Problem 10
        System.out.println(5%2);
        // It is performing arithmetic modulus operation and output is 1
        // Problem 11
        System.out.println(10%2);
        // It is performing arithmetic modulus operation and output is 0
        // Problem 12
        System.out.println(Math.pow(3,2));
        // It is using Math.pow function and output is 9.0
        // Problem 13
        System.out.println(Math.pow(4,2));

        // It is using Math.pow function and output is 16.0
        // ================================================================
        // Variables

        // Problem 14
        int myNumber = 6;
        System.out.println(myNumber);

        // Defining myNumber variable in first line and then printing it. output is 6

        // Problem 15
        int yourNumber = 6;
        System.out.println(2*yourNumber);
// Defining yourNumber variable in first line and then printing it by multiplying with 2. output is 12

        // Problem 16
        int a = 6;
        int b = 3;
        System.out.println(a*b);

// Defining 2 variables a and b and then printing product of these 2 variables in next line
        // Problem 17
        double sideLength = 4;
        double area = Math.pow(sideLength,2);
        System.out.println(area);

// using double data type to define 2 varibles and taking power of 2 on sides. output is on next line which os 16.0
        // ================================================================
        // Input

        // Problem 18
        Scanner myScanner = new Scanner(System.in);
        System.out.println(myScanner.nextInt());

    // read a number from System.in and print the value keyed by the user

        // Problem 19
        Scanner ourScanner = new Scanner(System.in);
        int c = ourScanner.nextInt();
        int d = ourScanner.nextInt();
        System.out.println(c+d);

// read 2 numbers c and d from System.in and print the value keyed by the user by adding them

        // Problem 20
        Scanner yourScanner = new Scanner(System.in);
        double lengthOfSide = yourScanner.nextDouble();
        double areaOfSquare = Math.pow(lengthOfSide,2);
        System.out.println(areaOfSquare);
// read a number entered by user. apply math.pow by taking square of number and print output on next line e.g for 3 it would be 9.0
    }

}

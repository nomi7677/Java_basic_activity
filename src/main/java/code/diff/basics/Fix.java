package code.diff.basics;

import java.util.Scanner;

public class Fix {

    public static void main(String[] args) {

        // Syntax

        // Problem 1
        // semi colon missing
        System.out.println("Hello World");

        // Problem 2
        // quotes are missing
        System.out.println("Hello World");

        // Problem 3
        // S is lowercase
        System.out.println("Hello World");

        // Problem 4
        // age variable was not defined
        String age = " 01-01-1800";
        System.out.println(age);

        // Problem 5
        // score is not initialized
        int score = 10;
        System.out.println(score);

        // Problem 6
        //same name for both variables
        int height = 5;
       // System.out.println(height);

       /*int */  height = 7;
        System.out.println(height);

        // Problem 7
        // changed data type from double to int
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        System.out.println(temp);

        // Problem 8
        // equal signs were missing
        int count = 0;
        count += 1;
        count += 2;
        count += 3;
        System.out.println(count);

        // ================================================================
        // Semantic

        // Problem 9
        // take out quotes and colon
        double weight = 200;
        System.out.println(weight);

        // Problem 10
        // nothing wrong
        Scanner input1 = new Scanner(System.in);
        int i = input1.nextInt();
        System.out.println(i);

        Scanner input2 = new Scanner(System.in);
        int j = input2.nextInt();
        System.out.println(j);

        // Problem 11
        // changed data type from int to float
        float fahrenheit = 45;
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println(celsius);

        // Problem 12
        // added parenthesis around variables in average and changed data type from int to double
        double a = 4;
        double b = 3;
        double c = 12;
        double average = (a + b + c) / 3;
        System.out.println(average);

    }





}

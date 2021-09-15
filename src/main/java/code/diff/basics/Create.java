package code.diff.basics;

import java.util.Scanner;

public class Create {

    public static void main(String[] args) {

        // Problem 1: Java Ascii Art
        // In the resource folder there is a file named "createOne.png". Replicate
        // the image in the terminal
        System.out.println("    J     A   V     V  A");
        System.out.println("    J    A A   V   V  A A");
        System.out.println("J   J   AAAAA   V V  AAAAA");
        System.out.println(" J J   A     A   V  A     A");

        // Problem 2: Celsius to Fahrenheit
        // Prompt the user for a temperature in celsius, convert the value to its
        // fahrenheit equivalent, and display in the terminal

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in celsius");
        double cel = sc.nextFloat();

        double fahr = (1.8 * cel) + 32;
        System.out.println(fahr);


        // Problem 3: Hours and Minutes
        // Prompt the user for a number of minutes and display the equivalent number
        // of hours and minutes
        // Ex: 67 -> 1 hour, 7 minutes
        // Ex: 139 -> 2 hours, 19 minutes


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter number of minutes");
        long min = sc1.nextLong();

        long hr = min / 60;
        long min1 = min%60;
        System.out.println("hours are:" + hr + " " + "and " + "minutes are:" +min1);

        // Problem 4: BMI Calculator
        // Prompt the user for their weight and height and display their BMI
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Input weight in kilogram: ");
        double weight = sc2.nextDouble();
        System.out.println("Input height in meters: ");
        double height = sc2.nextDouble();
        double BMI = weight / (height * height);
        System.out.println(BMI);

        // Problem 5: Tip Calculator
        // Prompt the user for a bill amount and gratuity rate and display to bill
        // plus gratuity
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the bill amount ");
        double amount = sc3.nextDouble();
        double gratuityRate = sc3.nextDouble();
        double gratuity = amount * (gratuityRate / 100);
        double total = amount + gratuity;
        System.out.println(total);

        // Problem 6: Quadratic Formula
        // Prompt the user for three values (a, b, and c) and use those values to
        // calculate x in the quadratic formula. Display the values of x that you
        // calculate

        double secondRoot = 0, firstRoot = 0;
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter value of a ");
        double a = sc3.nextDouble();
        System.out.println("Enter value of b ");
        double b = sc3.nextDouble();
        System.out.println("Enter value of c ");
        double c = sc3.nextDouble();

        double determinant = (b * b) - (4 * a * c);
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            firstRoot = (-b + sqrt) / (2 * a);
            secondRoot = (-b - sqrt) / (2 * a);
            System.out.println("Roots are :: " + firstRoot + " and " + secondRoot);
        } else if (determinant == 0) {
            System.out.println("Root is :: " + (-b + sqrt) / (2 * a));

        }

    }
}

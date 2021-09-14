package code.diff.basics;

import java.util.Scanner;

public class Write {

    public static void main(String[] args) {

        // Output

        // Problem 1: Info
        // Display your name, birthday, and birth place
        String name = "Nauman Khalid";
        String dob ="01/01/2000" ;
        String birthPl = "Pak";

        System.out.println("My name is:" + name);
        System.out.println("My Date of birth is:" + dob);
        System.out.println("My birth place is:" + birthPl);

        // Problem 2: Welcome Repeated
        // Display the message "Welcome to Java!" five times
        String msg = "Welcome to Java!";
        System.out.println(msg);

        // ================================================================
        // Math Operators

        // Problem 3: Area and Perimeter
        // Write a program that displays the area and perimeter of a rectangle
        // that has a width of 8.3 and a height of 4.1
        double widthOfSide = 8.3;
        double heightOfSide= 4.1;

        double areaOfRectangle = widthOfSide * heightOfSide;
        double perimeterOfRectangle = 2* (widthOfSide+heightOfSide);

        System.out.println("Area of Rectangle is:" + areaOfRectangle);
        System.out.println("Perimeter of Rectangle is:" + perimeterOfRectangle);
        

        // Problem 4: Mph
        // A runner took 58 minutes and 20 seconds to run 12 kilometers. Calculate
        // how fast there were running in mph

        float timeSeconds;
        float mps,kph, mph;
        
        float distance = 12;
        float hr = 0;
        float min = 58;
        float sec = 20;

        timeSeconds = (hr*3600) + (min*60) + sec;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        mph = (kph / 1.609f) * 100;
        
        System.out.println("Your speed in meters/second is "+mps);
        System.out.println("Your speed in km/h is "+kph);
        System.out.println("Your speed in miles/h is "+mph);
        // Problem 5: Cone Volume
        // A pyramid is 10 ft tall and has a radius of 2.1 ft. Calculate the volume of
        // the pyramid


        // ================================================================
        // Variables

        // Problem 6: Two Variable
        // Create two variables, each with their own number. Display the output of the
        // sum of the two numbers
         int a = 6;
        int b = 3;
        System.out.println(a+b);

        // Problem 7: Double or Nothing
        // Create a variable and assign it an integer value. Update the variable to have
        // twice its original value.
        // Ex: If the variable starts at 6, it's value after the doubling should be 12
        int a = 5;
        a = 2* a;
        System.out.println(a);

        // Problem 8: Counting up
        // Create a variable and assign it a value of 0. Increment its value 5 times. The
        // variable should have a value of 5 at the end of the program
        int a = 0;
        a = a+1;
        a = a+1;
        a = a+1;
        a = a+1;
        a = a+1;
        System.out.println(a);


        // Problem 9: Counting down
        // Create a variable and assign it a value of 3. Decrement its value 6 times. The
        // variable should have a value of -3 at the end of the program
        int a = 3;
        a -= 1;
        a -= 1;
        a -= 1;
        a -= 1;
        a -= 1;
        a -= 1;
        System.out.println(a);

        // ================================================================
        // Input

        // Problem 10: Age
        // Prompt the user for their age and display what the user enters
        
        String age;

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your age");
        age = sc.nextLine();
        System.out.println(age);

        // Problem 11: Circumference
        // Prompt the user for a radius, calculate the circumference of a circle with
        // that radius, and display the result

         double radi, circum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius");
        radi = scan.nextFloat();

        circum = (int) (2* radi * Math.PI);
        System.out.println(circum);

        // Problem 12: Area of a Circle
        // Prompt the user for a radius, calculate the area of a circle with that radius,
        // and display the result
        double rad, areaOfCir;
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter the radius");
        rad = scann.nextFloat();
        areaOfCir = Math.PI * rad * rad;

        System.out.println(areaOfCir);


        // Problem 13: Two Numbers
        // Prompt the user for two numbers, multiply them, and display the answer in the
        // terminal
        int num1, num2, prod;
        Scanner scane = new Scanner(System.in);
        System.out.println("Enter the number 1");
        num1 = scane.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the number 2");
        num2 = scan2.nextInt();
        prod = num1 * num2;

        System.out.println(prod);




    }





}

package org.example;

import java.util.Scanner;

public class ifElseStatement {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // if statement
        System.out.println("enter two positive number");
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();

        if (number1 < 0 && number2 < 0) {
        System.out.println("please you must enter positive numbers");
        System.exit(1);
    }
        else {
            System.out.println("Next time please enter positive numbers");
        }

    int answer = number1 + number2;

        System.out.println("The result of" + " + " + number2 + " is " + answer);
}
}



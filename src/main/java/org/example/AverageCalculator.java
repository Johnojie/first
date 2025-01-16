package org.example;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        double[] numbers = new double[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate the sum of the array
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        // Calculate and display the average
        double average = sum / size;
        System.out.println("The average value of the array elements is: " + average);

        // Close the scanner
        scanner.close();
    }
}
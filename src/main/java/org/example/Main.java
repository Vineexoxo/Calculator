package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double squareRoot(double x) {
        logger.info("Start of Execution of squareRoot");
        if (x<0) {
            logger.warn("Invalid input");
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        double result = Math.sqrt(x);
        logger.info("End of Execution of squareRoot");
        return result;
    }

    public static long factorial(int x) {
        logger.info("Start of Execution of factorial");
        if (x<0) {
            logger.warn("Invalid input");
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        logger.info("End of Execution of factorial");
        return result;
    }

    public static double naturalLogarithm(double x) {
        logger.info("Start of Execution of naturalLogarithm");
        if (x <= 0) {
            logger.warn("Invalid input");
            throw new IllegalArgumentException("Number must be positive.");
        }
        double result = Math.log(x);
        logger.info("End of Execution of naturalLogarithm");
        return result;  // Natural logarithm (base e)
    }


    public static double power(double base, int exponent) {
        logger.info("Start of Execution of power");
        double result = Math.pow(base, exponent);
        logger.info("End of Execution of power");
        return result;
    }

    public static void main(String[] args) {
        logger.info("Start of Execution");
        Scanner reader = new Scanner(System.in);
        boolean flag = true;

        System.out.println("-----Welcome to Calculator-----\n");

        while (flag) {
            System.out.println("Select an operation:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit\n");
            System.out.print("Enter your choice: ");
            int operation = reader.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter a number for square root: ");
                    double num = reader.nextDouble();
                    try {
                        double result = squareRoot(num);
                        System.out.println("Square root of " + num + " is: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter a number for factorial: ");
                    int numm = reader.nextInt();
                    try {
                        long result = factorial(numm);
                        System.out.println("Factorial of " + numm + " is: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter a number for natural logarithm: ");
                    num = reader.nextDouble();
                    try {
                        double result = naturalLogarithm(num);
                        System.out.println("Natural logarithm of " + num + " is: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter the base number: ");
                    double base = reader.nextDouble();
                    System.out.print("Enter the exponent: ");
                    int exponent = reader.nextInt();
                    double result = power(base, exponent);
                    System.out.println(base + " raised to the power of " + exponent + " is: " + result);
                    break;

                case 5:
                    System.out.println("Exiting the Calculator. Goodbye!");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please choose a valid operation.");
            }
            System.out.println();
        }

        reader.close();
        logger.info("End of Execution");
    }
}

// This is a comment
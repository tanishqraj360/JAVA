//Develop a JAVA program to raise a custom exception (user defined exception) for DivisionByZero using try, catch, throw and finally

import java.util.Scanner;

class DivisionByZero extends Exception {
    public DivisionByZero(String message) {
        super(message);
    }
}

public class OOPJ_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter Numerator: ");
        num1 = sc.nextInt();
        System.out.println("Enter Denominator: ");
        num2 = sc.nextInt();

        sc.close();

        try {
            int result = performDivision(num1, num2);
            System.out.println("Result: " + result);
        } catch (DivisionByZero e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static int performDivision(int numerator, int denominator) throws DivisionByZero {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            throw new DivisionByZero("Arithmetic exception: " + e.getMessage());
        }
    }
}

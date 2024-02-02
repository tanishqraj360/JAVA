// Develop a JAVA program to raise a custom exception (user defined exception) for DivisionByZero using try, catch, throw and finally

import java.util.Scanner;

class InvalidInput extends Exception {
    public InvalidInput(String message) {
        super(message);
    }
}

public class OOPJ_7_throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1, num2;
        int result[] = new int[2];
        System.out.println("Enter Numerator: ");
        num1 = sc.next();
        System.out.println("Enter Denominator: ");
        num2 = sc.next();
        sc.close();
        try {
            result = DivisionError(num1, num2);
            try {
                System.out.println(result[0] + " / " + result[1] + " = " + result[0] / result[1]);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        } catch (InvalidInput e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static int[] DivisionError(String numerator, String denominator)

            throws InvalidInput {
        try {
            int ret[] = new int[2];
            ret[0] = Integer.parseInt(numerator);
            ret[1] = Integer.parseInt(denominator);
            return ret;
        } catch (NumberFormatException e) {
            throw new InvalidInput("Invalid Input. Please Try Again");
        }
    }
}
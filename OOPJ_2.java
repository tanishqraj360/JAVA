//Develop a JAVA program to add TWO matrices of suitable order N

import java.util.Scanner;

public class OOPJ_2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);

        int mat1[][] = new int[n][n];
        int mat2[][] = new int[n][n];
        int mats[][] = new int[n][n];

        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of two matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mats[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(mats[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}

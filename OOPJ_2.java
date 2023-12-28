//Develop a JAVA program to add TWO matrices of suitable order N

import java.util.Scanner;

public class OOPJ_2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of matrix: ");
        n = sc.nextInt();
        int mat[][] = new int[n][n];

        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print("row " + i + " : ");
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();

        }

        sc.close();
    }
}

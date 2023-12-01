//  Check location of a number in a 2d Array.

import java.util.Scanner;

public class Arrays2d2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of rows: ");
        int size1 = sc.nextInt();

        System.out.println("ENter the sixe of column: ");
        int size2 = sc.nextInt();

        int[][] sudoku = new int[size1][size2];

        for (int i = 0;i<size1;i++) {
            for (int j= 0; j<size2;j++) {
                System.out.print("Enter elements: ");
                sudoku [i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        System.out.println("The number you entered is found at location: ");
        for (int i = 0; i<size1;i++) {
            for (int j = 0;j<size2;j++) {
                if (sudoku[i][j]==x) {
                    System.out.println("Number found at location (" + i + "," + j + ")");
                }
            }
            System.out.println();
        }

    }
}



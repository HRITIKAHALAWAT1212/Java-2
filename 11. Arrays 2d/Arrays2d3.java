// WAP to print SPiral order matrix.

// 1. code to print matrix
// import java.util.Scanner;

// public class Arrays2d3 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter rows of matrix: ");
//         int rows = sc.nextInt();
//         System.out.println("Enter columns of matrix: ");
//         int col = sc.nextInt();

//         int[][] matrix = new int [rows][col];

//         // Input
//         for (int i = 0;i<rows;i++) {
//             for (int j=0;j<col;j++) {
//                 System.out.println("Enter elements: ");
//                 matrix[i][j] = sc.nextInt();

//             }
//         }
//         System.out.println("Matrix: ");
//         // Output
//         for (int i = 0;i<rows;i++) {
//             for (int j = 0;j<col;j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }


//     }
// }

// 2. Code to print spiral order:

import java.util.Scanner;

public class Arrays2d3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter columns of matrix: ");
        int cols = sc.nextInt();

        int[][] matrix = new int [rows][cols];

        // Input
        for (int i = 0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                System.out.println("Enter elements: ");
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("The Spiral order Matrix is: ");
        
        int rowstart = 0;
        int rowend = 0;
        int colstart = 0;
        int colend = 0;

        // Output
        
        while(rowstart <= rowend && colstart <= colend ) {
            for(int col=colstart;col<=colend; col++) {
                System.out.print(matrix[rowstart][col] + " ");
            }

            rowstart++;
            
            for(int row=rowstart;row<=rowend;row++) {
                System.out.print(matrix[row][colend] + " ");
            }
            colend--;
            for(int col=colend; col>=colstart; col--) {
                System.out.print(matrix[rowend][col] + " ");
            }
            rowend--;
            for(int row=rowend; row>=rowstart; row--) {
                System.out.print(matrix[row][colstart] + " ");
            }
            colstart++;

            System.out.println();
        }
    }
}
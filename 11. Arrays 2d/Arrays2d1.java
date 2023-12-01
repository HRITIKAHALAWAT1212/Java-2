// Arrays 2d

// Arrays in 1d :--
// import java.util.Scanner;

// public class Arrays2d1 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

        
//         int[] marks = new int[5];

//         for (int i = 0;i<5;i++) {
//             System.out.print("Enter elements: ");
//             marks [i] = sc.nextInt();
//         }
        
//         for (int i = 0; i<5;i++) {
//             System.out.println(marks[i]);
//         }
        

//     }
// }

// Arrays in 2d:- 

import java.util.Scanner;

public class Arrays2d1 {
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

        System.out.println("The Sudoku puzzle you entered: ");
        for (int i = 0; i<size1;i++) {
            for (int j = 0;j<size2;j++) {
                System.out.print(sudoku[i][j]+ " ");
            }
            System.out.println();
        }

    }
}



// WAP to print a (Number Pyramid).
/*
 *           1
 *          2 2
 *         3 3 3
 *        4 4 4 4
 *       5 5 5 5 5
 */

// 1st Method

// public class HW_pattern12 {
//     public static void main(String[] args) {
//         int n = 5;
//         int m = 1;
//         for (int row=1;row<=n;row++) {
//             for (int spc = n-1;spc>=row;spc--) {
//                 System.out.print(" ");
//             }
//             for (int col =1; col<=row;col++) {
//                 System.out.print(m+" ");

//             }
//             System.out.println();
//             m++;

//         }
        
//     }
// }

// 2nd Method

// public class HW_pattern12 {
//     public static void main(String[] args) {
//         int n = 5;
//         int m = 1;
//         for (int row = 1; row<=n;row++) {
//             for (int spc=1;spc<=n-row;row++) {
//                 System.out.print(" ");
//             }
//             for (int col =1; col<=n;col++) {
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//             m++;
//         }
//     }
// }

public class HW_pattern12 {
    public static void main(String[] args) {
        int n =5;
        int m =1;
        

        for(int row=1;row<=n;row++) {
            int space = n-row;
            for (int spc = 1;spc<=space;spc++ ) {
                System.out.print(" ");
            }
            
            for (int col =1;col<=row;col++) {
                System.out.print(m + " ");
                
            }
            System.out.println();
            m++;
            
        }
    }
}
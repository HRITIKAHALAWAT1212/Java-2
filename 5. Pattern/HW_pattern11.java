// WAP to print (Solid Rhombus).
/*
 *              *****
 *             *****
 *            *****
 *           *****
 *          *****
 */

// 1st Method

// public class HW_pattern11 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int row =1;row<=n;row++) {
//             // TO print space.
//             for (int col=n-1;col>=row;col--) {
//                 System.out.print(" ");
//             }
//             // TO print Arterisk.
//             for (int col=1;col<=n;col++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        

//     }
// }

//  2nd Method

// public class HW_pattern11 {
//     public static void main(String[] args) {
//         int n = 5; 
//         for(int row=1;row<=n;row++) {
//             for (int spc=1;spc<=n-row;spc++) {
//                 System.out.print(" ");
//             }
//             for (int col=1;col<=n;col++) {
//                 System.out.print("*");
//             }   
//         System.out.println();
//         }


//     }
// }


public class HW_pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row<=n;row++) {
            // space
            int space = n-row;
            for (int spc=1;spc<=space;spc++) {
                System.out.print(" ");
            }
            // column stars
            for (int col=1;col<=n;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

        
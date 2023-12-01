// WAP to print a (Diamond pattern).
/*
                    *
                   ***
                  *****
                 *******
                *********
                *********
                 *******
                  *****
                   ***
                    *

 */

public class HW_pattern16 { 
    public static void main(String[] args) {
        int n = 4;
        
        // outer loop for ROWS of upper half
        for (int row = 1; row<=n; row++) {
            // inner loop for spaces
            for (int spc = 1; spc<= n-row;spc++) {
                System.out.print(" " + " ");
            }
            // inner loop for 1st part stars
            for (int col = 1; col<=row;col++) {
                System.out.print("*" + " ");
            }
            for (int col = 2 ; col<=row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // outer loop for ROWS of lower half
        for (int row = n; row>=1; row--) {
            // inner loop for spaces
            for (int spc = 1; spc<= n-row;spc++) {
                System.out.print(" " + " ");
            }
            // inner loop for 1st part stars
            for (int col = 1; col<=row;col++) {
                System.out.print("*" + " ");
            }
            for (int col = 2 ; col<=row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    
}

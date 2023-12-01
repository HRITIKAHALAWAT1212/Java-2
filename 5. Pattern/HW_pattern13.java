// WAP to print a (Number Pyramid).
/*
 *              1
 *            2 1 2
 *          3 2 1 2 3
 *        4 3 2 1 2 3 4 
 *      5 4 3 2 1 2 3 4 5
 */



public class HW_pattern13 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1;row<=n;row++) {
            // space 
            for (int spc = 1;spc<=n-row;spc++) {
                System.out.print(" " + " ");
            } 
            // First part
            for (int col = row;col>=1;col--) {
                System.out.print(col + " ");
            }
            // Second part
            for (int col = 2;col <=row;col++ ) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        
        
    }
}

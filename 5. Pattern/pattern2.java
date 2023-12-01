// Pattern no.2   (Hollow Rectangle)
/* Wap to print the star pattern of the follwing pattern. 
 *             *****
 *             *   *
 *             *   *
 *             *****
 */
/* Approach:- we will try to print all the stars at i=1,j=1,i=m,j=n. and will print spaces all other places. */

public class pattern2 {
    public static void main(String[] args) {
        int n=4;
        int m=5;

        for (int row = 1; row <=n; row = row+1) {
            for (int col = 1; col <=m; col = col+1) {
                if (row==1 || col==1 || row == n || col == m ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } 
            System.out.println("");   
        }
    }
}
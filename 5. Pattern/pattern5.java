// Pattern no.5  (Inverted Half-Pyramid) (rotated by 180 deg.)
/* WAP To print the following star pattern:- 
                   *
                  **
                 ***
                ****
 */


public class pattern5 {
    public static void main(String[] args) {
        int n = 4;
        // outer loop- to print rows.
        for (int row=1;row<=n;row=row+1) {
            // inner loop- to print columns.
            for (int spc = 1;spc<=n-row;spc++) {
                System.out.print(" ");
            }
            // inner loop- to print star.
            for (int col=1;col<=row;col=col+1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*Tough qustion 
 * Approach was simple , first we have to print "spaces" and then "stars"
 * first we will make nested for loop for printing spaces 
 * No. of spaces = N-no.of rows
 * No. of stars = no.of rows.
 */
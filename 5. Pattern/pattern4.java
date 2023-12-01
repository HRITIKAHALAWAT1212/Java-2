// Pattern no.4  (Inverted Half-Pyramid)
/* WAP To print the following star pattern:- 
                ****
                ***
                **
                *
 */


 public class pattern4 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1;row<=n;row=row+1) {
            for (int col = 4; col>=row;col=col-1) {
                System.out.print("*");

            }
            System.out.println();
            
        }

    }
 }


//  Method -2 
/*
 * Not able to understand properly.
 */

public class pattern4 {
    public static void main(String[] args) {
        int n=4;
        for (int row=n;row>=1;row=row-1) {
            for (int col=1;col<=row;col=col+1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
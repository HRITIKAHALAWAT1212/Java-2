// Pattern no.4  (Half-Pyramid)
/* WAP To print the following star pattern:- 
                *
                **
                ***
                ****
 */

public class pattern3 {
    public static void main(String[] args) {
        int n =4;
        for (int row = 1; row<=n;row=row+1) {
            for (int col = 1; col<=row;col=col+1) {
                System.out.print("*");
            }
            System.out.println("");


        }
    }
}

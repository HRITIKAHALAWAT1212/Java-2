// Pattern no.14  (Butterfly Pattern).
/* WAP To print the following star pattern:- 

            *      *
            **    **
            ***  ***
            ********
            ********
            ***  ***
            **    **
            *      *

 */

public class HW_pattern14 {
    public static void main(String[] args) {
        int n = 4;
        // Upper Half
        for (int row =1;row<=n;row++) {
            // first part star
            for(int col=1;col<=row;col++) {
                System.out.print("*");
            }
            // for spaces
            int space = 2*(n-row);
            for(int spc=1;spc<=space;spc++) {
                System.out.print(" ");
            }
            // second part star
            for (int col=1;col<=row;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int row =n;row>=1;row--) {
            // first part star
            for(int col=1;col<=row;col++) {
                System.out.print("*");
            }
            // for spaces
            int space = 2*(n-row);
            for(int spc=1;spc<=space;spc++) {
                System.out.print(" ");
            }
            // second part star
            for (int col=1;col<=row;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

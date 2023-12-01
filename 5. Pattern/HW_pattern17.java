// Pattern no.15  (Half Pyramid).
/* WAP To print the following star pattern:- 

                     1 
                    1 2 
                   1 2 3 
                  1 2 3 4 
                 1 2 3 4 5 

 */


public class HW_pattern17 {
    public static void main(String[] args) {
        int n = 5;
        for (int row= 1; row<=n;row++) {
            // spaces
            for (int spc=1;spc<= n-row; spc++) {
                System.out.print(" ");
            }
            // numbers 
            for (int col=1; col<=row; col++) {
                System.out.print(col + " ");       
            }
            System.out.println();
        }
    }
}

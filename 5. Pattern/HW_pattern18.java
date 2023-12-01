// Pattern no.15  (Inverted Half Pyramid).
/* WAP To print the following star pattern:- 

                1 1 1 1 1  
                 2 2 2 2    
                  3 3 3
                   4 4
                    5 
                 
 */

public class HW_pattern18 {
    public static void main(String[] args) {
        int n = 5; 
        for (int row=n;row>=1;row--) {
            for(int spc = 2;spc<=n;spc++) {
                System.out.print(" ");
            }
            for (int col =1; col<=n-row+1;col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}

// Pattern no.10  (0-1 Triangle).
/* WAP To print the following star pattern:- 
                1
                0  1
                1  0  1
                0  1  0  1
                1  0  1  0  1
 */

public class pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        for(int row=1;row<=n;row++) {
            for (int col=1;col<=row;col++) {
                int sum = row + col;
                if (sum%2==0) {
                    System.out.print("1 ");
                
                } else {
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
    }
    
}

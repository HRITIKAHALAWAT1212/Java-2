// Pattern no.9  (Floyd's Triangle).
/* WAP To print the following star pattern:- 
                1
                2  3
                4  5  6
                7  8  9  10
                11 12 13 14 15
 */

public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int number =1;

        for (int row =1;row<=n;row=row+1) {
            for (int col=1;col<=row;col=col+1) {
                System.out.print(number + " ");
                number = number +1;

            }
            System.out.println();
        }
    }
    
}

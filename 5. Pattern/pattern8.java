// Pattern no.4  (Inverted Half-Pyramid with numbers).
/* WAP To print the following star pattern:- 
                12345
                1234
                123
                12
                1
 */


public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for (int row =n;row>=1;row--) {
            for (int col = 1;col<=row;col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

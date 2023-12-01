// Pattern no.4  (Inverted Half-Pyramid with numbers).
/* WAP To print the following star pattern:- 
                54321
                5432
                543
                54
                5
 */

public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        // outer loop to print rows.
        for (int row = 1; row<=n;row++) {
            // inner loop to print columns.
            for (int col =5;col>=row;col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    
}

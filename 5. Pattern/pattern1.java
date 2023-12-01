// Pattern no. 1   (Solid Rectangle)
/* WAP to program to print star pattern as follows :-->>
 *                   *****
 *                   *****
 *                   *****
 *                   *****
 */


public class pattern1 {
    public static void main(String[] args) {
        
        int n = 4;
        for (int row = 1; row<=n;row = row +1) {     /* this for  */
            for (int col = 1; col<=n+1 ; col = col + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//  Pattern no.6  (Half-Pyramid with numbers)
/* WAP To print the following star pattern:- 
                1
                12 
                123
                1234
                12345
 */



public class pattern6 {
    public static void main(String[] args) {
        int n=5;
        for (int row=1;row<=n;row=row+1) {
            for(int col=1;col<=row;col=col+1) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
    
}


/* Easy question
 * Approach was simple , first try to make a loop for columns, and print column value in it.
 */

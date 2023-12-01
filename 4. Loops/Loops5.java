// Print a table of number 'n'

import java.util.Scanner;

public class Loops5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1;i<=10;i=i+1) {
            System.out.println(n + "*" + i + "=" + n*i );
            // break n*i <= n*10;

        }
        sc.close();
    }
}

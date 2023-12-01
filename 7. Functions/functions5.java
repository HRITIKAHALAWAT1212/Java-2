//Q5. Make a function to check if a number is prime or not.   (DOUBT)

import java.util.Scanner;

public class functions5 {
    public static void primeCheck(int n) {
        int div = 2;
        boolean out;

        
        for (int i = 0; i<n;i++) {
            if (n%div==0) {
                div++;
                out = true;
                return;
            }

            else {
                out = false;
                return;
            }

            if (out == true) {
                System.out.print("Not Prime number.");
            }
            if (out == false) {
                System.out.print("Prime number.");
            }
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        primeCheck(n);;
        
    }
}

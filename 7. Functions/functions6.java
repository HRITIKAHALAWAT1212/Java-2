//Q6. Make a function to check if a given number n is even or not.

import java.util.Scanner;

public class functions6 {
    public static int checkEven (int n) {
        
        if (n%2==0) {
            System.out.print("Number is even.");
        }
        else {
            System.out.print("Number is not even.");
        }
        return n;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        checkEven(n);


    }
}

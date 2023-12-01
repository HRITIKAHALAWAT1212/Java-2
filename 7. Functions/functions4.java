// Q4. Print a factorial of a number.

import java.util.Scanner;

public class functions4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int n = sc.nextInt();
        factorial(n);

    }
    public static int factorial (int n) {
        if (n<0) {
            System.out.print("Invalid number");
            return;            
        }
        if (n==0) {
            System.out.print("Factorial of a number is: 1");
            return;
        }
    
        int num = 1;
        for (int i = n; i>=1;i--) {
            num = num*i;
        }
        System.out.print("Hi User,\nFactorial of a number is: " + num);
        return num;

    }
}
/*Q9.Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
(BONUS) */

import java.util.Scanner;

public class funcex9 {

    public static void printFibonacci (int n) {
        int res = 0;
        int res1 = 1;
        for (int i = 1; i<=n;i++) {
            System.out.print(res + " ");
            res = res + res1;
            res1++;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        printFibonacci(n);
    }


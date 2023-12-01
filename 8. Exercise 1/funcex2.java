//Q2. Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class funcex2 {
    public static int SumOdd (int n ) {
        int sum = 0;
        for (int i = 1; i<=n; i+=2) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = SumOdd(n);
        System.out.println("Sum of odd number from 1 to "+n+" is "+result);
    }
}
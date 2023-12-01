// Q3. Print the product of two given numbers.

import java.util.Scanner;

public class functions3 {
    public static int CalculateProduct ( int a, int b ) {
        return a*b;
    }

    public static void main(String[] args) {
        
        System.out.println("enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of two numbers is : " + CalculateProduct(a, b));
    }
}

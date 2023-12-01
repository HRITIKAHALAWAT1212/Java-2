//Q2. Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class funcex3 {
    public static void GreaterOftwo (int a, int b) {
        if (a>b) {
            System.out.print("A is greater than B. ");
            // return a;
        } else {
            System.out.print("B is greater than A. ");
            // return b;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // int result = GreaterOftwo(a,b);
        // System.out.print("Greater of the two numbers is: "+ result);
        
        GreaterOftwo(a, b);
    }
    
}

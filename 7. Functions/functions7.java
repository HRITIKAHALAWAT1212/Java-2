//Q7. Make a function to print the table of a given number n.

import java.util.Scanner;

public class functions7 {
    public static void printTable (int n) {
        System.out.println("Table of " + n + " is as follows:-");
        System.out.println();
        for(int i = 1;i<=10;i++) {
            int pro;
            pro = n * i;
            System.out.println(n + " * " + i + " = " + pro);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the table of: ");
        int n = sc.nextInt();

        printTable(n);

    }
}

// Q2. Print the sum of two given numbers.


import java.util.Scanner;

public class functions2 {
    public static int printSum (int a , int b) {
        int sum = a +b;
        return sum;

    }
    
    public static void main(String[] args) {
        
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = printSum(a, b);
        System.out.println("sum of two numbers is: "+sum);
    }

}

//  Sum of 'n' natural numbers.

import java.util.Scanner;
public class Loops4 {
    
    public static void main(String[] args) {
        
        System.out.println("Enter any number; ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0; i<=n; i++) {
            sum = sum + i;
            System.out.println(sum);
        }

        System.out.println(sum);
    }
}

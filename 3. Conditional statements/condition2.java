// Q2. WAP a program to find that a number is odd or even?

import java.util.*;

public class condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ((num%2)==0) {
            System.out.println("Number is even");
        } else {
            System.out.println("number is odd.");
        }
    }
}
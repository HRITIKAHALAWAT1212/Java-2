// Q1. WAP to check a person is an adult or not.

import java.util.*;

public class condition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>18) {
            System.out.println(("You are an adult."));
        }
        else {
            System.out.println("no adult");
        }
    }
}



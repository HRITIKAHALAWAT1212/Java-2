//Q5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;

public class funcex5 {
    public static void VoterAge (int age) {
        if (age>18) {
            System.out.println("You are eligible to vote.");
            return;
        }
        else {
            System.out.println("You are not eligible to vote.");
            return;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        VoterAge(age);
    }
    
}

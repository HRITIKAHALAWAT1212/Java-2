import java.util.Scanner;


public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        do {
            System.out.println("enter the marks");
            int marks = sc.nextInt();

            if (marks >= 90 && marks<=100) {
                System.out.println("This is good");
            } else if (marks >=60 && marks < 90) {
                System.out.println("THis is also Good");
            } else if (marks>=0 && marks < 60) {
                System.out.println("This is Good as Well");
            } else {
                System.out.println("Invalid Input");
            }
        } while (n==1);
    }
}


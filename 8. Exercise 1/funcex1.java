//Q1. Enter 3 numbers from the user & make a function to print their average.

// import java.util.Scanner; 

// public class funcex1 {
//     public static void average(int a, int b, int c) {
//         int av = (a+b+c)/3;
//         System.out.println(av);
       
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter Second number: ");
//         int b = sc.nextInt();
//         System.out.print("Enter Second number: ");
//         int c = sc.nextInt();

//        average(a, b, c);
//        sc.close();
//     }
// }

// Method 2 

import java.util.Scanner; 

public class funcex1 {
    public static int average(int a, int b, int c) {
        int av = (a+b+c)/3;
        return av;
       
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();
        System.out.print("Enter Second number: ");
        int c = sc.nextInt();

       
       System.out.println("Average of 3 numbers: "+ average(a, b, c));
       sc.close();

    }
}



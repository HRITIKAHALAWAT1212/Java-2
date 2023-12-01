//Q7.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.Scanner;

public class funcex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char first;

        int posnum;
        int negnum;
        int zernum;



        do {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            if (num>0) {
                posnum++;
            } else if (num<0) {
                negnum++;
            } else {
                zernum++;
            }

            System.out.print("Enter 'YES' or 'yes' if you want to enter number again.: ");
            String var = sc.next();

            
            
        } while (first == 'y' || first == 'Y');
        
        System.out.println("Count of positive numbers: " + posnum);
        System.out.println("Count of negative numbers: " + negnum);
        System.out.println("Count of zeros: " + zernum );



    }
}


//QQ.Write a program to enter the numbers till the user wants and at the end it should display the sum of all the numbers entered by user.

// import java.util.Scanner;

// public class funcex7 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
 
//         int sum = 0;
//         char first;

    
//         do {
//             System.out.print("Enter any number: ");
//             int n = sc.nextInt();

//             System.out.print("Enter 'YES' or 'yes' if you want to enter number again.: ");
//             String var = sc.next();

//             first  = var.charAt(0);

//             sum = sum + n;



//         } while (first == 'y' || first == 'Y');
//         System.out.print("Sum of all the numbers are: "+ sum);

//     }
// }

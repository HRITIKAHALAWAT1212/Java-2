// WAP to print even numbers:-->

// With Using IF and ELse conditional statement;

import java.util.Scanner;
public class homewrk1 {
    public static void main(String[] args) {
        
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%2 == 0) {
            for (int i=0;i<n+1;i=i+2) {
                System.out.println(i);
            }
            
        } else {
            for (int i=0;i<n;i=i+2){
                System.out.println(i);
            }    
        }
    }
}    


//  Without using If and Else functions; 

// import java.util.Scanner;
// public class homewrk1 {
//     public static void main(String[] args) {
        
//         System.out.print("Enter a number: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 0;i<n+1;i=i+2) {
//             System.out.println(i);
//         }

//     }
// }


import java.util.Scanner;
public class homewrk2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.int);
        int a = sc.nextInt();
        int marks = sc.nextInt();

        do {
            if (a==0) 
        }

    }
}
import java.util.Scanner;

public class homewrk2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        do {
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextInt();

            // Check if the number is 0 and exit the loop if true
            if (number == 0) {
                break;
            }

            System.out.println("You entered: " + number);

        } while (true); // The loop will continue until the break statement is encountered

        System.out.println("Loop stopped.");
        sc.close();
    }
}


public class Solutions {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int input;

       do {
           int marks = sc.nextInt();
           if(marks >= 90 && marks <= 100) {
               System.out.println("This is Good");
           } else if(marks >= 60 && marks <= 89) {
               System.out.println("This is also Good");
           } else if(marks >= 0 && marks <= 59) {
               System.out.println("This is Good as well");
           } else {
               System.out.println("Invalid");
           }

           System.out.println("Want to continue ? (yes(1) or no(0))");
           input = sc.nextInt();
      
       } while(input == 1);
   }   
}

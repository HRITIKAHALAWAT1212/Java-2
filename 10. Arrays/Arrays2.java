// Arrays 2: Taking an array as an input and printing its elements.

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number of subjects: ");
        int size = sc.nextInt();
        // Array
        int[] marks = new int[size];
        // Taking an input in the form of marks
        for (int i=0;i<size;i++) {
            System.out.print("Enter the marks of subjects: ");
            marks[i] = sc.nextInt();
        }
        // Printing an outer loop.
        for (int i = 0; i<size;i++) {
            System.out.println(marks[i]);
        }

    
    }
    
}

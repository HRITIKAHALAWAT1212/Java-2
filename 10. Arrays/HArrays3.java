// Q3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

import java.util.Scanner;

public class HArrays3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many students are there for physics exam:  ");
        int size = sc.nextInt();

        int[] array = new int[size];


        for(int i = 0; i<array.length;i++) {
            System.out.print("Enter the marks scored in physics exam:  ");
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int item:array) {
            sum = sum + item;
        }

        int average = sum/size;
        System.out.print("Average of physics marks is: " + average);

    }
}

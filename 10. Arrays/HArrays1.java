// Q1. Create an array of 5 floats and calculate their sum.

import java.util.Scanner;

public class HArrays1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        // Array
        float[] array = new float[size];

        // input
        for (int i = 0; i<array.length;i++) {
            System.out.print("Enter: ");
            array[i] = sc.nextFloat();
        }

        // output
        for (float items: array) {
            System.out.println(items);
        }

        float sum = 0.0f;
        for (float items: array) {
            sum = sum + items;
        }
        float average = sum/size;
        System.out.println("average: " + average);

    }
}
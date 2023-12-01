// Q2. Write a program to find out whether a given integer is present in an array or not.

import java.util.Scanner;

public class HArrays2 {
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

        System.out.println("enter the number to find: ");
        float num = sc.nextFloat();

        // declaring boolean;
        boolean isinarray = false;


        for (int i = 0; i<array.length;i++) {
             if(num == array[i]) {
                isinarray = true;
                break;
             }
        }

        if (isinarray) {
            System.out.println("the number is present in an array");
        }
        else {
            System.out.println("number is not present in an array");
        }

    }
}
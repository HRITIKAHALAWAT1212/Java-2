//Q5.Find the maximum & minimum number in an array of integers. 

import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {

        // Making an Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        // Declaring an array
        int[] array = new int[size];
        
        // Input 
        for (int i=0;i<size;i++) {
            System.out.println("Enter the numbers: ");
            array[i] = sc.nextInt();
        }

        int min = array[0];
        int max = array[0];

        // Output
        for (int i=0;i<size;i++) {
            if (array[i]<min) {
                min = array[i];
            }
            if (array[i]>max){
                max = array[i];
            } 
        }
        System.out.println("Minimum number in an array is : " + min);
        System.out.println("Maximum number in an array is : " + max);

    }
}


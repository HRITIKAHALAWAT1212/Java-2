//  Printing an output in java.

import java.util.Arrays;
import java.util.Scanner;


public class kkarrays2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the length of an array.");
        int size = sc.nextInt();
        
        // Defining array.
        int[] arr = new int[size];
        for(int i=0; i<arr.length;i++) {
            System.out.println("Enter the array: ");
            arr[i] = sc.nextInt();
        }

        // for(int i=0;i<arr.length;i++) {
        //     System.out.println(arr[i]);
        // }

        /*
        FOR EACH LOOP METHOD.
        for (int num : arr) {
            System.out.println(num);
        }
        */
        
        /*
        TO-STRING METHOD 
        System.out.println(Arrays.toString(arr));
        */
    
 
    }
}

//Q6. 3.	Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int size = sc.nextInt();

        int[] arrays = new int[size];

        // Taking input
        for(int i = 0; i<size;i++) {
            System.out.println("Enter: ");
            arrays[i] = sc.nextInt();
        }
        
        boolean isSorted = true;
        
        //Check weather is sorted in ascending order 
        for(int i = 0; i<size-1;i++) {
            if (arrays[i+1] < arrays[i]) {
                isSorted = false;
                break;
            }
        }

        // printing the result
        if (isSorted) {
            System.out.println("Yes array is sorted in an ascending order.");
        } else {
            System.out.println("No they are not sorted in ascending order");
        }
    }    
}

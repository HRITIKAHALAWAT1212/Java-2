// Arrays 3:Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        String[] names = new String[size];
        for (int i = 0;i<names.length;i++){
            System.out.print("Enter the names: ");
            names[i] = sc.nextLine();
        }
        for (int i = 0; i<names.length;i++) {
            System.out.println(names[i]);
        }
    }

}

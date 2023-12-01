//Q8.Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

import java.util.Scanner;


public class funcex8 {

    public static double SquareFunc (double base  , double power) {
        
        double exponent = Math.pow(base, power);
    
        return exponent;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = sc.nextInt();

        System.out.print("Enter the power: ");
        double power = sc.nextInt();

        double result = SquareFunc(base, power);
        System.out.print("Exponent is: " + result);

        

    }
    
}

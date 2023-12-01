//Q4. Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class funcex4 {
    public static double ParameterCircle (double r) {
        double par = (2*Math.PI*r);
        return par; 
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextInt();
       
        double result = ParameterCircle(r);
        System.out.println("ParaMeter of the Circle is: "+ result);
        System.out.println(Math.PI);  /* in java Math.PI = 3.14 */
    
    }
    
}

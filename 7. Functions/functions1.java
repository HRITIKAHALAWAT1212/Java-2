import java.util.Scanner;

public class functions1 {

    public static void calFactorial (int n) {
      for (int fac = n;fac>=1;) {
        int res = fac*(fac-1);
        System.out.print(res);
        return res;
      }
    }
    
    public static void main (String [] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        System.out.print("Factorial of the numbers is: " + calFactorial(5));
        sc.close();

    }
}
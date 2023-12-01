import java.util.Scanner;

public class rf1 {
    static int frname (int a , int b) {  
        int product = a * b;
        System.out.println(product);
        return product;
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
       
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        frname(a, b);
        
        
    }
}

// Calculator.

import java.util.Scanner;
public class condition5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("enter first number: ");
    int a = sc.nextInt();
    System.out.println("enter second number: ");
    int b = sc.nextInt();
    System.out.println("enter the operator: ");
    sc.nextLine();
    String op = sc.nextLine();


    int sum = a+b;
    int sub = a-b;
    int mul = a*b;
    int div = a//b;
    int mod = a%b;

    
    if (op.equals("+")) {
        System.out.println(sum);
    } else if (op.equals("-")) {
        System.out.println(sub);
    } else if (op.equals("*")) {
        System.out.println(mul);
    } else if (op.equals("/")) {
        System.out.println(div);
    } else if (op.equals("%")) {
        System.out.println(mod);
    }
    
    sc.close();
        
    }
}

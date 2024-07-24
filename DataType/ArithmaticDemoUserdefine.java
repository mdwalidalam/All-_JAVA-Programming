
package DataType;

import java.util.Scanner;

public class ArithmaticDemoUserdefine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,result;
        System.out.println("Enter First number : ");
        num1 = input.nextInt();
        System.out.println("Enter Second number : ");
        num2 = input.nextInt();
        result = num1 + num2;
        System.out.println("sum "+result);
        result = num1 - num2;
        System.out.println("sub "+result);
        result = num1 * num2;
        System.out.println("multiplacation "+result);
        result = num1 / num2;
        System.out.println("div "+result);
        result = num1 % num2;
        System.out.println("remainder "+result);
    }
    
}

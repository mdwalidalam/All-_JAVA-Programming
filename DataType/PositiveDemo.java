
package DataType;

import java.util.Scanner;

public class PositiveDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any number : ");
        num = input.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
            
        }
        else{
            System.out.println("Equal to Zero");
        }
    }
    
}

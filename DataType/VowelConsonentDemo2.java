
package DataType;

import java.util.Scanner;

public class VowelConsonentDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any letter :");
        ch = input.next().charAt(0);
        if(ch == 'A' || ch == 'E' || ch =='i' || ch == 'O' || ch == 'U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
    }
    
}


package DataType;

import java.util.Scanner;

public class TemperatureDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fare,cels;
        System.out.print("Farenheit : ");
        fare = input.nextDouble();
        cels = 0.6 *fare -32;
        System.out.println(",celcious : "+cels);
    }
    
}

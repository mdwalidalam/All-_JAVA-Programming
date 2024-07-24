
package DataType;

import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels,fare;
        System.out.print("Celcius : ");
        cels = input.nextDouble();
        fare = 1.8 * cels + 32;
        System.out.println("Farenheit : "+fare);
    }
    
}

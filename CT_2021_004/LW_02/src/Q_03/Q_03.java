
package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius:");
        double celsius=input.nextDouble();

        double fahrenheit= (1.8*celsius)+32;
        System.out.println("Temperature in fahrenheit:"+fahrenheit);

    }
}

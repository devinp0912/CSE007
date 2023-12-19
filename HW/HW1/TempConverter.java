/* Name: Devin Pombo
 * Date: 9/08/22
 * CSE007: HomeWork 1, Part 1
 * Purpose: Program converts temperature, practice using implicit and explicit casting
 */

import java.util.Scanner;

public class TempConverter {
    public static void main(String args[]){

        //get temp in C from user 
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the temperature in degrees CELSIUS");
        double celsius = scnr.nextDouble();
        double fahrenheit;

        //convert Celsius to Fahrenheit
        fahrenheit = (9.0/5) * celsius + 32;
        System.out.println(celsius + " degrees C is equivalent to " + fahrenheit + " degrees F");

    }
}

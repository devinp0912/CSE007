/* Name: Devin Pombo
 * Date: 9/08/22
 * CSE007: HomeWork 1, Part 1
 * Purpose: Program converts temperature, practice using implicit and explicit casting
 */

import java.util.Scanner;

public class TempConverter2 {
    public static void main(String args[]){

        //get temp in F from user 
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter temperature in degrees FAHRENHEIT");
        double fahrenheit = scnr.nextDouble();
        double celsius;

        //convert fTemp to cTemp
        celsius = (fahrenheit - 32) * (5.0/9);
        System.out.println(fahrenheit + " degrees F is equivalent to " + celsius + " degrees C");
    }
}
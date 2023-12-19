/* Name: Devin Pombo
 * Date: 9/08/22
 * CSE007: HW 1
 * Purpose: program determines the ammount of change that should be dispensed from a vending machine.
 */

import java.util.Scanner;

public class DispenseChange {
    public static void main(String args[]){

        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;

        //prompt user to enter the price of the item
        System.out.println("Enter price of item (25 cents to a 100 cents, in 5-cent increments):");
        Scanner scnr = new Scanner(System.in);
        int price = scnr.nextInt();
        int change = 100 - price;

        //calculate number of quarters
        int numQuarters = change / QUARTER;
        change = change - numQuarters * QUARTER; 
        //calculate number of dimes
        int numDimes = change / DIME;
        change = change - numDimes * DIME;
        //calculate number of nickels
        int numNickels = change / NICKEL;

        //print results
        System.out.println("You bought an item for " + price + " cents and gave me a dollar, so your change is:");
        System.out.println(numQuarters + " quarter(s)");
        System.out.println(numDimes + " dime(s)");
        System.out.println(numNickels + " nickel(s)");
    }
}
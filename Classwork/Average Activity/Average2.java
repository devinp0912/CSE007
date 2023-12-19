/* Name: Devin Pombo
 * Date: 9/14/22
 * CSE007 - Average Activity 2
 * Purpose: have user enter how many intergers they would like to enter, using data validation, and find the average of those ints
 */

import java.util.Scanner;

public class Average2{
    public static void main(String[]args){

        //find out how many different numbers we are taking the average of. 
        Scanner myScnr = new Scanner(System.in);
        boolean isInt = false;
        int numInts = 0;

        //data validation check if entry was an int
        while(isInt == false){
            System.out.println("How many integers do you have to take the average of?");
            isInt = myScnr.hasNextInt();
            if(isInt){
                numInts = myScnr.nextInt();
                isInt = true;
            }else{
                System.out.println("You did not enter a interger");
                myScnr.nextLine();
            }
        }

        //get individual intergers from user
        int sum = 0;
        int counter = 1;
        isInt = false;
        int num;
        //while the number of intergers is less than the counter....
        while ((numInts+1) != counter){
            System.out.println("Please enter interger " + counter); // ask user for intergers
            isInt = myScnr.hasNextInt(); // make sure they entered an interger
            if(isInt){ 
                num = myScnr.nextInt(); //if int, set "num" equal to the entry
                ++counter; // then increment the counter
                sum = sum + num; // then add the num to variable sum. Sum will add up all the ints the user enters so it could be put in the numerator of the average divide at the end 
            }else{ // if not an int, tell them to try again, DO NOT increment counter, clear the scanner. 
                System.out.println("You did not enter a interger"); 
                myScnr.nextLine();                
            }
        }



        /////////////////////////////////PERFORM CALCULATION
        double average = (1.0 * sum)/numInts;
        /*                ^^^^^^^^^
         *        1 * anyValue = itself
         * 1.0 converts "sum" to a double value so the answer can be given as a double in the println statement below
         */
        System.out.println("The average of your " + numInts + " interger(s) is: " + average);

        myScnr close;
    }
}
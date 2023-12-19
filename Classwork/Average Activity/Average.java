/* Name: Devin Pombo
 * Date: 9/14/22
 * CSE007 - Average Activity
 * Purpose: have user enter 5 intergers, using data validation, and find the average of those ints
 */
import java.util.Scanner;

public class Average{
    public static void main(String[]args){
        Scanner myScnr = new Scanner(System.in);

        int countNumInts = 1;
        boolean isInt = true;
        System.out.println("This program finds the average of 5 intergers");

        //declare variables which will store the 5 values entered by user
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;

        do{
            //ask user for interger
            System.out.println("Please enter interger " + countNumInts);
            isInt = myScnr.hasNextInt();
            //if entry is an int...
            if(isInt){
                //check counter, if it is the 1st int, assign that value to num1, and as follows for 2,3,4,5. Also increment the counter
                switch (countNumInts){
                    case 1: num1 = myScnr.nextInt(); ++countNumInts; break;
                    case 2: num2 = myScnr.nextInt(); ++countNumInts; break;
                    case 3: num3 = myScnr.nextInt(); ++countNumInts; break;
                    case 4: num4 = myScnr.nextInt(); ++countNumInts; break;
                    case 5: num5 = myScnr.nextInt(); ++countNumInts; break;
                    }
                //if entry was not an int, tell them it wasn't a valid entry. DO NOT increment the counter
                }else{
                System.out.println("You did not enter an Interger.");
                myScnr.nextLine(); //clear the scanner of bad value 
            }
            
            //once the counter is done getting the 5th number, the counter wil be incremented to 6, once we get to 6 stop getting more intergers
        }while(countNumInts != 6 ); //DoWhile statement, ends with ;

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //perform calculations
        double average;
        average = (num1 + num2 + num3 + num4 + num5) / (1.0* countNumInts - 1);
        System.out.println("The average of your entries is: " + average);

    }
}
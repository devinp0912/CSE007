/* Name: Devin Pombo
 * Date: 9/10/22
 * CSE007: Homework 2
 * Purpose: play classic casino game Craps
 */
import java.util.Scanner;
import java.util.Random;


public class Craps{
    public static void main(String[]args){
        //print user menu
        System.out.println("Welcome to Craps! Would you like to randomly cast or state your dice?");
        System.out.println("   1. randomly cast");
        System.out.println("   2. state your dice");

        //get users choice
        Scanner scnr = new Scanner(System.in);
        int userChoice = scnr.nextInt();

        int die1 = 9;
        int die2 = 9;

        //execute user's choice
        if(userChoice == 1){
            Random rand = new Random();
            //generate number from 0-5
            die1 = rand.nextInt(6);
            //make that range now from 1-6 by adding 1
            die1 += 1;
            die2 = rand.nextInt(6);
            die2 += 1;
            System.out.println("You rolled a " + die1 + " and a " + die2);
        }else if(userChoice == 2){
            System.out.println("Choose your 1st die");
            die1 = scnr.nextInt();
            System.out.println("Choose your 2nd die");
            die2 = scnr.nextInt();
            System.out.println("You rolled a " + die1 + " and a " + die2);
        }else{
            System.out.println("ERROR: invalid entry");
        }
        
        boolean validChoice = (userChoice == 1 || userChoice == 2);


        if(validChoice){
            switch(die1){
                case 1: 
                    switch(die2){
                        case 1: System.out.println("Snake Eyes!"); break; 
                        case 2: System.out.println("Ace Deuce!"); break; 
                        case 3: System.out.println("Easy Four!"); break; 
                        case 4: System.out.println("Fever Five!"); break; 
                        case 5: System.out.println("Easy Six!"); break; 
                        case 6: System.out.println("Seven Out!"); break; 
                    }
                    break;
                case 2:
                    switch(die2){
                        case 1: System.out.println("Ace Duece!"); break; 
                        case 2: System.out.println("Hard Four!"); break; 
                        case 3: System.out.println("Fever Five!"); break; 
                        case 4: System.out.println("Easy Six!"); break; 
                        case 5: System.out.println("Seven out!"); break; 
                        case 6: System.out.println("Easy Eight!"); break; 
                    }
                    break;
                case 3:
                    switch(die2){
                        case 1: System.out.println("Easy Four!"); break; 
                        case 2: System.out.println("Fever Five!"); break; 
                        case 3: System.out.println("Hard Six!"); break; 
                        case 4: System.out.println("Seven Out!"); break; 
                        case 5: System.out.println("Easy Eight!"); break; 
                        case 6: System.out.println("Nine!"); break; 
                    }
                    break;
                case 4: 
                    switch(die2){
                        case 1: System.out.println("Fever Five!"); break; 
                        case 2: System.out.println("Easy Six!"); break; 
                        case 3: System.out.println("Seven Out!"); break; 
                        case 4: System.out.println("Hard Eight!"); break; 
                        case 5: System.out.println("Nine!"); break; 
                        case 6: System.out.println("Easy Ten!"); break; 
                    }
                    break;
                case 5:
                    switch(die2){
                        case 1: System.out.println("Easy Six!"); break; 
                        case 2: System.out.println("Seven Out!"); break; 
                        case 3: System.out.println("Easy Eight!"); break; 
                        case 4: System.out.println("Nine!"); break; 
                        case 5: System.out.println("Hard Ten!"); break; 
                        case 6: System.out.println("Yo-leven!"); break; 
                    }
                    break;
                case 6:
                    switch(die2){
                        case 1: System.out.println("Seven Out!"); break; 
                        case 2: System.out.println("Easy Eight!"); break; 
                        case 3: System.out.println("Nine!"); break; 
                        case 4: System.out.println("Easy Ten!"); break; 
                        case 5: System.out.println("Yo-leven!"); break; 
                        case 6: System.out.println("Boxcards!"); break; 
                    }
                    break;
            }
        }

    }
}
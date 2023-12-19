/* Name: Devin Pombo
 * Date: 9/10/22
 * CSE007: Homework 2
 * Purpose: create a 4th grade classroom aid that allows students to quiz themselves on the 4 different arithmetic operations
 */
import java.util.Scanner;
import java.util.Random;

public class MathMenu{
    public static void main(String[]args){
        
        //print menu interface
        System.out.println("Welcome to the Math Program");
        System.out.println("   1. Addition");
        System.out.println("   2. Subtraction");
        System.out.println("   3. Multiplication");
        System.out.println("   4. Division");
        System.out.println("Enter your choice:");

        //get users choice
        Scanner scnr = new Scanner(System.in);
        int userChoice = scnr.nextInt();    
        
        boolean validChoice = (userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4);

        //check if choice from user is either 1,2,3,or 4
        if(validChoice){
            //if valid choice, generate 2 random single digit numbers
            Random rand = new Random();
            int num1 = rand.nextInt(10);
            int num2 = rand.nextInt(10); 
            
            int answer;
            int userAnswer;
            boolean correctAnswer;

            if(userChoice == 1){
                System.out.println("Solve: " + num1 + " + " + num2);
                answer = num1 + num2;
                userAnswer = scnr.nextInt();
                //check if answer is true
                if(answer == userAnswer){
                    correctAnswer = true;
                }else{
                    correctAnswer = false;
                }
            }else if(userChoice == 2){
                System.out.println("Solve: " + num1 + " - " + num2);
                answer = num1 - num2;
                userAnswer = scnr.nextInt();
                //check if answer is true
                if(answer == userAnswer){
                    correctAnswer = true;
                }else{
                    correctAnswer = false;
                }
            }else if(userChoice == 3){
                System.out.println("Solve: " + num1 + " * " + num2);
                answer = num1 * num2;
                userAnswer = scnr.nextInt();
                //check if answer is true
                if(answer == userAnswer){
                    correctAnswer = true;
                }else{
                    correctAnswer = false;
                }
            }else{
                System.out.println("Solve: " + num1 + " / " + num2);
                System.out.println("Enter interger value. ei: 0,1,2,3...(Omit remander)");
                answer = num1 / num2;
                userAnswer = scnr.nextInt();
                //check if answer is true
                if(answer == userAnswer){
                    correctAnswer = true;
                }else{
                    correctAnswer = false;
                }
            }

            //tell user if they got the correct answer or not 
            if(correctAnswer){
                System.out.println("Correct!");
            }else{
                System.out.println("Incorrect. Answer was: " + answer);
            }

        }else{
            System.out.println("ERROR: invalid choice");
        }
    }
 }
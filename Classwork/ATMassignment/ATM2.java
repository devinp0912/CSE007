/*
Name: Devin Pombo
date: 9/05/22
CSE007: ATM Assignment Part 3 - IF STATEMENT INTEGRATION
purpose: use variables created in the first part of assignment to build the if statement structure and logic behind the operation of the ATM system. 
*/
import java.util.Scanner;

public class ATM2{  
    public static void main (String args[]){
        //varaibles 
        final int ACCOUNT1_NUM = 12345678;  //account1 Number
        final int ACCOUNT1_PIN = 1234;      //account1 Pin
        double account1$Amount = 34000.00;         //amount of money in account1
        String user1Name = ("Devin Pombo");

        //have user input account number: 12345678 is the account number 
        System.out.println("Please enter your account number...");
        System.out.println("In real life this line wouldn't be here. The account number is " + ACCOUNT1_NUM);
        
        Scanner EnterAccount = new Scanner(System.in);
        int findAccount; //holds value the user enters for their account number                    
        findAccount = EnterAccount.nextInt();
            
        //see if the account number entered equals one in the system
        if (findAccount == ACCOUNT1_NUM){
            //next prompt user to enter their PIN to make sure it is them
            System.out.println("Please enter your PIN...");
            System.out.println("In real life this line wouldn't be here. the account PIN is " + ACCOUNT1_PIN);
                
            Scanner EnterPin = new Scanner(System.in);
            int findPin;//holds value the user enters for their PIN
            findPin = EnterPin.nextInt();

            /*nested if statement. If the account number is entered correctly, then this will then check if the PIN is correct too for that account: 1234 is the PIN*/ 
            if(findPin == ACCOUNT1_PIN){
                //if so, show user the menu of options 
                System.out.println("Welcome to the Bank of America ATM System " + user1Name + ".");
                System.out.println("Main menu:");
                System.out.println("1 - View my balance");
                System.out.println("2 - Withdraw Cash");
                System.out.println("3 - Deposit funds");
                System.out.println("4 - Exit");
                    
                //check if the account has funds in it 
                //first the system always assumes the account is empty or in debt 
                boolean hasFunds$ = false;
                if (account1$Amount <= 0){
                    hasFunds$ = false;
                }else{
                    hasFunds$ = true;
                }

                //read input from user:
                Scanner enter1234 = new Scanner(System.in);
                int entry; // will store number entered by user from user menu above 
                entry = enter1234.nextInt();

                char option1 = 1;
                char option2 = 2;
                char option3 = 3;
                /*option4 is not needed, because if the user doesn't choose 1-3 then no action is needed. 
                */
                
                //check if entry is one of the options 
                if (entry == option1){
                    //Display balance
                    System.out.println("Your account balance is: $" + account1$Amount);
                }else if (entry == option2){
                    //withdraw cash
                    
                    if(hasFunds$){
                        //if the account has money, ask the user how much they would like to take out
                        System.out.println("Your account has $" + account1$Amount + ". How much would you like to withdraw?");
                        System.out.println("Do not use commas when typing in your number. For example, 4,000 should be entered like 4000.");
                        System.out.println("Do not use a decimal to request fractions of a dollar or cents. Only use full dollar amounts. ");
                        Scanner withdraw = new Scanner(System.in);
                        int withdrawAmount = withdraw.nextInt();

                        //check if the withdrawal amount requested is less than or equal to the amount in the account
                        if(withdrawAmount <= ((int)account1$Amount)){
                            //if so, substract the amount from the account and give the user the ammount they asked for
                            account1$Amount = account1$Amount - withdrawAmount;
                            System.out.println("$"+ withdrawAmount + " has been removed from your account and dispensed below to you.");
                            System.out.println("$" + account1$Amount + " is your remaining balance. Have a good day!");
                        }else{
                            System.out.println("Insufficient funds.");
                        }
                    }else{
                        //else print they dont have any money
                        System.out.println("Insufficient funds to perform this action.");    
                    }
                    

                }else if (entry == option3){
                    //deposit funds
                    //how much do you want to deposit?
                    System.out.println("Enter Deposit Amount...");
                    System.out.println("Do not use commas when typing in your number. For example, 4,000 should be entered like 4000.");
                    System.out.println("Do not use a decimal to request fractions of a dollar or cents. Only use full dollar amounts.");
                    Scanner deposit = new Scanner(System.in);
                    int depositAmount = deposit.nextInt();

                    account1$Amount = account1$Amount + depositAmount;
                    System.out.println(depositAmount + " was added to your account.");
                    System.out.println("$" + account1$Amount + " is your new account balance. Have a good day!");
            
                }else{
                    //if 4 or any other key is selected, the program will terminate
                    System.out.println("Goodbye!");
                }
        
            }else{
                
                //else, tell user it is not a valid entry, end of program 
                System.out.println("Not a valid account number.");
            }
        }
    }
}
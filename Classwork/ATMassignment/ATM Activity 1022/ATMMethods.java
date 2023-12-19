/* 
1. Download MyMethods.java found on coursesite and save it in the same folder as ATMMethods.java
2. Complile both MyMethods.java and ATMMethods.java
3. MyMethods.java does not have a main method do NOT try to run
4. run ATMMethods to make sure everything runs correctly.
5. Use the ATMmethods program to understand the algorithms written to produce the ATM system.
6. Run the program several times to see the expected inputs and flow of program with each user option
7. At the end of this program is methods that should be used to modularize the ATM system.
8. Each method has a pre and post conditions and a description describing the formal parameters
return type and the purpose of the method.
9. Write each method using the algorithms defined in the main method.
*/
import java.util.Scanner;
public class ATMMethods{
    public static void main(String [] args){
        Scanner myScan = new Scanner(System.in);
        int [] accountNumber = {99999,88888,77777,66666,55555};
        int [] pin = {1216,1091,4822,2350,7385};
        double [] totalBalance = {200,250,500,800,900};
        int [] withdrawAmount = {20,40,60,100,200,300}; 
        int withdraw;
        int deposit;
        int choice;
        int userAcct;
        int userPin;
        int input;
        boolean good = true;
        final int BALANCE_INQUIRY = 1;
        final int WITHDRAWAL = 2;
        final int DEPOSIT = 3;
        final int EXIT = 4;
        
        int indexArray = authentication(myScan,accountNumber,pin);
        if(indexArray != -1){
            do{
                choice = displayMenu(myScan); 
                switch (choice){
                    case BALANCE_INQUIRY:
                        displayBalance(totalBalance, indexArray);
                        break;
                    case WITHDRAWAL:
                        input = displayWithdrawMenu(myScan, withdrawAmount);
                        withdraw (myScan, totalBalance, withdrawAmount, indexArray, input);
                        break;
                    case DEPOSIT:
                        deposit(myScan, totalBalance, indexArray);
                    break;
                    case EXIT:
                        System.out.println("Have a nice day");
                        break;
                    default:
                        System.out.println("Invalid Value Entered");
            }
            System.out.println("Hit Any Key to continue");
            myScan.nextLine();
        }
            while(choice != 4);
            
        }
    }






















//DEFINED FUNCTIONS BELOW 


/* PreCondition: Scanner has been defined and declared in main method, the accountNumber array
                 has been populated with user account numbers, the pin array has been
                 populated with pin information. Where the index of each array corresponds with 
                 the accountNumber and pin
   PostCondition: the index from the accountNumber where the user's account number is located or 
                 a -1 if the account was not found or the pin was invalid.
   Description: The purpose of this method is to prompt the user for a valid integer and
                user account number. The method will search the accountNumber array looking for 
                the user entered account number. If the account number is found, the method will ask
                the user for the pin number. The method will use the index where the user account was found
                in the array to verify the pin number. If the pin does not match the account number then
                an error is displayed and the program ends. If the accountNumber can not be found in the 
                accountNumber array an error is displayed and the program ends. note if the accountnumber
                is not found the method should not ask for a pin but produce an error message and stop the program.
*/
public static int authentication(Scanner myScan,int [] accountNumber, int [] pin){
    int userAcct;
    int userPin;
    boolean found = false;
    System.out.println("Enter your account number");
    userAcct = MyMethods.getInt(myScan);
    int indexArray = 0;
    for (indexArray = 0; indexArray < accountNumber.length; indexArray++){
        if(userAcct == accountNumber[indexArray]){
            found = true;
            break;
        }
    }
if(!found){
    System.out.println("You entered an invalid acccountNumber");
    return -1;
}
    System.out.println("Enter pin");
    userPin = MyMethods.getInt(myScan);
    if (userPin != pin[indexArray]){
        System.out.println("You entered an invalid pin");
        return -1;
    }
    return indexArray;
}


/*
PreCondition: Scanner has been defined and declared in the main method
PostCondition: method will return the choice of the user from the ATM main menu
Description: displayMenu will display the following options
"Main menu:"
"1 - View my balance"
"2 - Withdraw Cash");
"3 - Deposit funds");
"4 - Exit\n");
and then return the userchoice 
*/
public static int displayMenu(Scanner myScan){
    System.out.println("\nMain menu:");
    System.out.println("1 - View my balance");
    System.out.println("2 - Withdraw Cash");
    System.out.println("3 - Deposit funds");
    System.out.println("4 - Exit\n");
    System.out.println("Enter your choice");
    return MyMethods.getInt(myScan);
}


/*
PreCondition: user chose #1 View my balance, totalBalance is populated with customer balances,
              authentication method returns the index of where the user
              account is located in the account array. The indexArray is used to get the balance
              from the balance total array 
PostCondition: displays user's balance and return to main menu
Description: the purpose of this method is display the user's balance, by using the indexArray to get the user balance
              from the totalBalance array
*/
public static void displayBalance(double [] totalBalance,int indexArray){
    System.out.println("\nBalance Information:");
    System.out.println("  -  Total balance: ");
    System.out.println(totalBalance[indexArray]);
    return;
}


/*
PreCondition: user choice #2 Withdraw cash on the main menu, Scanner is built in main method and wthdrawAmount array
              is populated with the 6 withdrawal choices
PostCondition: returns the choice of withdrawal amount from the WithdrawMenu
Description: The purpose of this method is to display the 7 withdrawal options where the values
             are located in the withdrawal array 20,40,60,100,200,300 or option 7 to cancel transaction
             The user option will then be returned from the method. if 7 is chose as an option the user should
             be returned to the main menu.
*/
public static int displayWithdrawMenu(Scanner myScan, int [] withdrawAmount){
    System.out.println("\nWithdrawal Menu: ");
    System.out.println("1 - $" + withdrawAmount[0]);
    System.out.println("2 - $"+ withdrawAmount[1]);
    System.out.println("3 - $"+ withdrawAmount[2]);
    System.out.println("4 - $" + withdrawAmount[3]);
    System.out.println("5 - $" + withdrawAmount[4]);
    System.out.println("6 - $" + withdrawAmount[5]);
    System.out.println("7 - Cancel transaction");
    return MyMethods.getInt(myScan);
}


/*
PreCondition: user chose #2 withdraw cash on the main menu and they chose options 1-6 on the 
              withdrawMenu. The withdrawal option will be returned from the DisplayWithdrawMenu method, the withdrawal array is 
              populated with valid withdrawal amounts
PostCondition: if enough money is in the user account, money will be dispensed from the machine and subtracted from user account
               or the user will be notified if they do not have enough money in account
Desctiption: The purpose of this method is to use the input parameter to get the amount the user wants withdrawn using the input
             as the index value to get the amouint from the withdrawAmount.
             The indexArray will be used to find the balance of the account from the toalBalance array.
             The method will then check if the user has enough monies in their account. If they have enough monies, the amount
             should be dispensed from the ATM machine and subtracted from the user's account balance. if the user balance 
             does not have enough monies, an error message should be displayed. After this method the user 
             should be taken back to the main menu.
*/
public static void withdraw(Scanner myScan, double [] totalBalance, int [] withdrawAmount, int indexArray, int input){
    
    
    switch (input){
        case 1:
            if (totalBalance[indexArray] > withdrawAmount[0]){
              totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[0];
              System.out.println("Remove your money from machine");
              System.out.println("Total Balance " + totalBalance[indexArray]);
            }
            else 
              System.out.println("Insufficient Funds");
            break;
        case 2:
            if (totalBalance[indexArray] > withdrawAmount[1]){
                totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[1];
                System.out.println("Remove your money from machine");
                System.out.println("Total Balance " + totalBalance[indexArray]);
            }
            else 
                System.out.println("Insufficient Funds");
            break;
        case 3:
            if (totalBalance[indexArray] > withdrawAmount[2]){
                totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[2];
                System.out.println("Remove your money from machine");
                System.out.println("Total Balance " + totalBalance[indexArray]);
            }
            else 
                System.out.println("Insufficient Funds");
            break;
        case 4:
            if (totalBalance[indexArray] > withdrawAmount[3]){
                totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[3];
                System.out.println("Remove your money from machine");
                System.out.println("Total Balance " + totalBalance[indexArray]);
            }
            else 
                System.out.println("Insufficient Funds");
            break;
        case 5:
            if (totalBalance[indexArray] > withdrawAmount[4]){
                totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[4];
                System.out.println("Remove your money from machine");
                System.out.println("Total Balance " + totalBalance[indexArray]);
            }
            else 
                System.out.println("Insufficient Funds");
                break;
        case 6:
            if (totalBalance[indexArray] > withdrawAmount[5]){
                totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[5];
                System.out.println("Remove your money from machine");
                System.out.println("Total Balance " + totalBalance[indexArray]);
            }
            else 
                System.out.println("Insufficient Funds");
            break;
        case 7:
            System.out.println("Canceled Transaction");
        break;
        default:
            System.out.println("You entered an invalid option");
            break;
    }
}


/* 
PreCondition: user choice #3 deposit funds on the main menu, Scanner is built in main method and totalBalance array
is populated with user Balances. indexArray holds the index that will be used to located the user
balance.
PostCondition: the deposit amount is added to the user balance 
Description: The purpose of this method is to prompt the user with a valid deposit amount and 
             add the amount to the user's balance located in the totalBalance.
*/
public static void deposit(Scanner myScan,double [] totalBalance,int indexArray){
    System.out.println("Enter deposit amount");
    int deposit = MyMethods.getInt(myScan);
    totalBalance[indexArray] = totalBalance[indexArray] + deposit;
    System.out.println("Place you envelope in machine");
    System.out.println("Total Balance " + totalBalance[indexArray]);
}   

}
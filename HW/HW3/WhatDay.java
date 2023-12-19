/* Name: Devin Pombo
 * Date: 9/16/22
 * CSE007 - Homework 3: WhatDay.java
 * Purpose: Enter any date, any year, get the day of the week as a return value
 */
import java.util.Scanner; 

public class WhatDay{
    public static void main(String[]args){
        System.out.println("Welcome! Enter a date in this program and it will give you what day of the week it was between 1700 and 2399!");
        Scanner myScnr = new Scanner(System.in);


        int month = 0;
        int day = 0;
        int year = 0;

        int counter = 1;
        
        //sets a valid data type to month, only excepts 1-12 as an answer
        do{
            System.out.println("enter a month with its numerically value: 1-12");
            boolean isInt = myScnr.hasNextInt();
            if(! isInt){
                System.out.println("You did not enter a valid month.");
                myScnr.nextLine();
            }else{
                int temp = myScnr.nextInt();
                if(temp >= 1 && temp <= 12){
                    month = temp;
                    ++counter;
                }else{
                    System.out.println("You did not enter a valid month.");
                    myScnr.nextLine();
                }
            }
        }while(counter == 1);
        //2nd Do while. Gets day entry
        do{
            System.out.println("enter a day with its numerically value: 1-31");
            boolean isInt = myScnr.hasNextInt();
            if(! isInt){
                System.out.println("You did not enter a valid day.");
                myScnr.nextLine();
            }else{
                int temp = myScnr.nextInt();
                if(temp >= 1 && temp <= 31){
                    day = temp;
                    ++counter;
                }else{
                    System.out.println("You did not enter a valid day.");
                    myScnr.nextLine();
                }
            }
        }while(counter == 2);
        //3rd Do while. gets year entry. 
        do{
            System.out.println("enter a year with its numerically value from 1700 to 2399");
            boolean isInt = myScnr.hasNextInt();
            if(! isInt){
                System.out.println("You did not enter a valid year.");
                myScnr.nextLine();
            }else{
                int temp = myScnr.nextInt();
                if(temp >= 1700 && temp <= 2399){
                    year = temp;
                    ++counter;
                }else{
                    System.out.println("You did not enter a valid year.");
                    myScnr.nextLine();
                }
            }
        }while(counter == 3);

        ////////////////////////Calculations
        
        //get last 2 digits of the year.
        int yY = year % 100;
        //year code calculation
        int yearCode = (yY + (yY / 4)) % 7;

        int monthCode = 0;
        //month code determination
        switch(month){
            case 1: break; //monthCode initlazed at 0 already above
            case 2: monthCode = 3; break;
            case 3: monthCode = 3; break;
            case 4: monthCode = 6; break;
            case 5: monthCode = 1; break;
            case 6: monthCode = 4; break;
            case 7: monthCode = 6; break;
            case 8: monthCode = 2; break;
            case 9: monthCode = 5; break;
            case 10: break; //MonthCode initlazed at 0 already above
            case 11: monthCode = 3; break;
            case 12: monthCode = 5; break;
        }

        //century code determination 
        int centuryCode = 0; 
        if (year >= 1700 && year <= 1799){
            centuryCode = 4;
        }else if (year >= 1800 && year <= 1899){
            centuryCode = 2;
            //because centuryCode for 1900s is 0, dont need to put a statment for it because it is already = to 0 above when it was declared
        }else if (year >= 2000 && year <= 2099){
            centuryCode = 6;
        }else if( year >= 2100 && year <= 2199){
            centuryCode = 4;
        }else if ( year >= 2200 && year <= 2299){
            centuryCode = 2;
        } //Cent.Code initally 0 already, no need for else if statement for 2300s

        //dateNumber
        int dd = day;

        //leap year code
        int leapCode = 0;
        if(year%4 == 0){
            leapCode = 1;
            if(year%100 == 0){
                leapCode = 0;
                if(year%400 == 0){
                    leapCode = 1;
                }
            } 
        }

        int numericDayOfTheWeek = (yearCode + monthCode + centuryCode + dd - leapCode) % 7;
        String dayOfTheWeek = "";
        switch(numericDayOfTheWeek){
            case 0: dayOfTheWeek = "Sunday"; break;
            case 1: dayOfTheWeek = "Monday"; break;
            case 2: dayOfTheWeek = "Tuesday"; break;
            case 3: dayOfTheWeek = "Wednesday"; break;
            case 4: dayOfTheWeek = "Thursday"; break; 
            case 5: dayOfTheWeek = "Friday"; break;
            case 6: dayOfTheWeek = "Saturday"; break;
        }

        System.out.println("This was a " + dayOfTheWeek + "!");

    }
}
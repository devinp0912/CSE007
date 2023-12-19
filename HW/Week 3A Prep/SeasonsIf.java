/* Name: Devin Pombo
 * Date: 9/7/22
 * Assignment: CSE007 - SeasonsIf 
 * Purpose: program tells you which season it is for any date you enter.  
 */

import java.util.Scanner;

public class SeasonsIf {
    public static void main(String[]args){

        //get date from user
        Scanner myscrn = new Scanner(System.in);
        System.out.println("Please enter a month...");
        String month = myscrn.nextLine();
        System.out.println("Please enter a day in that month...");
        int day = myscrn.nextInt();

        String season = (" ");
        boolean isRealDate = true; 
        
        // set range 
        //Spring:   Mar20 - June20
        //Summer:   June21 - Sept21
        //Autumn:   Sept22 - Dec20
        //Winter:   Dec21 - Mar19
        
        //Jan 31days
        if (month.equalsIgnoreCase("january")){
            if (day < 32){
                season = ("Winter");
            }else{
                isRealDate = false; 
            }
        //Feb 28/29days
        }else if (month.equalsIgnoreCase("february")){
            if (day < 30){
                season = ("Winter");
            }else{
                isRealDate = false; 
            }    
        //Mar 31days
        }else if (month.equalsIgnoreCase("march")){
            if (day < 20){
                season = ("Winter");
            }else if(day < 32) { 
                season = ("Spring");
            }else{
                isRealDate = false;
            }
        //Apr 30days
        }else if (month.equalsIgnoreCase("april")){
            if (day < 31){
                season = ("Spring");
            }else{
                isRealDate = false; 
            }
        //May 31days    
        }else if (month.equalsIgnoreCase("may")){
            if (day < 32){
                season = ("Spring");
            }else{
                isRealDate = false; 
            }
        //Jun 30days 
        }else if (month.equalsIgnoreCase("june")){
            if (day < 21){
                season = ("Spring");
            }else if(day < 31) { 
                season = ("Summer");
            }else{
                isRealDate = false;
            }
        //Jul 31days
        }else if (month.equalsIgnoreCase("july")){
            if (day < 32){
                season = ("Summer");
            }else{
                isRealDate = false; 
            }
        //Aug 31days
        }else if (month.equalsIgnoreCase("august")){
            if (day < 32){
                season = ("Summer");
            }else{
                isRealDate = false; 
            }
        //Sept 30days
        }else if (month.equalsIgnoreCase("september")){
            if (day < 22){
                season = ("Summer");
            }else if(day < 31) { 
                season = ("Autumn");
            }else{
                isRealDate = false;
            }
        //Oct 31days
        }else if (month.equalsIgnoreCase("october")){
            if (day < 32){
                season = ("Autumn");
            }else{
                isRealDate = false; 
            }
        //Nov 30days 
        }else if (month.equalsIgnoreCase("november")){
            if (day < 31){
                season = ("Autumn");
            }else{
                isRealDate = false; 
            }
        //Dec 31days 
        }else if (month.equalsIgnoreCase("december")){
            if (day < 21){
                season = ("Autumn");
            }else if(day < 32) { 
                season = ("Winter");
            }else{
                isRealDate = false;
            }
        }else{
            isRealDate = false;
        }

        if (isRealDate){
            //System.out.println(month + " " + day + " fall during " + season);
            System.out.printf("%s %d falls during %s",month, day, season);
        }else{
            System.out.println("You entered an invalid date.");
        }


    }
}
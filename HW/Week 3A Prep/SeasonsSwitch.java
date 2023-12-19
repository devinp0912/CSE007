/* Name: Devin Pombo
 * Date: 9/7/22
 * Assignment: CSE007 - SeasonsSwitch
 * Purpose: program tells you which season it is for any date you enter.  
 */
import java.util.Scanner;

public class SeasonsSwitch{
    public static void main(String[]args){
        Scanner myscrn = new Scanner(System.in);
        System.out.println("Please enter a month");
        String month = myscrn.nextLine();
        System.out.println("Please enter a day in that month");
        int day = myscrn.nextInt();

        String season = (" ");
        boolean isRealDate = true;

        switch (month){
            //////////////////////////////// JANUARY
            case "January":
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20: 
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        season = ("Winter");
                        break;
                    default: System.out.println("You entered an invalid date.");
                }
                break;
            ///////////////////////////////// FEBUARY
            case "February":
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20: 
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        season = ("Winter");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    default: System.out.println("You entered an invalid date.");
                }
                break;
            ///////////////////////////////
            case "March":
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        season = ("Winter");
                        System.out.printf("%s %d falls during %s",month, day, season); 
                        break;
                    case 20:     
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        season = ("Spring");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    default: System.out.println("You entered an invalid date.");
                }
                break; 
            //////////////////////    
            case ("April"):
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20: 
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        season = ("Spring");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    default: System.out.println("You entered an invalid date.");
                }
                break;
            //////////////////////////
            case ("May"):
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20: 
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        season = ("Spring");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    default: System.out.println("You entered an invalid date.");
                } 
                break;       
            ////////////////////
            case ("June"):
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        season = ("Spring");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break; 
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        season = ("Summer");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    default: System.out.println("You entered an invalid date.");
                }
                break;
            //////////////////////////
            case ("July"):
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20: 
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        season = ("Summer");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    default: System.out.println("You entered an invalid date.");
                }
                break;
            //////////////////////////
            case ("August"):
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20: 
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        season = ("Summer");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    default: System.out.println("You entered an invalid date.");
                }
                break;
            //////////////////////////
            case ("September"):
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20: 
                    case 21:
                        season = ("Summer");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        season = ("Autumn");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    default: System.out.println("You entered an invalid date.");
                } 
                break;       
            //////////////////////////
            case ("October"):
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20: 
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        season = ("Autumn");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    default: System.out.println("You entered an invalid date.");
                }
                break;
            //////////////////////////
            case ("November"):
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20: 
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        season = ("Autumn");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    default: System.out.println("You entered an invalid date.");
                }
                break;
            //////////////////////////
            case ("December"):
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: 
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        season = ("Autumn");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break; 
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        season = ("Winter");
                        System.out.printf("%s %d falls during %s",month, day, season);
                        break;
                    default: System.out.println("You entered an invalid date.");
                }
                break;
            
        default: System.out.println("You entered an invalid date.");

        }
        
             
    }
}
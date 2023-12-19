/* Devin Pombo
 * 10/12/22
 * CSE007 - classwork
 * create a program that returns if a number is even, Introduction to methods
 */
import java.util.Scanner;

public class MethodDemoClass{
    public static void main(String[]args){
        //prompt user for 2 integers INCLUDE DATA VALIDATION IN METHODS
        Scanner myScanner = new Scanner(System.in);
        int num1 = getInt(myScanner);
        int num2 = getInt(myScanner);
        //print evens inbetween num1 and num2, num1 must be less than num2
        printEvenInRange(num1, num2);

    }

    public static int getInt(Scanner myScan){
        boolean good = false;
        int num = 0;
        do{
            System.out.println("Enter 1 integer");
            if(myScan.hasNextInt()){
                num = myScan.nextInt();
                good = true;
            }else{
                System.out.println("You did not enter an integer.");
                myScan.nextLine();
            }
        }while(good == false);
        myScan.nextLine();
        return num; 
    }


    public static void printEvenInRange(int num1, int num2){
        if(num1 == num2 || num1 > num2){
            System.out.println("not a valid range");
            return; 
        }else{
            System.out.println("even numbers in range:");
            for(int i = num1; i <= num2; i++){
                if(findEven(i)){
                    System.out.print(i + "\t");
                }
            }
            System.out.println("Done");
            return;
        }
    }

    public static boolean findEven(int i){
        return i%2 == 0;
    }
}
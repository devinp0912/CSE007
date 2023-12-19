import java.util.Scanner;
public class MyMethods{
    public static int getInt(Scanner myScan){
        boolean good = true;
        int number = 0;
        do{
            if(myScan.hasNextInt()){
                number = myScan.nextInt();
                good = true;
                myScan.nextLine();
            }
            else{
                System.out.println("You did not enter an integer");
                myScan.nextLine();
                good = false;
            }

        }while(good == false);
        return number;
    }
}
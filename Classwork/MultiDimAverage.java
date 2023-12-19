import java.util.Scanner;
import java.util.Arrays;
public class MultiDimAverage2 {

        public static void fillArray(double[] [] arr1){

        }
        
        public static void fillArray(int[][] arr1){

        }
     
        public static double findAverage(double[][]list){

        }

        public static double findAverage(int[][]list){
    
        } 

        public static double [] findAverageRow(double [] [] list){

        }    

        public static double [] findAverageRow(int [] [] list){
            
        }    

    public static void main(String[] args) {
        double [] averages;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = getLength(s);
        System.out.println("Enter the number of Cols");
        int cols = getLength(s);
        System.out.println("Enter the type of array");
        char type = getType(s);

        switch (type) {
            case 'i':
                //todo: create a 2D integer array of size rowxcol
                int [] [] arrI = new int[rows][cols];
                fillArray(arrI);
                System.out.println(Arrays.toString(arrI));//prints memory addresses of each array element
                System.out.println(Arrays.deepToString(arrI)); //prints the individual integer values instead
                System.out.println("The average of the above matrix is: " + findAverage(arrI));
                averages = findAverageRow(arrI);
                System.out.println(Arrays.toString(averages));
                break;
            case 'd':
                 //todo: create a 2D double array of size rowxcol
                double [] [] arrD = new double[rows][cols];
                fillArray(arrD);
                System.out.println(Arrays.toString(arrD)); //prints memory addresses of each array element
                System.out.println(Arrays.deepToString(arrD)); //prints the individual double values instead
                System.out.println("The average of the above matrix is: " + findAverage(arrD));
                averages = findAverageRow(arrD);
                System.out.println(Arrays.toString(averages));
                break;
        }

        s.close();
    }
    public static char getType(Scanner scan){
        char type = '\u0000';
        boolean loopControl = true;
        do{
            System.out.println("enter an i or d");
            type = scan.nextLine().charAt(0);
            if(type == 'i' || type == 'd'){
                loopControl = false;
            } else {
                System.out.println("invalid type, try again");
            }
        }while(loopControl);
        return type;
    }
    public static int getLength(Scanner scan){
        int length = 0;
        boolean loopControl = true;
        do{
            System.out.println("Enter a number between 2 and 25");
            if(scan.hasNextInt()){
                length = scan.nextInt();
                scan.nextLine();
                if(length >=2 && length <=25){
                    loopControl = false;
                } else{
                    System.out.println("# outside of range");
                }
            } else {
                System.out.println("not an int");
                scan.nextLine();
            }
        } while (loopControl);
        return length;
    }


}

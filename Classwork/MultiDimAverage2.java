import java.util.Scanner;
import java.util.Arrays;
public class MultiDimAverage2 {

        public static void fillArray(double[] [] arr1){
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr1[i].length; j++){
                    arr1[i][j] = (Math.random()*100 + 1);
                }
            }
        }
        
        public static void fillArray(int[][] arr1){
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr1[i].length; j++){
                    arr1[i][j] = (int)(Math.random()*100 + 1);
                }
            }
        }
        
        public static double findAverage(double[][]list){
            double total = 0;
            double avg = 0;
            for (int i = 0; i<list.length; i++){
                for(int j = 0; j<list[i].length; j++){
                    total = total + list[i][j];
                }
            }
            avg = total/(list.length * list[0].length);
            return avg;
        }

        public static double findAverage(int[][]list){
            int total = 0;
            int avg = 0;
            for (int i = 0; i<list.length; i++){
                for(int j = 0; j<list[i].length; j++){
                    total = total + list[i][j];
                }
            }
            avg = (int)((1.0)*total/(list.length * list[0].length));
            return avg;
        } 
        
        public static double [] findAverageRow(double [] [] list){
            double sum = 0;
            double [] average = new double[list.length];
            for(int i = 0; i < list.length; i++){
                sum = 0;
                for(int j = 0; j <list[i].length; j++){
                    sum = sum + list[i][j];
                }
                average[i] = sum / list[i].length;
            }
            return average;
        }    
        
        public static double [] findAverageRow(int [] [] list){
            double sum = 0;
            double [] average = new double[list.length];
            for(int i = 0; i < list.length; i++){
                sum = 0;
                for(int j = 0; j <list[i].length; j++){
                    sum = sum + list[i][j];
                }
                average[i] = sum / list[i].length;
            }
            return average;
        }    
        
    public static void main(String[] args) {
        double [] averages;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = getLength(s);
        System.out.println("Enter the number of Columns");
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

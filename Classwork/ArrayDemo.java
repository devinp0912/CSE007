/* Devin Pombo
 * 9/28/22
 * CSE07 - Classwork
 * Purpose: Intro to arrays ///// array logic practice
 */
import java.util.Scanner;

public class ArrayDemo{
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        int[] list = {16,12,6,8,2,12,14,37,11,47}; //automatically populate the array ---------- 10 elements ------------
        //             0  1 2 3 4  5  6  7  8  9 <<<< INDEX
        int[] copyList;

        int i = 5;
        System.out.println(list);
        int sum = 0;
        int maxVal = 0; 
        for (int j = 0; j < list.length; j++){
            sum = sum + list[j];
            
            if(maxVal < list[j]){
                maxVal = list[j];
            }
        }
        System.out.println("Max value in list is: " + maxVal);

        double average = sum / (1.0 * list.length);
        System.out.println("average = " + average);

        // "SWALLOW COPY"
        copyList = list; // assigns memory location of list to copyList... copyList and list and thus identical copies. Changing one changes the other  
        System.out.println(copyList);
        System.out.println(list);
        // "DEEP COPY"
        copyList = new int[list.length]; 
        for(int index = 0; index < list.length; index++){
            copyList[index] = list[index]; 
            //System.out.println(copyList[index]);
        }
        
        /* Print logic practice of list with operaters inside the index brackets
        System.out.println(list[++i]); //14
        System.out.println(list[i++]); //14
        System.out.println(list[i]);   //37
        System.out.println(list[i+2]); //47
        */

        int number; 
        boolean input = false; 
        for(int index = 0; index < list.length; index++){
            do{
                System.out.println("Enter an integer");
                if(keyboard.hasNextInt() == false){
                    System.out.println("ERROR: You did not enter an integer");
                    keyboard.nextLine(); //clear buffer
                    input = false; // stay in do/while
                }else{
                    input = true; // get out of do/while
                    list[index] = keyboard.nextInt();
                    keyboard.nextLine();
                }
            }while(input == false);
        }
        //print result 
        System.out.print("List Array: ");
        for(int index = 0; index < list.length; index++){
            System.out.print(list[index] + " ");
        }

    }
}
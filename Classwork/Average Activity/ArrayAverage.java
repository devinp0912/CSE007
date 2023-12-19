/* Devin Pombo
 * 10/3/22
 * CSE007 - classwork
 */

public class ArrayAverage{
    public static void main(String[]args){
        int[] myArray = new int[10];
        //populate elements in the array
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = (int)(Math.random() * 20) + 1;
        }
        //print out array
        System.out.print("Array: ");
        for(int elementNum : myArray){
            System.out.print(elementNum + ", ");
        }
        System.out.println();
        //find max, min, average
        int max = -1; 
        int min = 30;
        float average = 0;
        int sum = 0;
        for(int i = 0; i < myArray.length; i++){
            if(max < myArray[i]){
                max = myArray[i];
            }
            if(min > myArray[i]){
                min = myArray[i];
            }
            sum = sum + myArray[i];
        }
        average = (float)sum/myArray.length;
        
        System.out.println("Maximum value in array: " + max);
        System.out.println("Minimum value in array: " + min);
        System.out.println("Average value of all elements in array: " + average);
    }
}
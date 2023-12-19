/*  Devin Pombo
 *  10/10/22
 *  CSE007 - HW5
 *  Convert strings in sub array of chars then letters and more. 
 */
import java.util.Scanner;

public class CharCount{
    public static void main(String[]args){
        Scanner myScnr = new Scanner(System.in);
        
        
        //get entry from user
        System.out.println("Enter a word or phrase");
        String entry = myScnr.nextLine();



        //save entry from user as individual characters
        char[] message = new char[entry.length()];
        for(int i = 0; i < entry.length(); i++){
            message[i] = entry.charAt(i);
        }
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] counts = new int[26];
        



        //count the total occurrances of captial letters in the entry. put the tallies into the counts array
        for(char element : message){
            switch(element){
                case 'A': counts[0]++; break;
                case 'B': counts[1]++; break;
                case 'C': counts[2]++; break;
                case 'D': counts[3]++; break;
                case 'E': counts[4]++; break;
                case 'F': counts[5]++; break;
                case 'G': counts[6]++; break;
                case 'H': counts[7]++; break;
                case 'I': counts[8]++; break;
                case 'J': counts[9]++; break;
                case 'K': counts[10]++; break;
                case 'L': counts[11]++; break;
                case 'M': counts[12]++; break;
                case 'N': counts[13]++; break;
                case 'O': counts[14]++; break;
                case 'P': counts[15]++; break;
                case 'Q': counts[16]++; break;
                case 'R': counts[17]++; break;
                case 'S': counts[18]++; break;
                case 'T': counts[19]++; break;
                case 'U': counts[20]++; break;
                case 'V': counts[21]++; break;
                case 'W': counts[22]++; break;
                case 'X': counts[23]++; break;
                case 'Y': counts[24]++; break;
                case 'Z': counts[25]++; break;
            }
        }


        //SORT alphabet AND counts with SELECTION SORT....
        int indexOfMax = -1;
        for(int i = 0; i < 26; i++){//iterate through all of counts
            indexOfMax = i;
            int max = counts[i];
            for(int j = i + 1; j < 26; j++){//iterate through all the elements past the current element
                if(max < counts[j]){//if a number is greater than the max...
                    max = counts[j];//set that number equal to the max because it is bigger.
                    indexOfMax = j;
                }
            }
            if(indexOfMax != i){//if a new max was found... swap the positions...
                //in count array and...
                counts[indexOfMax] = counts[i];
                counts[i] = max;
                //alphabet array
                char temp = alphabet[indexOfMax];
                alphabet[indexOfMax] = alphabet[i];
                alphabet[i] = temp;
            }
        }
        //print arrays
        System.out.println(); 
        System.out.print("alpha array: "); 
        for(char element : alphabet){
            System.out.print(element + ", "); 
        }
        System.out.println();
        System.out.print("count array: "); 
        for(int element : counts){
            System.out.print(element + ", "); 
        }
        System.out.println();
        System.out.println();

        

        //loop over array and display how many unique CAPITAL letters their are
        int uniqueLettersCounter = 0;
        for(int i = 0; counts[i] != 0; i++){
            uniqueLettersCounter++;
        }
        System.out.println("There are " + uniqueLettersCounter + " unique letters in this phrase.");
        for(int i = 0; counts[i] != 0; i++){
            System.out.println("The letter " + alphabet[i] + " occurs " + counts[i] + " times.");
        }


        myScnr.close();
    }
}
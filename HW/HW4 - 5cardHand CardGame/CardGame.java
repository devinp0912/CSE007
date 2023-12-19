/* Devin Pombo
 * 10/3/22
 * CSE007 - HW4
 * CradGame - array practice
 */
import java.util.Scanner;
import java.util.Random;

public class CardGame{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String suitNames[] = {"C", "H", "D", "S"};
        String rankNames[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String deck[] = new String[52];
        String hand1[] = new String[5];
        String hand2[] = new String[5];

        
        
        //print unshuffled deck
        //populate deck with unshuffled values 
        int counter = 0; 
        System.out.print("Unshuffled deck: ");
        for(String suit : suitNames){
            System.out.println();
            for(String rank: rankNames){
                System.out.print((suit) + "" + (rank) + " ");
                deck[counter] = (suit.concat(rank)); 
                ++counter;
            }
        }
        System.out.println();
        System.out.println();

        
        
        
        //shuffler            
        Random ran = new Random();      
        for(int index = 0; index < 100; index++){
            int random1 = ran.nextInt(52); //generates number between 0 and 51
            int random2 = ran.nextInt(52); //generates number between 0 and 51
            //swap values at 2 randomly generated indexes 
            String temp = deck[random1];
            deck[random1] = deck[random2];
            deck[random2] = temp; 
        }
        //print out shuffled deck
        counter = 0; //reset counter to 0. 
        System.out.println("Shuffled deck:");
        for(String element : deck){
            System.out.print(element + " ");
            ++counter;
            //the main purpose of the counter here is just so when we print out the shuffled deck its formatted nicely in 4 rows like the unshuffled one
            if(counter % 13 == 0){
                System.out.println();
            }
        }
        System.out.println();

        boolean userDecideToQuitGame = false;
        boolean tenCardsStillRemainInDeck = true; 
        
        
        //create player hands from shuffled deck array
        int totalCardsDealt = 0; //holds spot in deck array
        do{
            //generate 2 5card games, by taking the top 10 cards off the deck. 
            int handIndex = 0;
            for(int i = totalCardsDealt; i < (totalCardsDealt+10); i++){
                if(i % 2 == 0){
                    hand1[handIndex] = deck[i];
                }else{
                    hand2[handIndex] = deck[i];
                    ++handIndex;
                }
            }
            totalCardsDealt = totalCardsDealt + 10;
            
            
            
            
            //print hands 
            System.out.println("Hand 1: ");
            for(String handCards : hand1){
                System.out.print(handCards + " ");
            }
            System.out.println();
            System.out.println();
            System.out.println("Hand 2: ");
            for(String handCards : hand2){
                System.out.print(handCards + " ");
            }
            System.out.println();
            System.out.println();
            
           
           
           
           
            //determine who won the game
            int cardValue = 0;
            int hand1Sum = 0;
            int hand2Sum = 0;
            for(String cardFace : hand1){
                char v = cardFace.charAt(1); 
                switch(v){
                    case '1': cardValue = 10; break;
                    case '2': cardValue = 2; break;
                    case '3': cardValue = 3; break;
                    case '4': cardValue = 4; break;
                    case '5': cardValue = 5; break;
                    case '6': cardValue = 6; break;
                    case '7': cardValue = 7; break;
                    case '8': cardValue = 8; break;
                    case '9': cardValue = 9; break;
                    case 'J': 
                    case 'Q': 
                    case 'K': cardValue = 10; break;
                    case 'A': cardValue = 11; break;  
                }
                hand1Sum = hand1Sum + cardValue; 
            }
            for(String cardFace : hand2){
                char v = cardFace.charAt(1); 
                switch(v){
                    case '1': cardValue = 10; break;
                    case '2': cardValue = 2; break;
                    case '3': cardValue = 3; break;
                    case '4': cardValue = 4; break;
                    case '5': cardValue = 5; break;
                    case '6': cardValue = 6; break;
                    case '7': cardValue = 7; break;
                    case '8': cardValue = 8; break;
                    case '9': cardValue = 9; break;
                    case 'J': 
                    case 'Q': 
                    case 'K': cardValue = 10; break;
                    case 'A': cardValue = 11; break;  
                }
                hand2Sum = hand2Sum + cardValue; 
            }
            System.out.println("Hand1 value is "+ hand1Sum);
            System.out.println("Hand2 value is " + hand2Sum);
            if(hand2Sum > hand1Sum){
                System.out.println("Hand2 is the winner!");
            }else if(hand2Sum < hand1Sum){
                System.out.println("Hand1 is the winner!");
            }else{
                System.out.println("TIE");
            }


            //Determine if theres still 10 cards remaining in the deck
            if(totalCardsDealt > 49){ 
                tenCardsStillRemainInDeck = false;
            }

            
            
            
            //keep playing message
            String userEntry = "";
            boolean validData = true;
            do{
                if(tenCardsStillRemainInDeck == true){
                    System.out.println("Do you want to play again? (Y/N)"); 
                    userEntry = scan.nextLine();
                    validData = false;
                    if(userEntry.equalsIgnoreCase("Y")){
                        //do nothing
                        System.out.println("Yes");
                        validData = true;
                    }else if(userEntry.equalsIgnoreCase("N")){
                        System.out.println("No");
                        userDecideToQuitGame = true;
                        validData = true;
                    }else{
                        System.out.println("Error: Invalid entry"); 
                    }
                }else{
                    System.out.println();
                    System.out.println("Out of cards! Restart game to reshuffle");
                }
            }while(validData == false);

            

        }while(tenCardsStillRemainInDeck == true && userDecideToQuitGame == false);

        System.out.println("Goodbye!");
    }
}
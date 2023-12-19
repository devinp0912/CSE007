/* Devin Pombo
 * CSE007 - HW7
 * 11/09/22
 * Purpose: Create blackjack game 
 */
import java.util.Scanner;

public class Blackjack{
    
    //Total card counter
    static int totalCardsDealt = 0;
    public static void main(String[]args){
        
        Scanner keyboard = new Scanner(System.in);
        
        //declare new deck, print the deck, shuffle it, print it again
        Deck deck = new Deck();
        deckCreator(deck);

        //play game
        boolean keepPlaying = true;
        do{
           keepPlaying = playGame(deck, keyboard);
        }while(keepPlaying == true);
        System.out.println("goodbye!");
    }

    //Precondition - the hand has a number of cards in it
    //Postcondition - the hands cards and the value of the hand are displayed
    public static void displayHand(Hand hand){
        hand.display();
        System.out.println("The value of your hand is: " + hand.getValue());
    }


    //Precondition - we have a deck of shuffled cards and the user wishes to play blackjack
    /* Postcondition - Implement game logic 
     *  (1) the starting hand is dealt with 2 cards and displayed
     *  (2) the game checks to see if the hand is worth less than 16, if so it adds more cards until it is greater than 15
     *  (3) the game checks to see if the hand is worth 21, then it must display winner... If not 21... check if it is less than 21 and prompt them to hit or stay... The logic for this is done in the stayOrHit method below;;; if greater than 21 display loser
     *  (4) then the game must see if their are enough cards to play another round... throughout the code whenever a card is dealt it increments a counter. Once this counter reaches above 45 and is checked at the bottom... game over
     *  (5) if their are still cards remaining - ask the user if they still want to play... If yes, RESTART, if not goodbye!
     * 
     */
    public static boolean playGame(Deck deck, Scanner keyboard){
        
        //create hand
        Hand hand = new Hand(10);
        totalCardsDealt = 2 + totalCardsDealt;
        //deal 2 cards to start
        for(int i = 0; i < 2; i++){
            Card c = deck.dealCard();
            hand.addCard(c);
        }

        //display hand value
        displayHand(hand);

        //add more cards if the hand value is less than 16
        boolean handIsLessThanSixteen = true;
        do{
            System.out.println("Hitting...");
            if(hand.getValue() < 16){
                hand.addCard(deck.dealCard());
                displayHand(hand);
                totalCardsDealt++;
            }else{
                handIsLessThanSixteen = false;
            }
        }while(handIsLessThanSixteen == true);


        //check win, keep playing after 16 logic
        boolean keepPlayingRound = true;
        do{
            if(hand.getValue() == 21){
                System.out.println("Winner!");
                keepPlayingRound = false;
            }else if(hand.getValue() < 21){
                boolean stay = stayOrHit(keyboard, hand, deck);
                if(stay == true){
                    System.out.println("Loser!(could've hit)");
                    keepPlayingRound = false;
                }else{
                    totalCardsDealt++;
                }
            }else{
                System.out.println("Loser!(bust)");
                keepPlayingRound = false;
            }
        }while(keepPlayingRound == true);



        //check number of cards dealt
        if(totalCardsDealt > 44){
            System.out.println("Out of cards");
            return false;
        }else{
            //ask if they want to play again
            return dataValidate(keyboard);
        }
    }

    //Precondition - a deck was created in the main
    //Postcondition - the deck will be displayed in order, then shuffled, and it will display the shuffled deck
    public static void deckCreator(Deck deck){
        //print unsuffled deck
        System.out.println("unshuffled deck:");
        deck.display();
        
        //shuffle deck
        deck.shuffle();
        System.out.println("shuffled deck");
        deck.display();
    }

    //Precondition - user needs to enter whether or not they want to stay or hit because their hand must be between 16-20. 
    //Postcondition - The method will keep prompting them for a valid entry until it gets on. (s or h). and then will return a boolean value based on their decision... if they choose to hit the game will add another card to their hand here.
    public static boolean stayOrHit(Scanner keyboard, Hand hand, Deck deck){
        boolean doForever = true;
        
        while(doForever){//will keep running until h or s is entered
            System.out.println("Would you like to stay or hit? s/h");
            String answer = keyboard.nextLine();
            if(answer.equals("s")){
                return true;
            }else if(answer.equals("h")){
                System.out.println("Hitting...");
                hand.addCard(deck.dealCard());
                displayHand(hand);
                return false;
            }else{
                System.out.println("ERROR: invalid entry");
            }
        } 
        return true;
    }

    //Precondition - The user needs to enter whether or not they want to play again by entering y or n for yes or no.
    //Postcondition - the method will keep prompting them until they enter a valid entry and return a boolean value to the game
    public static boolean dataValidate(Scanner keyboard){
        boolean doForever = true;
        while(doForever){//will keep running until Y or N is entered
            System.out.println("Do you want to play again? y/n");
            String answer = keyboard.nextLine();
            if(answer.equals("y")){
                return true;
            }else if(answer.equals("n")){
                return false;
            }else{
                System.out.println("ERROR: invalid entry");
            }
        }
        return true;//this will never execute 
    }

}
/* Devin Pombo
 * CSE007 - HW7
 * 11/09/22
 * Purpose: create the hand
 */

public class Hand{
    private Card[] hand;

    //constructors 
    public Hand(int size){
        Card[] cards = new Card[size];
        this.hand = cards;
    }

    //methods 
    public void display(){
        System.out.println("Your current hand:");
        for(Card c : hand){
            if(c == null){
                System.out.println();
                return;
            }
            String rank = c.getRankName();
            String suit = c.getSuitName();
            String theCard = suit.concat(rank);
            System.out.print(theCard + " ");   
        }
        System.out.println();
        
    }


    public void addCard(Card c){
        for(int i = 0; i < hand.length; i++){
            if(hand[i] == null){
                hand[i] = c;
                return;
            }
        }
    }

    public int getValue(){
        int sum = 0;
        for(Card c : hand){
            if(c == null){
                return sum;
            }
            int card = c.getRank();
            if(card > 10){
                card = 10;
            }
            sum = card + sum;
        }
        return sum;
    }
}
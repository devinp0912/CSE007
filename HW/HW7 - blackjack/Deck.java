/* Devin Pombo
 * CSE007 - HW7
 * 11/09/22
 * Purpose: create the deck of cards
 */
import java.util.Random;

public class Deck{
    private Card[] deck = new Card[52];
    private static int nextCard = 0;

    //construct deck
    public Deck(){
        int counter = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                Card c = new Card(j, i);
                deck[counter] = c;
                counter++;
            }
        }
    }

    //methods
    public void display(){
        for(Card c : deck){
            String rank = c.getRankName();
            String suit = c.getSuitName();
            String theCard = suit.concat(rank);
            System.out.print(theCard + " ");
        }
        System.out.println();
    }

    public void shuffle(){
        Random ran = new Random();      
        for(int i = 0; i < 51; ){
            int r1 = ran.nextInt(51);
            if(r1 != i){
                i++;
                Card temp = deck[r1];
                deck[r1] = deck[i];
                deck[i] = temp;
            }
        }
    }

    public Card dealCard(){
        Card c = deck[nextCard];
        nextCard++;
        return c;
    }
}
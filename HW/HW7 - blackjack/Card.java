/* Devin Pombo
 * CSE007 - HW7
 * 11/09/22
 * Purpose: create the object card 
 */

public class Card{
    
    private int rank;
    private int suit;
    private String[] rankName = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String[] suitName = {"C", "H", "S", "D"};

    //constructors
    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }
        
    //getterMethods
    public int getRank(){
        return rank;
    }
    public int getSuit(){
        return suit;
    }
    public String getRankName(){
        return rankName[rank];
    }
    public String getSuitName(){
        return suitName[suit];
    }
}
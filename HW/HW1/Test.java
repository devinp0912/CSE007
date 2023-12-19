/* Name: Devin Pombo
 * Date: 9/08/22
 * CSE007: HW 1 
 * Purpose: Practice finalizing myself with error messages from compiler, then debug the code and find the result 
 */

public class Test{
    public static void main(String [] args ){
        
        // Variables and constants
        
        //Final should be final
        //Final int DOLLAR = 100, QUARTER = 25;
        final int DOLLAR = 100, QUARTER = 25;
        
        //variable cannot start with a digit
        //double 2money;
        double money;

        //line needs to end with a ;
        //int dollars, quarters,
        int dollars, quarters;

        money = 23.68;
        
        
        
        
        // Processing
       
        int amount = (int) (money * 100);
        
        //line needs to end in a ;
        //dollar = ammount / DOLLAR
        dollars = amount / DOLLAR;
        
        amount = amount % DOLLAR;
        
        //"\" or backslash is not a operator, should be forwardslash '/'
        //quarters = amount / QUARTER;
        quarters = amount / QUARTER;
        
        
        
        
        
        // Output
        //needs to be reformated with correct placement of quotes and closed concatination statements  
        //System.out.print("Dollars= " + dollars", Quarters = +quarters);
        System.out.print("Dollars = " + dollars + ", Quarters = " + quarters);




        // What does the program do? gives an estimate amount for the variable money in dollars and quarters
        //
        // The program first takes in value of the double money, converts it to an int varaible.
        // then it calculates the total number of dollars in the variable money, 
        // and then it looks to see if there is enough change remaining to give quarters. (Examples: So if theirs 55 cents remaining, 2 quarters should be output. or if their is 16 cents remaining, 0 quarters should be output)
    }
}
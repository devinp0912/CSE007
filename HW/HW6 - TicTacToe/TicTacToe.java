/* Devin Pombo
 * 10/25/22
 * CSE007 - HW6
 * Purpose: Make a Tic Tac Toe game. 
 */
import java.util.Scanner;

public class TicTacToe{
    public static void main(String [] args){
        Scanner myScan = new Scanner(System.in);
        char [][] gameBoard = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        boolean thereIsATie = true;
        boolean keepPlaying = true;
        int playerTurn = 0;
        int totalTurnCounter = 1;

        do{
            keepPlaying = checkForWinner(gameBoard); //checkForWinner.. return true if no winner. false if winner
            thereIsATie = checkForTie(totalTurnCounter); //checkForTie
            if(keepPlaying == false){//if a winner, cannot be a tie
                thereIsATie = false;
            }
            if(thereIsATie == true){ //if tie, stop playing
                keepPlaying = false;
            }

            if(keepPlaying == true){
                printGameBoard(gameBoard); //print the visual game board
            
                playerTurn = switchPlayerTurn(totalTurnCounter); //determine whose turn it is

                playGame(myScan, gameBoard, playerTurn); //get user input, validate the input, edit the game board 
            }
            ++totalTurnCounter;//change turn
            
        }while(keepPlaying == true);
        printGameBoard(gameBoard);
        if(thereIsATie == true){
            System.out.println("Tie");
        }else{
            System.out.println("Player "+ playerTurn + " wins!");
        }

    }

    ///////////////////////////////////// METHODS BELOW /////////////////////////////////////
    
    /*      Precondition:   the gameBoard is editted by the other methods but it doesn't know when a win has occurred. 
            PostCondition:  If 3 consecutive characters occur in a veritcal, horizontal, or diagonal return false to keepPlaying boolean value
                            in the main so it will end the do while
            Description:    Implement the logic behind when a win has occured 
     */
    public static boolean checkForWinner(char [][] gameBoard){
        //check for vertical 3 in a row
        for(int row = 0; row < gameBoard.length; row++){
            if(gameBoard[row][0] == gameBoard[row][1] && gameBoard[row][1] == gameBoard[row][2]){
                return false;
            }
        }
        //check for hortizontal 3 in a row
        for(int col = 0; col < gameBoard.length; col++){
            if(gameBoard[0][col] == gameBoard[1][col] && gameBoard[1][col] == gameBoard[2][col]){
                return false;
            }
        }  
        //check for diagonl winner 
        if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]){
            return false;
        }else if(gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0]){
            return false;
        } 
        return true;
    }

    /*      Precondition:   totalTurnCounter is incremented in the main after each turn which keeps track of the total turns. once the board is 
                            full the game needs to check for a tie unless someone won on the very last turn. If there is not winner after
                            9th turn, totalTurnCounter will be 10
            PostCondition:  if totalTurnCounter is 10, then the game needs to know a tie as occured so the method will return true. 
                            If it isn't turn 10, then their are still open spaces on the board... Returns false   
            Description:    checks if a tie has occurred based off total turns. However, this method isn't called if someone wins on the last turn 
                            because of the logic in the main.   
     */
    public static boolean checkForTie(int totalTurnCounter){
        if(totalTurnCounter == 10){
            return true;
        }else{
            return false;
        }
    }

    /*      Precondition:   We have the tictactoe gameboard, but we need to able to play the game and implement the logic behind the game.
                            playerTurn equals either 1 or 2. 
            PostCondition:  if playerTurn = 1, it will place and O where they desire or an X if it is player 2's turn. Then the scanner gets
                            input from the user. They must input a number 1 through 9 that represents the corresponding position on the board.
                            Anything else thats inputted throws an ERROR. Selecting a position already used throws an ERROR as well. After
                            the player selects a valid entry, the method will replace the corresponding spot in the array with either an O or X
                            with respect to whose turn it is. 
            Description:    Implements the logic behind the game. A player should selected a empty spot and the game should take that selection
                            and edit the game board in the corresponding spot with their X or O.    
     */
    public static void playGame(Scanner myScan, char [][] gameBoard, int playerTurn){
        boolean validInput = false;
        boolean isInt = false;
        int tempInt = 0;
        char playerChar = 'a';
        if(playerTurn % 2 == 1){
            playerChar = 'O';
        }else{
            playerChar = 'X';
        }
        do{
            System.out.println("Player " + playerTurn + "'s turn");
            isInt = myScan.hasNextInt();
            if(isInt){
                tempInt = myScan.nextInt();
                if(tempInt >= 1 && tempInt <= 9){
                    switch(tempInt){
                        case 1: 
                            if(gameBoard[0][0] == '1'){
                                gameBoard[0][0] = playerChar;
                                validInput = true;
                            }else{
                                System.out.println("ERROR: space selected is already occupied");
                                myScan.nextLine();
                            }
                            break;
                        case 2:
                            if(gameBoard[0][1] == '2'){
                                gameBoard[0][1] = playerChar;
                                validInput = true;
                            }else{
                                System.out.println("ERROR: space selected is already occupied");
                                myScan.nextLine();
                            }
                            break;
                        case 3:
                            if(gameBoard[0][2] == '3'){
                                gameBoard[0][2] = playerChar;
                                validInput = true;
                            }else{
                                System.out.println("ERROR: space selected is already occupied");
                                myScan.nextLine();
                            }
                            break;
                        case 4:
                            if(gameBoard[1][0] == '4'){
                                gameBoard[1][0] = playerChar;
                                validInput = true;
                            }else{
                                System.out.println("ERROR: space selected is already occupied");
                                myScan.nextLine();
                            }
                            break;
                        case 5:
                            if(gameBoard[1][1] == '5'){
                                gameBoard[1][1] = playerChar;
                                validInput = true;
                            }else{
                                System.out.println("ERROR: space selected is already occupied");
                                myScan.nextLine();
                            }
                            break;
                        case 6:
                            if(gameBoard[1][2] == '6'){
                                gameBoard[1][2] = playerChar;
                                validInput = true;
                            }else{
                                System.out.println("ERROR: space selected is already occupied");
                                myScan.nextLine();
                            }
                            break;
                        case 7:
                            if(gameBoard[2][0] == '7'){
                                gameBoard[2][0] = playerChar;
                                validInput = true;
                            }else{
                                System.out.println("ERROR: space selected is already occupied");
                                myScan.nextLine();
                            }
                            break;
                        case 8:
                            if(gameBoard[2][1] == '8'){
                                gameBoard[2][1] = playerChar;
                                validInput = true;
                            }else{
                                System.out.println("ERROR: space selected is already occupied");
                                myScan.nextLine();
                            }
                            break;
                        case 9: 
                        if(gameBoard[2][2] == '9'){
                            gameBoard[2][2] = playerChar;
                            validInput = true;
                        }else{
                            System.out.println("ERROR: space selected is already occupied");
                            myScan.nextLine();
                        }
                        break;
                    }
                    
                }else{
                    System.out.println("ERROR: not valid position");
                }
            }else{
                System.out.println("ERROR: not an integer");
                myScan.nextLine();
            }
        }while(validInput == false);
        return;
    }

    /*      Precondition:   the value of totalTurnCounter is passed to the method which must be an int. totalTurnCounter must be odd or even 
            PostCondition:  totalTurnCounter is incremented in the main after every turn, so it alternates between odd and even every turn
                            therefore the mod% of totalTurnCounter will return 1 and then 2 and then 1 and so on every time.   \
            Description:    alternates the players turn after each turn based on the totalTurnCounter    
     */
    public static int switchPlayerTurn(int totalTurnCounter){
        if(totalTurnCounter%2 == 1){
            //player 1s turn
            return 1;
        }else{
            //player 2s turn
            return 2;
        } 
    }


    /*      Precondition:   gameBoard which was initlized in the main method is passed by references to this method. The array was
                            Initalized with 1,2,3,4,5,6,7,8,9 with each number representing the corresponding index in the 2D array. 
            PostCondition:  The array should be printed and displayed with which elements are in which position. 
            Description: the printGameBoard method prints the 2D array gameBoard which is 3x3 (3 by 3)    
     */
    
    public static void printGameBoard(char [][] gameBoard){
        for(int row = 0; row < gameBoard.length; row++){
            for(int col = 0; col < gameBoard[row].length; col++){
                System.out.print(gameBoard[row][col] + "\t");
            }
            System.out.println();
        }
    }



}
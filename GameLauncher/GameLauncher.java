/*
 * Programmer  : Bernice Templeman
 * Date        : 09-24-2014
 * Class       : COP2800-823574
 *
 * Description : Exam 1
 *               Number Guessing Game
 *
 *               Create 2 Classes
 *               1. GameLauncher: Driver (main)
 *               2. Player
 *             
 *               Part 1:
 *               Display: Enter a number between 0 and 9:
 *               Capture that number and 
 *                  store it in local variable called maxRange
 *               Create 3 Players
 *               1. Lisa, max Range
 *               2. Dino, maxRange
 *               3. Carmen,maxRange
 *
 *               Generate a secretNumber using the Random class 
 *                        between 0 and maxRange
 *               Display "I am thinking of a number between 0 and maxRange
 *               Display "The number to guess is: " secretNumber
 *
 *               Have each player guess the number until there is a winner
 *               keep track of the number of guesses
 *               
 *               Display the winner of the game:
 *               "Did Lisa get it right? true/false
 *                Did Joe get it right? true/false
 *                Did Carmen get it right? true/false
 *                The lucky winner took [numGuesses]
 *                Game is over!"
 *          
 *               If no winner:
 *               Display: No winners this round!
 *                        Playerswill have to try again.
 */

package gamelauncher;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bernice.Templeman001
 */
public class GameLauncher 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        //variables
        int maxRange;         //max range
        int secretNumber;     //secret number
        int numGuesses = 0;   // number of guesses
        int winner;
        
        Random myRandom = new Random();
        
        //Ask for a number
        Scanner userInput = new Scanner (System.in);
        
        System.out.println("Enter a number between 0 and 9:");
        
        //capture user answer and store in maxRange
  
        maxRange = userInput.nextInt();
        int bound = maxRange+1;
        
        //System.out.printf("maxRange %d", maxRange);
        
        //create 3 players
        Player player1 = new Player("Lisa", bound);
        Player player2 = new Player("Dino", bound);
        Player player3 = new Player("Carmen", bound);
        
        //Generate a secret number between 0 and maxRange
        
        secretNumber = myRandom.nextInt(bound);
        
        //Display "I am thinking of a number between 0 and maxRange
        System.out.printf("\nI am thinking of a number between 0 and %d\n", maxRange);
        
        //Display "The number to guess is: " secretNumber
        System.out.printf("The number to guess is: %d\n", secretNumber);
        
        
        //have each player guess the number until there is a winner
        do
        {
            //increase number of guesses
            ++numGuesses;
            
            //use utility method guess to get each players guess
            player1.guess();
            player2.guess();
            player3.guess();
            
            //set winner to false
            winner = 0;
            
            //check each players guess
            //player 1
            if (player1.secretNumber() == secretNumber)
            {
                System.out.printf("\nDid Lisa get it right? True\n");
                winner = 1;
            }
            else 
            {
                System.out.printf("\nDid Lisa get it right? False\n");
            }
            
            //player 2
            if (player2.secretNumber() == secretNumber)
            {
                System.out.printf("Did Dino get it right? True\n");
                winner = 1;
            }
            else 
            {
                System.out.printf("Did Dino get it right? False\n");
            }
            
            //player 3
            if (player1.secretNumber() == secretNumber)
            {
                System.out.println("Did Carmen get it right? True");
                winner = 1;
            }
            else 
            {
                System.out.println("Did Carmen get it right? False");
            }
            
            //check for a winner(s)
            if (winner ==1 )
            {
                //output number of guesses
                System.out.printf("The lucky winner took %d times to guess right\n",numGuesses);
                System.out.println("Game is over!");
                
            }
            else
            {
                System.out.println("No winners this round! "); 
                System.out.println("Playerswill have to try again.");
            }
        }while(winner != 1);  
   
    }
    
}

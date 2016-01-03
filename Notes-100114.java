/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg10.pkg01.pkg2014.notes;

import java.util.Scanner;

/**
 *
 * @author bernice.templeman001
 */
public class Notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] studentScores; // declared var to hold an array of intergers
        studentScores = new int[5]; // instance (allocated memory )
        
        //hard coded
        studentScores[0] = 100;
        studentScores[1] = 87;
        studentScores[2] = 100;
        studentScores[3] = 87;
        studentScores[4] = 87;
        
        //print
        System.out.println("Student 1 score " + studentScores[0]);
        System.out.println("Student 2 score " + studentScores[1]);
        
        //can do in for loops
        //interactive arrays
        
        int numGames;
        Scanner userInput = new Scanner (System.in);
        
        int [] dwayneScores;
        
        //get number of games
        System.out.println("How many games to keep track of: ");
        numGames = userInput.nextInt();
        
        //allocated momory
        dwayneScores = new int [numGames];
        for (int game=0; game < numGames; game++)
        {
            System.out.printf("Game #id score : %d\n", game + 1);
            dwayneScores[game] = userInput.nextInt();
            
        }
        
        
        //
        String[] players = ["Dwayne Wade", "Chris Bosch", "Udonis Haslem"];
        
        //print
        for (int i=0; i<players.length; i++)
        {
            System.out.println(players[i] );
        }
        
        //enhanced loop
        for(int score: dwayneScores)
        {
            System.out.println("Scores" + scores);
        }
        
        for(String myPlayer )
        
    }
    
}

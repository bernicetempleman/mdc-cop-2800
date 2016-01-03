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
 *               Part 2: Player
 *               Variables: name, secretNumber, and maxRange
 *               Non-default constructor with name & maxRange
 *               Getters
 *               Utility method:
 *                  void guess() 
 *                  utilizing Random class 
 *                  to guess a number between 0 and maxRange
 *
 *
 */

package gamelauncher;

import java.util.Random;

/**
 *
 * @author Bernice.Templeman001
 */
public class Player {
    private String name;
    private int maxRange;
    private int secretNumber;
    private Random myRandom = new Random();
          
    
    public Player (String name, int maxRange)
    {
        this.name = name;
        this.maxRange = maxRange;
    }
    
    //Getters
     public String getName() {
        return name;
    }
     
     public int maxRange() {
        return maxRange;
    }
     
     public int secretNumber() {
        return secretNumber;
    }
    
    //utility method
    public void guess()
    {
        //utilizing Random class to guess a number between 0 and maxRange
        secretNumber = myRandom.nextInt(maxRange);
    }
    
    public void display()
    {
        System.out.printf("Name: %s\n ", this.name);
        System.out.printf("maxRange:  %d\n ", this.maxRange);
        System.out.printf("Guess: %\n", this.secretNumber);
    }
    
}

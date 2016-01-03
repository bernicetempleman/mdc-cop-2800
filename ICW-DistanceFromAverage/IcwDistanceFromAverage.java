/*
 * Programmer : Bernice Templeman
 * ICW Distance from Average
 *
 * Description:
 * Write a program that allows user to enter 
 * up to 10 positive double values. To quit, enter 
 * -99. For each number display its "distance" from
 * the average.
 * 
 * Example:
 * 10 20 30 40 50 60 70 80 90 100
 *
 * 550/10 = 55
 */

package icw.distancefromaverage;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author bernice.templeman001
 */
public class IcwDistanceFromAverage {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
     
        double [] numbers = new double[10];     // Array of numbers
        Scanner input=new Scanner(System.in);   // scanner to get user input
        double inputNumber=1;                   // holds the Number
        String inputNumberStr;                  // holds the string input number
        boolean parsable;                       // boolean flag if it is a number
        double average;                         // holds the average of the numbers input
        int counter=0,                          // count the numbers input
            total=0;                            // holds the total of the inputNumbers
        
        //loop to get the user input until -99 entered or max 10 numbers
        while(inputNumber != -99 && counter != 10)
        {
            System.out.printf("Number %d: Please enter a positive value\n(Enter -99 to quit): ", counter+1);
            inputNumberStr = input.next();           
            
            //set parsable to true
            parsable = true;
            //check if it is a parsable number
            try 
            { 
                Double.parseDouble(inputNumberStr) ;                          
            }
            //if not parsable set flag to false
            catch (NumberFormatException e)
            {
                parsable = false;
                //display error message
                System.out.println("Invalid Number. \n");
            }
        
            //if parsable  number
            if (parsable)
            {
                inputNumber = Double.parseDouble(inputNumberStr);           
            
                //check if positive
                if(inputNumber > 0)
                {
                    total += inputNumber;           // add number to toal
                    numbers[counter]=inputNumber;   // add number to array of numbers
                    counter++;                      // increment counter
                }
                else if ((inputNumber == -99) && (counter ==0))
                {
                    System.out.println("Thank you.");
                    exit(0);
                }
                else if (inputNumber != -99)// it is a negative number
                    System.out.println("Error: Negative number.");
            }
        }
        
        // calculate average
        average = total/(double)counter;
        //display the average
        System.out.println("\nThe average is: "+ average+"\n");
        
        //loop to display the distance each number is from the average
        for(int i=0;i<counter;i++)
        {
            double temp= Math.abs(numbers[i] - average);
            System.out.printf("Number %d : %.2f ", i+1, numbers[i]);
            System.out.printf("The distance between the average and %.2f is: %.2f\n", numbers[i],temp);
        }       
    }    
}

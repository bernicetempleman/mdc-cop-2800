/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg10.pkg08.pkg2014.notes;

import java.util.Arrays;

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
        
        //to print arrays
        
        //can print lists with one line
        
        int [] myArray = {10,20,30,40,50};
        
        //print enhanced for loop
        for(int myNum : myArray)
        {
            System.out.printf("Number: %d\n", myNum);
            
        }
        System.out.println("print with 1 line of code");
        System.out.println(Arrays.toString(myArray));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2d.array.pkg10.pkg15.pkg2014;

/**
 *
 * @author bernice.templeman001
 */
public class Array10152014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //list initialization- computer allocates memory for arry
        int [][] number = {
            {1,2,3,4},
            {4,5,6,7},
            {7,8,9,10} 
        };
        
        //2 loops to print
        for (int curRow = 0; curRow < 3; curRow++)
        {
            //inner loop for col
            for (int curCol = 0; curCol <4; curCol++)
            {
                 System.out.println(number[curRow][curCol] + " ");
            }
            System.out.println("\n");
        }
    }
        
}
        
        

 /* To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 




package sc00.pkg2darrays;




/**

 *

 * @author azejnilo

 

public class Sc002DArrays {




    /**

     * @param args the command line arguments

     

    public static void main(String[] args) {

        int [][] numbers = {  

                             {1, 2, 3, 4},

                             {4, 5, 6, 7},

                             {7, 8, 9 ,10}

                          };

        

        for(int curRow = 0; curRow < 3; curRow++ )

        {

            for (int curCol=0; curCol < 4; curCol++)

            {

                System.out.print(numbers[curRow][curCol] + " ");

            }

            

        }

    }

    

}
        // TODO code application logic here
    }
    
}*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package num_array;

/**
 *
 * @author bernice.templeman001
 */
public class Num_array {

    /**
     * @param args the command line arguments
     */
    
    
 /*   public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
/********/









    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        int [][] numbers = {  

                             {1, 2, 3, 4},

                             {4, 5, 6, 7},

                             {7, 8, 9 ,10},

                             {9, 19, 11, 12, 6, 99},

                             {1, 2} 

                          };

        

       /* for the original "neat" array

        for(int curRow = 0; curRow < 3; curRow++ )

        {

            for (int curCol=0; curCol < 4; curCol++)

            {

                System.out.print(numbers[curRow][curCol] + " ");

            }

            System.out.println("\n");

        }

        */

        

        // using the length attribute of the array

        for(int curRow = 0; curRow < numbers.length; curRow++ )

        {

            for (int curCol=0; curCol < numbers[curRow].length; curCol++)

            {

                System.out.print(numbers[curRow][curCol] + " ");

            }

            System.out.println("\n");

        }

        

        // operations on 2D Arrays

        // sum each row

        int [][] numArray = {  

                             {1, 2, 3, 4},

                             {4, 5, 6, 7},

                             {7, 8, 9 ,10}, 

                          };

        

        int rowTotal;

        for(int curRow = 0; curRow < numArray.length; curRow++ )

        {

            rowTotal = 0;

            for (int curCol=0; curCol < numArray[curRow].length; curCol++)

            {

                rowTotal = numArray[curRow][curCol];

                System.out.print("rowTotal: " + rowTotal);
                System.out.println("\n");

            }

            System.out.println("\n");

        }

        

    }

    

}
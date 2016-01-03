/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sc01.seatingchart;

/**
 *
 * @author bernice.templeman001
 */
public class Sc01SeatingChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] seats = {
            {10,10,10,10,10},
            {12,12,12,12,12},
            {15,15,15,15,15)},
            {20,10,12,18,15)},
            {59,80,60,35,25)}
    };
    
  
        // TODO code application logic here
    }

//where to place
     public static void displaySeats()
    {
        }
}
 /**************************************/

/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */




package sc01.seatingchart;




/**

 *

 * @author azejnilo

 */

public class Sc01SeatingChart {




    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        int [][] seats = {

                           {10, 10, 10, 10, 10},

                           {12, 12, 12, 12, 12},

                           {15, 15, 15, 15, 15},

                           {20, 10, 12, 18, 15},

                           {59, 80, 60, 35, 25}

                         };

        

        displaySeats(seats);

        }

    

    public static void displaySeats(int[][]seatingChart)

    {

        for(int curRow = 0; curRow < seatingChart.length; curRow++ )

        {

            for (int curCol=0; curCol < seatingChart[curRow].length; curCol++)

            {

                System.out.printf("%3d", seatingChart[curRow][curCol]);

            }

            

            System.out.println(" ");

        }

    }

    

}
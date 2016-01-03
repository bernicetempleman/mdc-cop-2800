/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz.arrays;

/**
 *
 * @author bernice.templeman001
 */
public class QuizArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //  int[] grades = new int[5];
        
//grades1[] = new int[5];

        //int[] grades2 = { 91, 83, 42, 100, 77 };
        // TODO code application logic here
  final int SUB = 12;
int[] x = new int[SUB];
int y = 100;
for(int i = 0; i < SUB; i++)
{
 x[i] = y;
 y += 10;
}
        System.out.println("x =" + x[8]);
    }
}

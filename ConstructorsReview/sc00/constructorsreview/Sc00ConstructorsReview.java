/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sc00.constructorsreview;

/**
 *
 * @author bernice.templeman001
 */
public class Sc00ConstructorsReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student myStudent = new Student("Jill","Green",1001, 3.7);
        Professor myProfessor = new Professor("Joe", "Brown", "Associate Professor");
        System.out.println(myStudent.toString());
        
        // TODO code application logic here
    }
    
}

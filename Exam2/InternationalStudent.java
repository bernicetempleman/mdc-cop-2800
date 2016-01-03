/* Programmer : Bernice Templeman
 *
 * has everything Student has
 * override the toString method
  to explicitly include "International" description
 */

package exam2.runner;

/**
 *
 * @author bernice.templeman001
 */
public class InternationalStudent extends Student{

    public InternationalStudent(String name, double gpa) {
        super(name, gpa);
    }
    
    @Override
    public String toString()
    {
        String output =( "International Student "
                        + "Name: " 
                        + this.name 
                        + "  GPA: "
                        + this.gpa);
        return output;
    }
    
}

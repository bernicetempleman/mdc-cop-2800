/*Programmer : Bernice Templeman
 * 
class: student
 * 1. fields name and gpa
 * 2. non-default constructor, which creates a student of specified name and gpa
 * 3. getters
 * 4. setters
 * 5. override the toString method
 */

package exam2.runner;

/**
 *
 * @author bernice.templeman001
 */
public class Student {
    public String name;
    public double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public String toString()
    {
        String output =("Name: " 
                        + this.name 
                        + "  GPA: "
                        + this.gpa);
        return output;
    }
    
}

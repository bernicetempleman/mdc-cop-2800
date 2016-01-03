/* Programmer : Bernice Templeman
 *
8. fields name (scholarship name), 
   gpa (the minimum gpa required to qualify for scholarship), 
   fund (how much money is available in the fund in total), 
   and award (how much money each student is awarded)
9. field students (the ArrayList of student scholarship recipients)
10. non-default constructor, which creates a scholarship fund of specified name, gpa, fund, and award

11. method addStudent which adds student 
(this includes international student) into the students list, 
keeping in mind student must satisfy minimum gpa requirement 
and there is still moneys remaining in the fund, 
as each student added to the list is eventually paid an award

12. override the toString method (include individual students within the list)

 */

package exam2.runner;

import java.util.ArrayList;

/**
 *
 * @author bernice.templeman001
 */
public class ScholarshipFund {
    public String name;
    public double gpa;
    public int fund;
    public int award;
    
    ArrayList<Student> students = new ArrayList<Student>();

    public ScholarshipFund(String name, double gpa, int fund, int award) {
        this.name = name;
        this.gpa = gpa;
        this.fund = fund;
        this.award = award;
    }
    
    
    public void addStudent(String name, double StudentGPA)
    {
        
        if (this.gpa <= StudentGPA )
        {
            if(this.award <= this.fund)
            { 
                this.fund = this.fund - this.award;
               
                students.add ( new Student(name, StudentGPA));
     
            }
        }
    }
    
    // override the toString method (include individual students within the list)
    @Override
    public String toString()
    {
      String output = " ";
      for (Student s: this.students)
        {
            //calling each object’s toString method.
            System.out.println(s.toString());
      
        }
        return output;
    }
}

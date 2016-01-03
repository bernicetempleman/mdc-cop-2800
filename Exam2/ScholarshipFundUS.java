/* Programmer : Bernice Templeman
13. Has everything ScholarshipFund has
14. Override addStudent
 exclude international students from being added to the list 
(use instanceof operator)

 */

package exam2.runner;

/**
 *
 * @author bernice.templeman001
 */
public class ScholarshipFundUS extends ScholarshipFund {

    public ScholarshipFundUS(String name, double gpa, int fund, int award) {
        super(name, gpa, fund, award);
    }
    
    @Override
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
    
    
}

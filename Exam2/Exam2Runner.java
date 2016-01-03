/* Programmer : Bernice Templeman
*
* 15. Create 3 students [Lisa, 4.0; Jenna, 3.1; Chelsea, 2.5] and 1 international student [Yali, 3.6]
* 16. Create ScholarshipFund [Women in IT, 3.0, 1600, 500]
* 17. Create ScholarshipFundUS [Hialeah Tech, 3.0, 2000, 600]
* 18. Add all 4 students to both funds created in 16 and 17
* 19. Display both funds
 */

package exam2.runner;

/**
 *
 * @author bernice.templeman001
 */
public class Exam2Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create students
        Student student1 = new Student("Lisa", 4.0);
        Student student2 = new Student("Jenna", 3.1);
        Student student3 = new Student("Chelsea", 2.5);
        InternationalStudent iStudent1 = new InternationalStudent("Yali", 3.6);
        
        //create funds
        ScholarshipFund scholarshipfund1 = new ScholarshipFund("Women in IT", 3.0, 1600, 500);
        ScholarshipFundUS scholarshipfund2 = new ScholarshipFundUS("Hialeah Tech", 3.0, 2000, 600);
        
        // Add all 4 students to both funds
        scholarshipfund1.addStudent(student1.getName(),student1.getGpa());
        scholarshipfund1.addStudent(student2.getName(),student2.getGpa());
        scholarshipfund1.addStudent(student3.getName(),student3.getGpa());
        scholarshipfund1.addStudent(iStudent1.getName(),iStudent1.getGpa());
        
        scholarshipfund2.addStudent(student1.getName(),student1.getGpa());
        scholarshipfund2.addStudent(student2.getName(),student2.getGpa());
        scholarshipfund2.addStudent(student3.getName(),student3.getGpa());
        scholarshipfund2.addStudent(iStudent1.getName(),iStudent1.getGpa());
             
        //display funds
        String Fund1 = scholarshipfund1.toString();
        System.out.println(" "+ Fund1);
        
        String Fund2 = scholarshipfund2.toString();
        System.out.println(" "+ Fund2);
 
    }
    
}

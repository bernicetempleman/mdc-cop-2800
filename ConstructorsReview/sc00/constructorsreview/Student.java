/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */




package sc00.constructorsreview;




/**

 *

 * @author azejnilo

 */

public class Student extends Person{

    private int studentID;

    private double gpa;

    public Student(String name, String eyeColor, int StudentID, double gpa)

    {

        super(name, eyeColor);

        this.studentID = studentID;

        this.gpa = gpa;

        System.out.println("Student");

    }

}
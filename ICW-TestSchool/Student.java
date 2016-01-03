/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bernice.templeman001
 */
public class Student extends Person {

    private String major;
    
    public Student(String name, char sex, String major)
    {
        super(name, sex);
        this.major = major;
    }
}

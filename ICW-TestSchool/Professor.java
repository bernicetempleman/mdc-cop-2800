/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bernice.templeman001
 */
public class Professor extends Person {
    private String discipline;
    
    public Professor(String name, char sex, String discipline)
    {
        super(name, sex);
        this.discipline = discipline;
    }
}







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

public class Professor extends Person{

    String rank;

    

    public Professor(String name, String eyeColor, String rank)

    {

        super(name, eyeColor);

        this.rank = rank;

        System.out.println("Professor");

    }

}
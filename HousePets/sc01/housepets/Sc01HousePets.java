/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */




package sc01.housepets;




/**

 *

 * @author azejnilo

 */

public class Sc01HousePets {




    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        

        Pet[] petSitter = new Pet[5];

        petSitter[0] = new Dog();

        petSitter[1] = new Dog();

        petSitter[2] = new Cat();

        petSitter[3] = new Dog();

        petSitter[4] = new Pet();

        

        for (Pet p: petSitter)

        {

            p.speak();

        }

    }


    

}
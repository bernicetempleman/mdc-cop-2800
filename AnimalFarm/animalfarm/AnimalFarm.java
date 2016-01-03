/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animalfarm;

/**
 *
 * @author bernice.templeman001
 */
public class AnimalFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Animal[] AnimalFarm = new Pet[5];

        AnimalFarm[0] = new Dog();

        AnimalFarm[1] = new Duck();

        AnimalFarm[2] = new Cat();

        AnimalFarm[3] = new Horse();

        AnimalFarm[4] = new Pig();

        

        for (Pet p: animalFarm)

        {

            p.speak();

        }

    }

        // TODO code application logic here
    }
    
}

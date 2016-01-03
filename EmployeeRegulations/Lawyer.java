/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bernice.templeman001
 */
//public class Lawyer {
   // A class to represent lawyers.
public class Lawyer extends Employee {
    // overrides getVacationForm from Employee class
    @Override
    public String getVacationForm() {
        return "pink";
    }
    
    // overrides getVacationDays from Employee class
    @Override
    public int getVacationDays() {
        return 15;           // 3 weeks vacation
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}



	}

}

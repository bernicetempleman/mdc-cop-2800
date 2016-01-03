/*

Write a complete program that demonstrates these classes 
by asking the user to enter the amounts 
of deposits and 
withdrawals 
for a savings account and checking account.

The program should display statistics for the month, 
including beginning balance, 
total amount of deposits, 
total amount of withdrawals, 
service charges, 
and ending balance.

Feel free to add more member variables and functions to the classes than those listed above.

 */

package icw.bankingdriver;

/**
 *
 * @author bernice.templeman001
 */
public class ICWBankingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double balance = 10000.00;
        double annualInterestRate =0.71;
        
        Checking mychecking = new Checking(balance, annualInterestRate);
        Savings mysavings = new Savings(balance, annualInterestRate);
        
        //amount to withdraw
        
        //amount to deposit
        
        // display monthly statisics
        // beginning balanc
        // total amount of deposits
        // total amount of withdrawals
        // service charges
        // ending balance
        
        System.out.println(" " +mychecking.getBalance());
        System.out.println(" " +mysavings.getBalance());
        mysavings.deposit(10000);
        System.out.println(" " +mysavings.getBalance());
        
    }
    
}

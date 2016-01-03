package icw.bankingdriver;


import icw.bankingdriver.BankAccount;

/*
Next, design a checking account class, 
also derived from the generic account class. 
It should have the following member functions:

withdraw:            
Before the base class function is called, 
this function will determine if a withdrawal (a check written) 
will cause the balance to go below $0. 
If the balance goes below $0, 
a service charge of $15 will be taken from the account. 
(The withdrawal will not be made.) 
If there isn’t enough in the account to pay the service charge, 
the balance will become negative and the customer will owe the negative amount to the bank.

monthlyProc: 
Before the base class function is called, 
this function adds the monthly fee of $5 plus $0.10 per withdrawal (check written) 
to the base class variable that holds the monthly service charges.
 */

/**
 *
 * @author bernice.templeman001
 */
public class Checking extends BankAccount {

    public Checking(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
    }
    
    @Override
    public void withdraw(double amount)
    {
        
    }
    
}

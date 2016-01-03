package icw.bankingdriver;


import icw.bankingdriver.BankAccount;

/*
Next, design a savings account class, 
derived from the generic account class. 
The savings account class should have the following additional member:

status (to represent an active or inactive account)

If the balance of a savings account falls below $25, 
it becomes inactive. 
(The status member could be a ﬂag variable.) 
No more withdrawals may be made until the balance is raised above $25, 
at which time the account becomes active again. 

The savings account class should have the following member functions:

withdraw: 
A function that checks to see if the account is inactive before a withdrawal is made. 
(No withdrawal will be allowed if the account is not active.) 
A withdrawal is then made by calling the base class version of the function.

deposit:        
A function that checks to see if the account is inactive before a deposit is made. 
If the account is inactive and the deposit brings the balance above $25, the account becomes active again.
The deposit is then made by calling the base class version of the function.

monthlyProc: 
Before the base class function is called, 
this function checks the number of withdrawals. 
If the number of withdrawals for the month is more than 4, 
a service charge of $1 for each withdrawal above 4 
is added to the base class variable that holds the monthly service charges. 
(Don’t forget to check the account balance after the service charge is taken.
If the balance falls below $25, the account becomes inactive.)
 */

/**
 *
 * @author bernice.templeman001
 */

public class Savings extends BankAccount{
    
    boolean status;

    public Savings(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
    }
    
    private void checkbalance()
    {
        
    }
    
    // withdraw
    // A function that checks to see if the account is inactive before a withdrawal is made. 
    // (No withdrawal will be allowed if the account is not active.) 
    // A withdrawal is then made by calling the base class version of the function.
    
     @Override
    public void withdraw(double amount)
    {
        if (this.status)
        {
            super.withdraw(amount);
        }
        else
        {
            System.out.println("No withdrawal will be allowed if the account is not active.");
        }
    }
    
    // deposit:        
    // A function that checks to see if the account is inactive before a deposit is made. 
    // If the account is inactive and the deposit brings the balance above $25, 
    // the account becomes active again.
    // The deposit is then made by calling the base class version of the function.
    
    @Override
    public void deposit(double amount)
    {
         if (!this.status)
         {
             if ((this.getBalance()+ amount)> 25)
                 status = true;
             super.deposit(amount);
         }
    }
    
    // monthlyProc: 
    // Before the base class function is called, 
    // this function checks the number of withdrawals. 
    // If the number of withdrawals for the month is more than 4, 
    // a service charge of $1 for each withdrawal above 4 
    // is added to the base class variable that holds the monthly service charges. 
    // (Don’t forget to check the account balance after the service charge is taken.
    // If the balance falls below $25, the account becomes inactive.)
    
    @Override
    public void monthlyProc()
    {
        
    }
}

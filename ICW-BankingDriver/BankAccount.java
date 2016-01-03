package icw.bankingdriver;

/*
Design a generic class to hold the following information about a bank account:

Balance
Number of deposits this month
Number of withdrawals
Annual interest rate
Monthly service charges

The class should have the following member functions:

Constructor:       
Accepts arguments for the balance and annual interest rate.

deposit:               
A virtual function that accepts an argument for the amount of the deposit. 
The function should add the argument to the account balance. 
It should also increment the variable holding the number of deposits.

withdraw:            
A virtual function that accepts an argument for the amount of the withdrawal. 
 The function should subtract the argument from the balance. 
It should also increment the variable holding the number of withdrawals.

calcInt:  
A virtual  function that updates the balance 
by calculating the monthly interest earned by the account, 
and adding this interest to the balance. 
This is performed by the following formulas:

o   Monthly Interest Rate = (Annual Interest Rate / 12)

o   Monthly Interest = Balance * Monthly Interest Rate

o   Balance = Balance + Monthly Interest

monthlyProc: 
A virtual function that subtracts the monthly service charges from the balance, 
calls the calcInt function, 
and then sets the variables that hold 
the number of withdrawals, 
number of deposits, 
and monthly service charges to zero.
 */

/**
 *
 * @author bernice.templeman001
 */
public class BankAccount {
    private  double balance;
    private int numberDepositsMonth;
    private int numberWithdrawalsMonth;
    private double annualInterestRate;
    private double monthlyServiceCharges;
    
//Constructor:
//Accepts arguments for the balance and annual interest rate.
    public BankAccount(double balance,  double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumberDepositsMonth() {
        return numberDepositsMonth;
    }

    public void setNumberDepositsMonth(int numberDepositsMonth) {
        this.numberDepositsMonth = numberDepositsMonth;
    }

    public int getNumberWithdrawalsMonth() {
        return numberWithdrawalsMonth;
    }

    public void setNumberWithdrawalsMonth(int numberWithdrawalsMonth) {
        this.numberWithdrawalsMonth = numberWithdrawalsMonth;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyServiceCharges() {
        return monthlyServiceCharges;
    }

    public void setMonthlyServiceCharges(double monthlyServiceCharges) {
        this.monthlyServiceCharges = monthlyServiceCharges;
    }
    
    
    
//*******************

    
    // Deposit
    // A virtual function that accepts an argument for the amount of the deposit. 
    // The function should add the argument to the account balance. 
    // It should also increment the variable holding the number of deposits.
     public void deposit( double amount)
     {
         this.balance += amount;
         this.numberDepositsMonth++;
        
     }
    
     // Withdraw
     // A virtual function that accepts an argument for the amount of the withdrawal. 
     // The function should subtract the argument from the balance. 
     // It should also increment the variable holding the number of withdrawals.
     public void withdraw(double amount)
     {
         this.balance = this.balance - amount;
         this.numberWithdrawalsMonth++;
     }
    
    //calcInt
     // A virtual  function that updates the balance 
     // by calculating the monthly interest earned by the account, 
     // and adding this interest to the balance. 
     // This is performed by the following formulas:
/*
o   Monthly Interest Rate = (Annual Interest Rate / 12)
o   Monthly Interest = Balance * Monthly Interest Rate
o   Balance = Balance + Monthly Interest
 */
     public void calcInt ()
     {
         double monthlyInterestRate;
         double monthlyInterest;
         
         monthlyInterestRate = this.getAnnualInterestRate() /12;
         monthlyInterest = this.getBalance() * monthlyInterestRate;
         this.setBalance(this.getBalance()+monthlyInterest);
         
     }
     
    //monthlyProc
     // A virtual function that subtracts the monthly service charges from the balance, 
     // calls the calcInt function, 
     
     // and then sets the variables that hold 
     // the number of withdrawals, 
     // number of deposits, 
     // and monthly service charges to zero.
     public void monthlyProc()
     {
         balance -= monthlyServiceCharges;
         calcInt();
         
         this.setNumberDepositsMonth(0);
         this.setNumberWithdrawalsMonth(0);
         this.setMonthlyServiceCharges(0);
     }
     
}

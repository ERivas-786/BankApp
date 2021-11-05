public class CheckingsAccount extends BankAccount {
    double transactionFee = 15.0;
    public CheckingsAccount(){
       
        
    }
    
    public void checkingsBalance(){
        currentBalance = currentBalance - transactionFee;
        System.out.println("Your deposit Fee is %" + transactionFee);
        System.out.println("Your total balance is now $" + currentBalance);
        
    }
    
    public void viewBalance(){      
        System.out.println("Your transaction Fee is $" + transactionFee);
        System.out.println("Your total balance is $" + currentBalance);
    }
    
    
}
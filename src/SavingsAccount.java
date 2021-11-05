public class SavingsAccount extends BankAccount {
    double interest = 0.05;
    double calculateInterest;
    double finalBalance;
    
    public SavingsAccount(){
              
        
    }
    
        public void interestdepositBalance(){
        calculateInterest = (currentBalance * interest);
        finalBalance = currentBalance + calculateInterest;
        System.out.println("Your interest rate is %" + (interest * 100));
        System.out.println("Your interest amount is $" + calculateInterest);
        System.out.println("Your total balance with interest is $" + finalBalance);
        
    }
        
         public void interestwithdrawalBalance(){
        calculateInterest = (currentBalance * interest);
        finalBalance = currentBalance + calculateInterest;
        System.out.println("Your interest rate is %" + (interest * 100));
        System.out.println("Your interest amount is $" + calculateInterest);
        System.out.println("Your total balance with interest is $" + finalBalance);
    }
        
        
        public void viewBalance(){      
        System.out.println("Your interest rate is %" + (interest * 100));
        System.out.println("Your interest amount is $" + calculateInterest);
        System.out.println("Your total balance with interest is $" + finalBalance);
    }
}
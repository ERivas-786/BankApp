import java.util.Scanner;



public class BankAccount{
    public double currentBalance;
   
  
  
  public BankAccount(){ 
      
  } 
    
   public void accountBalance(){
     System.out.println(currentBalance);
   } 
   
    
       
     public void depositAmount(){
     Scanner scan = new Scanner(System.in);
     double amount = scan.nextDouble();
     System.out.println("You are depositing: $" + amount);
     currentBalance = currentBalance + amount;
     System.out.print("Your total balance is: $" + currentBalance); 
     System.out.println("");
      
   }
   
   
   public void withdrawAmount(){
	  Scanner scan = new Scanner(System.in);
	  double amount = scan.nextDouble();
       
       if(amount <= 0.0){
       System.out.println("Invalid amount");
    }
       else if(amount < currentBalance){
        System.out.println("You are withdrawing: $" + amount);
        currentBalance = currentBalance - amount;
        System.out.println("Your total balance is: $" + currentBalance);
        System.out.println("");
     }    
      
      else{
        System.out.println("Error: Debit amount exceeded account balance");
      }   
   }
   
     
       
       
   }
    
   
   
    


   


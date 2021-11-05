import java.util.Scanner;


public class Main {
	
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
       
        
        
        
        System.out.println("Select an option: ");
        System.out.println("1: Open savings account");
        System.out.println("2: Open checkings account");
        double userInput = scan.nextDouble();
        
        
        
       
        
        
   if(userInput == 1){
	     SavingsAccount B1 = new SavingsAccount(); 
         System.out.println("Enter an amount to deposit");
         
         
             
             if(userInput != 0){  
            	 
                 B1.depositAmount();
                 System.out.println("");
             }
             else{
                 System.out.println("Error: Initial balance was invalid");
                 System.exit(0);
                 System.out.println("");
             }
             
         
         
         System.out.println("What would you like to do?");
         System.out.println("");
         
       
        while(true){   
        System.out.println("1:View Balance");
        System.out.println("2:Deposit");
        System.out.println("3:Withdraw");
        System.out.println("4:Exit");
        System.out.println("");     
        int option = scan.nextInt();
        System.out.println("");
        
        
       
       
             switch (option) {
                 case 1:
                     System.out.print("Your current balance is: $");
                     B1.accountBalance();
                     B1.viewBalance();
                     System.out.println("");
                     break;
                 case 2:
                     System.out.print("Enter amount to Deposit: $");
                     B1.depositAmount();
                     B1.interestdepositBalance();
                     System.out.println("");
                     break;
                 case 3:
                     System.out.print("Enter amount to Withdraw: $");
                     B1.withdrawAmount();
                     B1.interestwithdrawalBalance();
                     System.out.println("");
                     break;
                 case 4:
                     System.out.println("Goodbye");
                     System.exit(0);
                 default:
                     System.out.println("Error: option not available");
                     System.out.println("");
                     break;
             }
      
        System.out.println("What else you like to do?");
        
        }
             
       }
        
        
    else if(userInput == 2){
    	CheckingsAccount C1 = new CheckingsAccount();
        System.out.println("Enter an amount to deposit");
        
       
         
             
             if(userInput != 0){  
                 C1.depositAmount();
                 System.out.println("");
             }
             else{
                 System.out.println("Error: Initial balance was invalid");
                 System.exit(0);
                 System.out.println("");
             }
             
         
         
         System.out.println("What would you like to do?");
         System.out.println("");
         
       
      
         
        while(true){   
        System.out.println("1:View Balance");
        System.out.println("2:Deposit");
        System.out.println("3:Withdraw");
        System.out.println("4:Exit");
        System.out.println("");     
        int option = scan.nextInt();
        System.out.println("");
        
        
       
       
            switch (option) {
                case 1:
                    System.out.print("Your current balance is: $");
                    C1.accountBalance();
                    C1.viewBalance();
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter amount to Deposit: $");
                    C1.depositAmount();
                    C1.checkingsBalance();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Enter amount to Withdraw: $");          
                    C1.withdrawAmount();
                    C1.checkingsBalance();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Error: option not available");
                    System.out.println("");
                    break;
            }
      
        System.out.println("What else you like to do?");
        
        }
        
        }
        
        else{
            System.out.println("Error: Invalid Option");           
        }
        
    }
}
      
    
    
       
      
       
       
       



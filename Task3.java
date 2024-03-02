import java.util.*;
class Atm {
    String Username;
    String pin;
    float amount;
    Scanner sc=new Scanner(System.in);
    Atm(){
        System.out.println("Enter Your name : ");
        Username=sc.next();
        System.out.println("Your Pin is 3245");
        pin="3245";
        System.out.println("ADD amount to your account");
            amount=sc.nextFloat();
        
    


    }
    void deposite(float amount){
        
                System.out.println(amount + "has been added ! ");
                this.amount+=amount;
              
        
    }
    
    void checkBalance(){
        String txt;
        while(true){
            System.out.println("Enter Pin : ");
            txt=sc.next();
        
            if (pin.equals(txt)) {  System.out.println(amount+" Blance is left in account ");break;
                        
            }
            else{System.out.println("wrong pin ");}
        
    }
    
      
    }
    void Withdraw(float amount){
        String txt;
        while(true){
            System.out.println("Enter Pin : ");
            txt=sc.next();
        
            if (pin.equals(txt)) {
                System.out.println(amount +" has been Withdrawed ! ");
                this.amount-=amount;
                break;
                        
            }
            else{System.out.println("wrong pin ");}
        
    }

       
    }


    
}
public class Task3 {
    public static void main(String[] args) {
        Atm account =new Atm();
        Scanner sc =new Scanner(System.in);
        int i=1;
        float amount;
        while (i!=0) {
            System.out.println("Enter\n1 for Cheaking Balance \n2 for Withdrawing Amount \n3 depositing amount \n0 to exit ");
            i=sc.nextInt();
            if (i==1) {
                account.checkBalance();
                
            }
            else if (i==0) {
                break;
                
            }
            else if (i==2) {
                System.out.println("Enter Amount to withdraw (<20000) ");
                amount=sc.nextFloat();
                while(amount>20000||amount<0){System.out.println("invalid amount exceds limit\n Enter Again ");amount=sc.nextFloat();}
                account.Withdraw(amount);
            } else if (i==3){
                System.out.println("Enter Amount to Deposite (<100000) ");
                amount=sc.nextFloat();
                while(amount>100000||amount<0){System.out.println("invalid amount exceds limit\n Enter Again ");amount=sc.nextFloat();}
                account.deposite(amount);
                
            }
            else{
                System.out.println("Invalid choice");
            }
        }
    }
    
}

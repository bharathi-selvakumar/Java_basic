package Tasks;

import java.util.Scanner;

class Account{
    public void accountNumber(){
        long Number=987654321;
        System.out.println(Number);
    }

    public long accountBalance(){
        long Balance=30_000;
        return Balance;
    }
    public  String accountHolder(){
        String Name="Bharathi";
        return Name;

    }
}

class DebitCard extends  Account{
    public void cardNumber(){
        long C_number=1233_2323_2329L;
    }

    public int cardPin(){
            int D_pin=5657;
            return D_pin;
    }
}

class Withdraw extends DebitCard{
    public void B_check(){
        DebitCard obj =new DebitCard();
        long Balance =obj.accountBalance();
        String Name=obj.accountHolder();
        int Debit_pin=obj.cardPin();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Amount to be withdraw");
        long Withdraw_amount= scan.nextLong();
        scan.nextLine();



        if(Balance>=Withdraw_amount){
            System.out.println("Enter the 4_Digit pin ");
            int User_pin=scan.nextInt();
            if(Debit_pin==User_pin) {
                System.out.println("Dear Customer " + Name + "\n\tYour amount " + Withdraw_amount + " withdraw successfully");
                long New_balance = Balance - Withdraw_amount;
                System.out.println("\tThe remaining balance amount is " + New_balance);
            }
            else{
                System.out.println("Please Enter the valid PIN number ");
            }
        }
        else {
            System.out.println(" Insufficient bank balance in your account \n"+"\t Please enter the valid amount ");
        }
    }
}


class G_pay{
    public int  upiPin(){
        int UPI_pin=5657;
        return UPI_pin;
    }
    public String username(){
        String User_name="Bharathi";
        return User_name;
    }
}

class PayBills_para extends G_pay{
    Scanner bill_obj= new Scanner(System.in);

        public String billerName(){
            System.out.println("Enter the Biller Name");
            String Biller_name=bill_obj.nextLine();
            return Biller_name;
        }

        public int bill(){
//            Scanner bill_obj= new Scanner(System.in);
            System.out.println("Enter the amount to billed");
            int Billed_amount=bill_obj.nextInt();
            bill_obj.nextLine();
            return Billed_amount;
        }

        public String billerType(){
            System.out.println("Enter the Biller type");
            String Type=bill_obj.nextLine();
            return Type;
        }
}

 class MainBillPay{
    public void Billing(){
        Scanner MainBill_obj= new Scanner(System.in);
        PayBills_para obj=new PayBills_para();
        String BillerType=obj.billerType();
        int Bill=obj.bill();
        String BillerName=obj.billerName();
        int UPI_PIN=obj.upiPin();
        String Name=obj.username();
        System.out.println("Enter the UPI PIN number");
        int PINNUMBER=MainBill_obj.nextInt();
        if(UPI_PIN==PINNUMBER){
            System.out.println("Dear "+BillerName+" \n\tbilling amount of "+Bill+" for "+BillerType+" is successfully completed");
        }
        else{
            System.out.println("Please Enter the valid PIN");
            
        }
    }
 }





public class MobileBanking {
    public  static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("IF YOU WANT TO CHECK THE BANK BALANCE ,ENTER THE number 1\n\t" +
                "IF YOU WANT TO WITHDRAW THE AMOUNT ,ENTER THE number 2 \n\t" +
                "IF YOU WANT TO PAY A BILL , ENTER THE number 3" );
        int Commend=scan.nextInt();
        Withdraw obj_balance=new Withdraw();
        long BankBalance=obj_balance.accountBalance();
        if(Commend==1){
            System.out.println("\tYour current Bank balance is "+BankBalance);
        }
        else if (Commend==2) {
            System.out.println("You choose Withdrawal");
            Withdraw objMainWithdraw=new Withdraw();
            objMainWithdraw.B_check();
        }
        else if (Commend==3){
            System.out.println("You choose PayBill");
            MainBillPay objBillPay=new MainBillPay();
            objBillPay.Billing();
        }
        else {
            System.out.println("Enter the correct Number ");
            main(args);
        }
    }
}

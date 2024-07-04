package oops;

public class Encapsulation{
    private  String Name;
    private int Age;
    private String country;


    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public String getcountry() {
        return country;
    }

    public void setcountry(String country) {
        this.country = country;
    }
    public static void main(String[] args){
        Encapsulation obj=new Encapsulation();
       obj.setAge(19);
       obj.setName("bharathi");
       obj.setcountry("USA");
        System.out.println("name "+obj.getName());
        System.out.println("age "+obj.getAge());
        System.out.println("country "+obj.getcountry());

//        BankAccount obj = new BankAccount();
//        obj.setAccountNumber(43928409384092L);
//        obj.setBalance(34389);
//        System.out.println("Account Number "+obj.getAccountNumber());
//        System.out.println("Balance "+obj.getBalance());
    }

}



//Write a Java program to create a class called BankAccount with
// private instance variables accountNumber and balance.
// Provide public getter and setter methods to access and modify these variables.

class BankAccount{
    private  long accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }




}
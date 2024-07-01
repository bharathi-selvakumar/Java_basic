package intern;
import java.util.Scanner;

public  class KYC {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name :");
        String name=scan.nextLine();
        System.out.println("Date of birth :");
        String dob=scan.nextLine();
        System.out.println("Contact :");
        long contact=scan.nextLong();
        scan.nextLine();
        System.out.println("Email ID :");
        String email=scan.nextLine();
        System.out.println("Aadhaar number :");
        long aadhaar=scan.nextLong();
        scan.nextLine();
        System.out.println("PAN number :");
        String pan=scan.nextLine();
       System.out.println("\n"+"KYC Acknowledgement\n"+

               "Dear"+"["+name+"]\n"+
               "We are pleased to inform you that your KYC application has been submitted successfully.\n" +
               " Our team will review your application and update your KYC status shortly.\n"

               +"Thank you for choosing SB in MEC bank. We appreciate your cooperation and patience in this process.\n"+
                "\n"+"Application Details:\n"+
                            "Customer Name:"+name+"\n"+
                            "Date of birth:"+dob+"\n"+
                            "Contact:"+contact+"\n"+
                            "Email_id:"+email+"\n"+
                            "Aadhaar number:"+aadhaar+"\n"+
                            "PAN number:"+pan+"\n"+


               "Thank you for banking with us.\n" +
                        "\n" +
                        "Best regards,SB in MEC bank"
       );

    }
}




//using the Scanner we can get the input from user
//To use the nextline() with the Scanner variable  after getting any number


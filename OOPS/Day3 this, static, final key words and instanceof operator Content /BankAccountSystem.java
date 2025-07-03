class bankaccount{
    static String Bankname="sbi";
    static int totalaccount=0;
    final int accountno;
    String accountholdername;


    public static void gettotalaccount(){
        System.out.println(totalaccount+"thotal no of account") ;
    }
    bankaccount(int accountno,String  accountholdername){
        this.accountno=accountno;
        this.accountholdername=accountholdername;
        totalaccount++;
    }
    void display(){
        System.out.println("bank name"+Bankname);
        System.out.println("account no"+accountno);
        System.out.println("account holder"+accountholdername);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        
        bankaccount account1=new bankaccount(65432, "purav");
        if(account1 instanceof bankaccount){
            System.out.println("account1 instanceof bankaccount");
             account1.display();

        }
       bankaccount.gettotalaccount();
        
        bankaccount accoutn2=new bankaccount(243, "afsasf");
        if(accoutn2 instanceof bankaccount){
            System.out.println("account2 instanceof bankaccount");
            accoutn2.display();
        }
        bankaccount.gettotalaccount();
        
    }
    
}

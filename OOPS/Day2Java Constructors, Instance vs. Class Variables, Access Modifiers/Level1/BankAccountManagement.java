class BankAccount{
    public int accountno;
    protected String accountholder;
    private double Balance;
    BankAccount(){

    }
    BankAccount(int ac,String acc,double ba){
        accountno=ac;
        accountholder=acc;
        Balance=ba;
    }
    public double changebalance(double newbalance){
        Balance=newbalance;
        return Balance;
    }
    public void dispaly(){
        System.out.println("account no"+accountno);
        System.out.println("account holder"+accountholder);
        System.out.println("balance"+Balance);
    }
}
class SavingAccout extends BankAccount{
    public void detail(){
         System.out.println("account no"+accountno);
        System.out.println("account holder"+accountholder);
        
    }


}



public class BankAccountManagement {

    public static void main(String[] args) {
        BankAccount account =new BankAccount(234556, "areha", 12345);
        account.dispaly();
        account.changebalance(4321);
        account.dispaly();
        SavingAccout accout1=new SavingAccout();
        accout1.accountno=54321;
        accout1.accountholder="rakul";
        accout1.detail();        
        
    }
}
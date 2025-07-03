class BankAccount{
    public int accountno;
    protected String accountholder;
    private double Balance;
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


public class BankAccountManagement {

    public static void main(String[] args) {
        BankAccount account =new BankAccount(234556, "areha", 12345);
        account.dispaly();
        account.changebalance(4321);
        account.dispaly();
        
        
    }
}
class bankaccount{
    String accountholder;
    int accountno;
    double balance;
    bankaccount(String accountholder,int accountno,double balance){
        this.accountholder=accountholder;
        this.accountno=accountno;
        this.balance=balance;

    }
      public double depositemoney(double deposit){
            balance=balance+deposit;
            return balance;
        }
    public double withdawmoney(double withdawmoneyy){
        if(withdawmoneyy>balance)
        System.out.println("insuffcient balance");
        else{
            balance=balance-withdawmoneyy;
        }
        return balance;
    }
    public void displaydetail(){
        System.out.println("Accountholdert name"+accountholder);
        System.out.println("account no"+accountno);
        System.out.println("current balance ="+balance);
        

    }

    
}

public class SimulateanATM {
    public static void main(String[] args) {
        bankaccount account1=new bankaccount("Agastya", 456789876, 223456789);
        account1.displaydetail();
        double deposit=2345678;
        account1.depositemoney(deposit);
        account1.displaydetail();
        double withdawmoney=3456789;
        account1.withdawmoney(withdawmoney);
        account1.displaydetail();

    }

    
}
class Bankaccount{
    String accountno;
    double balance;
    Bankaccount(String accountno,double balance){
        this.accountno=accountno;
        this.balance=balance;
    }
    void display(){
        System.out.println("account no");
        System.out.println("total balance"+balance);
    }
}
class SavingAccount extends Bankaccount{
    int interestrate;
    SavingAccount(String accountno,double balance,int interestrate){
        super(accountno, balance);
        this.interestrate=interestrate;
    }
    void display(){
        super.display();
        System.out.println("saving account");
        System.out.println("interest rate"+interestrate);
    }
}
class Checkingaccoutn extends Bankaccount{
    double withdrawlimit;
    Checkingaccoutn(String accountno,double balance,double withdrawlimit){
        super(accountno, balance);
        this.withdrawlimit=withdrawlimit;
    }
    void display(){
        super.display();
        System.out.println("checking account");
        System.out.println("withdraw limit of account"+withdrawlimit);
    }

}

class FixedepositAccount extends Bankaccount{
    int maturatiypreiod;
    FixedepositAccount(String accountno,double balance,int maturatiypreiod){
        super(accountno, balance);
        this.maturatiypreiod=maturatiypreiod;
    }
    void display(){
        super.display();
        System.out.println("fd account");
        System.out.println("msturatityperiod is:"+maturatiypreiod);

    }
}
public class BankAccountType {

    public static void main(String[] args) {
        SavingAccount s1=new SavingAccount("423", 333333, 4);
        s1.display();
        Checkingaccoutn c1=new Checkingaccoutn("323321", 432413, 324123);
        c1.display();
        FixedepositAccount f1=new FixedepositAccount("12342314", 232322, 2);
        f1.display();
        

    }
}
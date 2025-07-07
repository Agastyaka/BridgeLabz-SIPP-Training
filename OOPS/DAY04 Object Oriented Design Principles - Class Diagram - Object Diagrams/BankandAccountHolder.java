class Account {
    double balance;

    public Account(double initialDeposit) {
        balance = initialDeposit;
    }
}

class Customer {
    String name;
    Account account;

    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.account = new Account(initialDeposit);
    }

    public void viewBalance() {
        System.out.println(name + "Account Balance:" + account.balance);
    }
}


class Bank {
    String bankName;
    Customer customer; 

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(String customerName, double initialDeposit) {
        customer = new Customer(customerName, initialDeposit);
        System.out.println("Account for " + customerName + " of " + bankName);
    }
}


public class BankandAccountHolder  {
    public static void main(String[] args) {
        Bank Bank1 = new Bank("Bank");
        
        Bank1.openAccount("Agastya", 5000);  

       
        Bank1.customer.viewBalance();
    }
}

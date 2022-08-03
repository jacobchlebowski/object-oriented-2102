import java.util.LinkedList;

class Customer {
    private String name;
    private int password;
    private LinkedList<Account> accounts;

    public boolean checkName(String name) {
        return this.name == name;
    }

    public boolean checkPassword(int pwd) {
        return this.password == pwd;
    }
}

class Account {
    private int number;
    private Customer owner;
    private double balance;

    public boolean checkNumber(int acctNum) {
        return this.number == acctNum;
    }

    //Getter
    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amt) {
        this.balance = this.balance - amt;
    }
}

class CheckingAccount extends Account {

    //Overriding
    public boolean checkNumber(int acctNum) {
        return super.checkNumber(acctNum);
    }
}

class BankingService {
    private IAcctDataStructure accounts;
    private LinkedList<Customer> customers;

    
    double getBalance(int forAcctNum) {
       Account acct = accounts.findByNumber(forAcctNum);
       if (!acct.equals(null))
           return acct.getBalance();
       return 0;
    }

    double withdraw(int forAcctNum, double amt) {
        Account acct = accounts.findByNumber(forAcctNum);
        if (!acct.equals(null)) {
            acct.withdraw(amt);
            return amt;
        }
        return 0;
    }
    
    
    
    //cust interface

    String login(String custname, int withPwd) {
        for (Customer cust:customers) {
            if (cust.checkName(custname)) {
                if (cust.checkPassword(withPwd))
                    return "Welcome";
                else
                    return "Try Again";
            }}
        return "Oops -- don't know this customer";
    }

}
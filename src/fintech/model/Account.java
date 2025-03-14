package fintech.model;
/**
 * @author 12S23017_Andrey Jonathan
 * @author 12S23050_Yolanda Saragih
 */
public class Account {
    private String accountName;
    private String owner;
    private double balance;

    public Account() {
        this.accountName = "";
        this.owner = "";
        this.balance = 0.0;
    }

    public Account(String accountName, String owner) {
        this.accountName = accountName;
        this.owner = owner;
        this.balance = 0.0;
    }

    public String toString() {
        return accountName + "|" + owner + "|" + balance;
    }


    public String getAccountName() {
        return accountName;
    }

    public void addSaldo(double amount) {
        this.balance += amount;
    }


    public double balance() {
        return balance;
    }

}
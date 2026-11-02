
public class BankAccount {

    //instance variables
    private int accountNumber;
    private double balance;

    //static variable
    private static int totalAccounts = 0;

    //constructor
    public BankAccount(double balance) {
        totalAccounts++;
        accountNumber = totalAccounts;
        this.balance = balance;
    }

    //deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    //withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }

    //get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    //get balance
    public double getBalance() {
        return balance;
    }

    //static method
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber()
                + " balance: " + account1.getBalance());

        System.out.println("Account " + account2.getAccountNumber()
                + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: "
                + BankAccount.getTotalAccounts());
    }
}

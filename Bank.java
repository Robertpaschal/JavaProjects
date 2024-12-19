class BankAccount {
    private int accountNumber;
    private int balance;

    // Constructor
    public BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Methods
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to account: " + accountNumber);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal from account: " + accountNumber);
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account: " + accountNumber);
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Current Balance: " + balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount mine = new BankAccount(123456789, 1000000);
        mine.deposit(2000);
        mine.withdraw(1000);
        mine.withdraw(2000000);
        mine.displayBalance();
    }
}

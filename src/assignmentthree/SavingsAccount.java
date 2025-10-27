package assignmentthree;

public class SavingsAccount extends Account {
    private double interestRate = 0.03;

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        balance += balance * interestRate;
        System.out.println("Deposited ₹" + amount + " with interest. New Balance: ₹" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
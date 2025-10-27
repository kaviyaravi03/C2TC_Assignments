package assignmentthree;

public final class Transaction {
    private final double transactionFee = 10.0;

    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("\n--- Transaction Start ---");
        switch (type.toLowerCase()) {
            case "deposit":
                account.deposit(amount);
                break;
            case "withdraw":
                account.withdraw(amount);
                break;
            default:
                System.out.println("Invalid transaction type!");
                return;
        }
        System.out.println("Transaction fee of ₹" + transactionFee + " applied.");
        account.withdraw(transactionFee);
        System.out.println("--- Transaction Completed ---\n");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Devi", 5000);
        CheckingAccount ca = new CheckingAccount("Priya", 2000);

        Transaction txn = new Transaction();

        txn.performTransaction(sa, "deposit", 2000);
        txn.performTransaction(ca, "withdraw", 1000);

        System.out.println("----- Account Summary -----");
        sa.displayAccountInfo();
        ca.displayAccountInfo();

        System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());
    }
}
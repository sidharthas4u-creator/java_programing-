class BankTransaction extends Thread {
    private String transactionId;
    private String accountHolder;
    private double amount;

    public BankTransaction(String transactionId, String accountHolder, double amount) {
        this.transactionId = transactionId;
        this.accountHolder = accountHolder;
        this.amount = amount;

        // Assign thread priority based on transaction value (threshold: ₹50,000)
        if (amount >= 50000) {
            this.setPriority(Thread.MAX_PRIORITY); // Priority 10
        } else {
            this.setPriority(Thread.MIN_PRIORITY); // Priority 1
        }
    }

    @Override
    public void run() {
        String type = (getPriority() == Thread.MAX_PRIORITY) ? "HIGH-VALUE" : "LOW-VALUE";
        System.out.println("[" + type + " | Priority: " + getPriority() + "] Processing "
                + transactionId + " for " + accountHolder + " (₹" + amount + ")...");

        try {
            // Simulate transaction processing time
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Transaction " + transactionId + " interrupted.");
            Thread.currentThread().interrupt();
        }

        System.out.println("[" + type + " | Priority: " + getPriority() + "] Completed "
                + transactionId + " (₹" + amount + ")");
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {
        // Create low-value and high-value transactions
        BankTransaction t1 = new BankTransaction("TXN101", "Aarav", 1500.00);
        BankTransaction t2 = new BankTransaction("TXN102", "Diya", 125000.00);
        BankTransaction t3 = new BankTransaction("TXN103", "Rohan", 800.00);
        BankTransaction t4 = new BankTransaction("TXN104", "Meera", 75000.00);

        System.out.println("--- Starting Bank Transactions ---\n");

        // Start all transaction threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

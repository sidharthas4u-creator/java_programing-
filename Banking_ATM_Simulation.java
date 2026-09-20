import java.util.Scanner;

public class Banking_ATM_Simulation {
    public static void main(String[] args) {
        System.out.print("Enter the Account detail(Acc No,Name):");
        Scanner sc =new Scanner(System.in);
        String detail= sc.nextLine();
        String[] detaillist=detail.split(",");
        Account account=new Account(detaillist[0],detaillist[1],0.00);
        System.out.print("How many task do you want to do:");
        if (sc.hasNextInt()) {
            int numberOfloop = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < numberOfloop; i++) {
                System.out.println("Want task do you want to do(deposit,withdraw,getBalance)");
                String task = sc.next();
                if (task.equalsIgnoreCase("deposit")) {
                    System.out.print("Enter the amount:");
                    double amount = sc.nextDouble();
                    account.deposit(amount);
                } else if (task.equalsIgnoreCase("withdraw")) {
                    System.out.print("Enter the amount:");
                    double amount = sc.nextDouble();
                    account.withdraw(amount);
                } else if (task.equalsIgnoreCase("getBalance")) {
                    account.getBalance();
                }
            }
        }
    }
}
class Account
{
    private String accNo, holderName;
    private double balance;

    public Account(String accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        balance+=amount;
        System.out.println("Deposit: "+balance);
    }
    public void withdraw(double amount)
    {
        if(amount<=balance&& amount>0)
        {
            balance-=amount;
        }
        else if (amount>balance)
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void getBalance() {
        System.out.println("Balance: "+balance);
    }
}


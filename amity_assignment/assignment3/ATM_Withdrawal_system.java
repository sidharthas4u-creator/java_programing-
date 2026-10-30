import java.util.InputMismatchException;
import java.util.Scanner;

class ATM
{
    private double balance;
    public void display()
    {
        System.out.println("Balance:"+balance);
    }
    public void input_fun()
    {
        deposite();
        boolean a=true;
        while (a) {
            System.out.println("Enter you choice from option\n1.deposite\n2.withdraw\n3.exit");
            Scanner sc= new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    deposite();
                    display();
                    break;
                case 2:
                    System.out.print("Enter the amount: ");
                    double amount=sc.nextDouble();
                    withdraw(amount);
                    display();
                    break;
                case 3:
                    display();
                    a=false;
                    System.out.println("Transaction close");
                    break;
                default:
                    System.out.println("Check you input");
            }
        }
    }
    public void deposite()
    { try{
        System.out.print("Enter the amount: ");
        Scanner sc= new Scanner(System.in);
        double amount=sc.nextDouble();
        if(amount>=0)
            balance+=amount;
        else
            System.out.println("Amount can't be negative");
        }
        catch (InputMismatchException e)
        {
            System.out.println("invalid Input");
        }
        finally {
        System.out.println("Deposit Complete");
        }
    }
    public void withdraw(double amount)
    {
        try {

            if (amount > balance) {
                throw new bank_execption("Insufficient balance");
            }
            else
               balance-=amount;
        }
        catch(bank_execption e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Withdraw Complete");
        }
    }
}
class bank_execption extends Exception
{
    public bank_execption(String message) {
        super(message);
    }
}
public class ATM_Withdrawal_system {
    public static void main(String[] args) {
    ATM a=new ATM();
    a.input_fun();
    }
}

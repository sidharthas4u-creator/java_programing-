import java.util.Scanner;

public class Loan_Management_System {
    public static void main(String[] args) {
        String detail;
        String[] detaillist;
        System.out.print("which loan do you want(Home,Car):");
        Scanner sc=new Scanner(System.in);
        String loan_type= sc.nextLine();
        if(loan_type.equalsIgnoreCase("Home"))
        {
            System.out.print("Enter you detail(principal,time)");
            detail=sc.nextLine();
            detaillist=detail.split(",");
            Homeloan h=new Homeloan(Integer.parseInt(detaillist[0]),Integer.parseInt(detaillist[1]));
            System.out.print(h);
        } else if (loan_type.equalsIgnoreCase("Car")) {
            System.out.print("Enter you detail(principal,time):");
            detail=sc.nextLine();
            detaillist=detail.split(",");
            Carloan c=new Carloan(Integer.parseInt(detaillist[0]),Integer.parseInt(detaillist[1]));
            System.out.print(c);
        }
    }
}
abstract class loan
{
    protected int principal, rate, time;

    public loan(int principal,int rate ,int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    abstract double calculateInteresta(int principle, int time);
}
class Homeloan extends loan
{
    public Homeloan(int principal, int time) {
        super(principal,8,time);
    }
    @Override
    double calculateInteresta(int principle,int time) {
        return (principle*rate*time)/100;
    }
    @Override
    public String toString() {
        return "Home Loan Interest :"+calculateInteresta(super.principal,super.time);
    }
}
class Carloan extends loan
{
    public Carloan(int principal, int time) {
        super(principal, 10, time);
    }
    @Override
    double calculateInteresta(int principle,int time) {
        return (principle*rate*time)/100;
    }
    @Override
    public String toString() {
        return "Car Loan Interest :"+calculateInteresta(super.principal,super.time);
    }
}


import java.util.Scanner;

public class Passport_Citizen {
    public static void main(String[] args) {
        System.out.print("Enter you Detail(Name,Date of birth,Address):");
        Scanner sc=new Scanner(System.in);
        String detail=sc.nextLine();
        String[] detaillist=detail.split(",");
        System.out.print("Enter you Passport Detail(PassportNo, IssueDate, ExpiryDate):");
        String detail1=sc.nextLine();
        String[] detaillist1=detail1.split(",");
        Passport p=new Passport(detaillist1[0],detaillist1[1],detaillist1[2]);
        Citizen c=new Citizen(detaillist[0],detaillist[1],detaillist[2],p);
        System.out.print(c);

    }
}
class Citizen
{
    private String name,dob,address;
    private Passport passport;

    public Citizen(String name, String dob, String address, Passport passport) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen: "+name +" DOB: " + dob+ " Address: " + address + passport.toString() ;
    }
}
class Passport
{
    private String passportNo,issueDate,expiryDate;

    public Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "\nPassport: "+passportNo+" Issue: "+issueDate+" Expiry: "+expiryDate;
    }
}

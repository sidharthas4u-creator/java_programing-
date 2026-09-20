import java.util.Scanner;

public class Hospital_Management {
    public static void main(String[] args) {
        System.out.print("Enter the (Name,Age,specialization,surgeryType):");
        Scanner sc=new Scanner(System.in);
        String detail=sc.nextLine();
        String[] detaillist=detail.split(",");
        Surgeon obj=new Surgeon(detaillist[0],Integer.parseInt(detaillist[1]),detaillist[2],detaillist[3]);
        System.out.print(obj);

    }
}
class Person
{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Age:" + age+"\n";
    }
}
class Doctor extends  Person{
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }



    @Override
    public String toString() {
        return super.toString()+ "Specialization: " + specialization + '\n';
    }
}
class Surgeon extends Doctor{
    private String surgeryType;

    public Surgeon(String name, int age, String specialization, String surgeryType) {
        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }
    @Override
    public String toString() {
        return super.toString()+"SurgeryType: " + surgeryType ;
    }
}

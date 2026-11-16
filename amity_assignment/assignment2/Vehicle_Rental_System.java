import java.util.Scanner;

public class Vehicle_Rental_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Vehicle Detail((Car/Bike),Registration number,Brand,Base Rate):");
        String a= sc.nextLine();
        String[] alist=a.split(",");
        call_class(alist);
    }
    public static void call_class(String[] a)
    {
        if(a[0].equalsIgnoreCase("Car"))
        {
            Car c =new Car(a[1],a[2],Integer.parseInt(a[3]));
            System.out.print(c);
        }
        else if (a[0].equalsIgnoreCase("Bike")) {
            Bike b =new Bike(a[1],a[2],Integer.parseInt(a[3]));
            System.out.print(b);
        }
    }
}
class Vehicle
{
    private String  regNo, brand;
    protected int baseRate;
    public Vehicle(String regNo, String brand, int baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    @Override
    public String toString() {
        return " " + regNo +" " + brand ;
    }
}
class Car extends Vehicle
{
    public Car(String regNo, String brand, int baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public String toString() {
        return "Car"+ super.toString()+" Rent: "+super.baseRate*1.5;
    }
}
class Bike extends Vehicle
{
    public Bike(String regNo, String brand, int baseRate) {
        super(regNo, brand, baseRate);
    }
    @Override
    public String toString() {
        return "Bike"+ super.toString()+" Rent: "+super.baseRate*1.2;
    }
}


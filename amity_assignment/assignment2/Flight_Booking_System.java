import java.util.Scanner;
public class Flight_Booking_System {
    public static void main(String[] args) {
    System.out.print("Enter flight type,number,airline,fare\n");
    Scanner sc=new Scanner(System.in);
    String detail=sc.nextLine();
    String[] Domestic=detail.split(",");
    DomesticFlight dflight=new DomesticFlight(Domestic[1],Domestic[2],Double.parseDouble(Domestic[3]));
    String detail1=sc.nextLine();
    String[] International=detail1.split(",");
    InternationalFlight inFlight=new InternationalFlight(International[1],International[2],Double.parseDouble(International[3]));
    System.out.print(dflight.toString());
    System.out.print(inFlight.toString());
    }
}
abstract class Flight
{
    private String flightNumber,airline;
    private double fare;

    public Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }
    public double getFare() {
        return fare;
    }
    abstract double calculateFare();
    @Override
    public String toString() {
        return
                "Flight No: " + flightNumber +" Airline: " + airline;
    }
}
class DomesticFlight extends Flight
{
    public DomesticFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }
    @Override
    double calculateFare() {
        double Fare;
        Fare = super.getFare() + (super.getFare() * 0.10);
        return Fare;
    }

    @Override
    public String toString() {
        return super.toString()+" Fare: "+calculateFare()+"\n";
    }
}
class InternationalFlight extends Flight
{
    public InternationalFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    double calculateFare() {
        double Fare;
        Fare = super.getFare() +(super.getFare()*0.25);
        return Fare;
    }
    @Override
    public String toString() {
        return super.toString()+" Fare: "+calculateFare()+"\n";
    }
}

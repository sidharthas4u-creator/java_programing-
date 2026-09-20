import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel_Reservation_System {
    public static void main(String[] args) {
        List <Guest> guests=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Reservation detail(Reservation Id,Room Type,Number of Guest):");
        String detail= sc.nextLine();
        String[] detaillist=detail.split(",");
        Reservation r=new Reservation(detaillist[0],detaillist[1]);
        for(int i=0;i<Integer.parseInt(detaillist[2]);i++)
        {
            System.out.print("Enter the Guest detail(Name,Age,ID Proof):");
            String detail1= sc.nextLine();
            String[] detaillist1=detail1.split(",");
            Guest g=new Guest(detaillist1[0],detaillist1[2],detaillist1[1]);
            r.addGuests(g);
        }
        System.out.print(r);
    }
}
class Guest
{
    private String name,IDproof,age;

    public Guest(String name, String IDproof, String age) {
        this.name = name;
        this.IDproof = IDproof;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ',' + age + ',' + IDproof;
    }
}
class Reservation
{
private String reservationId, roomType;
private List<Guest> guests=new ArrayList<>();

    public Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
    }

    public void addGuests(Guest guests) {
        this.guests.add(guests);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Reservation ID: ").append(reservationId).append(" Room: ").append(roomType);
        sb.append("\nGuests:\n");
        for(int i=0;i<guests.size();i++)
            sb.append(guests.get(i).toString()).append("\n");
        return sb.toString();
    }
}

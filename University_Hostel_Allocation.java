import java.util.Scanner;

public class University_Hostel_Allocation {
    public static void main(String[] args) {
        System.out.print("Enter the Student Detail(name,roll,course):");
        Scanner sc=new Scanner(System.in);
        String detail=sc.nextLine();
        String[] detaillist=detail.split(",");
        System.out.print("Enter the Hostel Detail(roomNumber,block,type):");
        String detail1=sc.nextLine();
        String[] detaillist1=detail.split(",");
        Room r=new Room(detaillist1[0],detaillist1[1],detaillist1[2]);
        student s=new student(detaillist[0],detaillist[1],detaillist[2],r);
        System.out.print(s);
    }
}
class student
{
    private  String name,roll,course ;
    private Room room;

    public student(String name, String roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    public String toString()
    {
        return "Student: "+name+" "+"("+roll+")"+" "+course+"\n"+room.toString();
    }
}
class Room
{
    private String roomNumber,block,type;
    public Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room: " +roomNumber+" "+block+" "+type;
    }
}

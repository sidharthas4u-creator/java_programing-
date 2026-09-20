import java.util.Scanner;

public class Smart_Home_Devices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your input:");
        String input=sc.nextLine();
        String[] devices=input.split(",");
        for(String d: devices)
        {
            Device device=null;
            if (d.equalsIgnoreCase("Fan"))
            {
                device=new Fan();
            }
            else if (d.equalsIgnoreCase("Light")) {
                device=new Light();
            }
            if(device!=null)
            {
                System.out.print(device.turnOn()+"\n");
                System.out.print(device.turnOff()+"\n");
            }
        }
    }
}
interface Device
{
    String turnOn();
    String turnOff();
}
class Fan implements Device
{
    @Override
    public String turnOn() {
    return "Fan is now ON ";
    }

    @Override
    public String turnOff() {
    return "Fan is now OFF";
    }
}
class Light implements Device
{
    @Override
    public String turnOn() {
        return "Light is now ON ";
    }

    @Override
    public String turnOff() {
        return "Light is now OFF";
    }
}

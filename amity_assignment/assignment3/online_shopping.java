import java.util.Scanner;

public class online_shopping {
    public void placeOrder(int amount)
    {
        try {
            if (amount < 500) {
                throw new minimumamountexpection("minimum cart value must br 500");
            }
            else
                System.out.println("Order accept");
        }
        catch (minimumamountexpection e)
        {
            System.out.print(e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the cart amount:");
        Scanner sc =new Scanner(System.in);
        int i =sc.nextInt();
        online_shopping o=new online_shopping();
        o.placeOrder(i);
    }
}
class minimumamountexpection extends Exception
{
    public minimumamountexpection(String message) {
        super(message);
    }
}

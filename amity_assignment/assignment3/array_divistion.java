import java.util.InputMismatchException;
import java.util.Scanner;

public class array_divistion {
    public static void main(String[] args) {
        ArratDivisoin a=new ArratDivisoin();
        a.intput_fun();
    }
}
class ArratDivisoin
{
    private int[] arr;
    public void intput_fun()
    {
        try {
            System.out.print("Enter the length of array:");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            arr = new int[i];
            for (int j = 0; j<i; j++) {
                System.out.print("Enter the element " +(j + 1)+":");
                arr[j] = sc.nextInt();
            }
            System.out.print("Enter the index");
            int index = sc.nextInt();
            System.out.print("Enter the divisor:");
            int divisor = sc.nextInt();
            double d = arr[index] / divisor;
            System.out.println("Result:" + d);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e)
        {
            System.out.println(e.getMessage());
        }

    }
}

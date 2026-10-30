import java.util.Scanner;

public class Student_mark_entry {
    public static void main(String[] args) {
        Studentmark s=new Studentmark();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the mark:");
        int i=sc.nextInt();
        s.entermark(i);
    }
}
class Rang_of_mark extends Exception
{
    public Rang_of_mark() {
        super("Rang of Mark is 0 to 100");
    }
}
class Studentmark
{
    public void entermark(int mark){
        try {
            if(mark>100)
            {
                throw new Rang_of_mark();
            }
            else
            {
                System.out.println("Mark in range ");
            }
        }
        catch (Rang_of_mark e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("thank you for using the system");
        }
    }
}

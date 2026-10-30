import java.util.Scanner;

public class university_login_system {
    public static void main(String[] args) {
        System.out.print("Enter the user name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        universitylogin l=new universitylogin();
        l.login(name);
        sc.close();
    }
}
class universitylogin
{
    public void login(String username)
    {
        try{
            if (username == null|| username.trim().isEmpty())
                throw new null_error("User Name cannot be null");
        }
        catch (null_error e)
        {
            System.out.println(e.getMessage());
        }
    }
    class null_error extends Exception
    {
        public null_error(String message) {
            super(message);
        }
    }
}

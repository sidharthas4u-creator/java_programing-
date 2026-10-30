import java.util.Scanner;
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Student
{
public void registerStudent(int age)
{
    try{
    if(age<18) {
        throw new InvalidAgeException("Age must be above 17 for registration");
    }
    else{
    System.out.println("Student is eligible");
    }
}
    catch (InvalidAgeException e) {
        System.out.println(e.getMessage());
    }

}
}
public class student_Age_validation {
    public static void main(String[] args) {
        System.out.print("Enter the age:");
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        int age=sc.nextInt();
        s.registerStudent(age);
        sc.close();
    }
}

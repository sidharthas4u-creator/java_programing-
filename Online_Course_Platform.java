import java.util.Scanner;

public class Online_Course_Platform {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the course:");
        String courseLine=sc.nextLine();
        String[] courselist=courseLine.split(",");
        Course course=new Course(courselist[0],courselist[1]);
        System.out.print("Enter the Student detail(Name,Course):");
        courseLine=sc.nextLine();
        courselist=courseLine.split(",");
        Student student1=new Student(courselist[0],course);
        System.out.print("Enter the Student detail(Name,Course):");
        courseLine=sc.nextLine();
        courselist=courseLine.split(",");
        PremiumStudent student2=new PremiumStudent(courselist[0],course,courselist[2]);
        System.out.print(student1+"\n");
        System.out.print(student2);
    }
}
class Course
{
    protected String courseName,duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    @Override
    public String toString() {
        return courseName+" ("+duration+")";
    }
}
class Student
{
    protected String name;
    protected Course enrolledCoure;
    public Student(String name, Course enrolledCoure) {
        this.name = name;
        this.enrolledCoure = enrolledCoure;
    }
    @Override
    public String toString() {
        return "Student: "+name+" Course: "+enrolledCoure;
    }
}
class PremiumStudent extends Student
{
protected String discount;
    public PremiumStudent(String name, Course enrolledCoure, String discount) {
        super(name, enrolledCoure);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Premium "+super.toString()+" Discount:"+discount;
    }
}

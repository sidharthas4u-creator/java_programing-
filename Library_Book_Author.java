import java.util.Scanner;

public class Library_Book_Author {

    public static void main(String[] args) {
        System.out.print("Enter the Book Detail(Book name,Price,Author name,Author email,Author genter(M,F)):");
        Scanner sc=new Scanner(System.in);
        String detail= sc.nextLine();
        String[] detaillist=detail.split(",");
        Book obj=new Book(detaillist[2],detaillist[3],detaillist[4],detaillist[0],Integer.parseInt(detaillist[1]));
        System.out.print(obj);
    }}
class Author
{
    private String name,email,gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author: " + name+" ("+gender+")"+", Email:" + email;
    }
}
class Book extends Author
{
    private String title;
    private int price;
    public Book(String name, String email, String gender, String title, int price) {
        super(name, email, gender);
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: "+title+"\nPrice: "+price+"\n"+super.toString();
    }
}

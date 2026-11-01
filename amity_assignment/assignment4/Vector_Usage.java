import java.util.Vector;

public class Vector_Usage{
    public static void main(String[] args) {
        Vector<Integer> number=new Vector<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.remove(2);
        System.out.println("Updated Vector:"+number);
    }
}

import java.util.HashSet;
public class HashSet_Demonstration{
    public static void main(String[] args) {
        HashSet<Integer> number=new HashSet<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(20);
        number.add(40);
        number.remove(2);
        System.out.println("HashSet:"+number);
    }
}

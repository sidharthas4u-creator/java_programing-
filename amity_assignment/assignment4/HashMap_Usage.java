import java.util.HashMap;

public class HashMap_Usage{
    public static void main(String[] args) {
        HashMap<String,Integer> Student_detail=new HashMap<>();
        Student_detail.put("John",85);
        Student_detail.put("Alice",90);
        Student_detail.put("Bob",78);
        System.out.println("Marks for Alice:"+Student_detail.get("Alice"));
    }
}

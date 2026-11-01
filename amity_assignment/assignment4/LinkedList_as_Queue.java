import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_as_Queue{
    public static void main(String[] args) {
        Queue<Integer> number=new LinkedList<>();
        number.offer(1);
        number.offer(2);
        number.offer(3);
        number.offer(4);
        number.offer(5);
        System.out.println("Queue after enqueue:"+number);
        number.poll();
        System.out.println("After dequeue:"+number);
    }
}

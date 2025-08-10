package QUEUE_DEQUE;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_EX {
    public static void main(String[] args) {
        Queue<String> danh_sach_sv = new LinkedList<String>();
        danh_sach_sv.offer("Nguyen Van A");
        danh_sach_sv.offer("Nguyen Van B");
        danh_sach_sv.offer("Nguyen Van C");

        while (true) {
            String ten = danh_sach_sv.poll();
            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}

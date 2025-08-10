package QUEUE_DEQUE;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriortityQueue {
    public static void main(String[] args) {
        Queue<String> danh_sach_sv = new PriorityQueue<String>();
        danh_sach_sv.offer("Nguyen Van B");
        danh_sach_sv.offer("Nguyen Van A");
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

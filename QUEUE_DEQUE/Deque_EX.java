package QUEUE_DEQUE;
import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_EX{
    public static void main(String[] args) {
        Deque<String> danh_sach_sv = new ArrayDeque<String>();

        danh_sach_sv.offer("Nguyen Van A");
        danh_sach_sv.offer("Nguyen Van B");
        danh_sach_sv.offer("Nguyen Van C");
        danh_sach_sv.offerFirst("Nguyen Van D");
        danh_sach_sv.offerLast("Nguyen Van E");

        while (true){
            String name = danh_sach_sv.poll();
            if  (name == null) {
                break;
            }
            System.out.println(name);
        }

    }
}
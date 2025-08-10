package JavaLoop;
import java.util.Scanner;
public class VongLapDoWhile {
    public static void main(String[] args) {
        // Khai báo biến
        int n;
        // Nhâp biến
        Scanner sc = new Scanner(System.in);
        // Vòng lặp do while
        do{
            System.out.println("Nhap vao so bat ki khac 0:");
            n = sc.nextInt();
        } while (n <= 0);
        // Kết thúc nhập
        sc.close();
    }
}

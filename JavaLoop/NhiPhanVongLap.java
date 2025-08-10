package JavaLoop;
import java.util.Scanner;
public class NhiPhanVongLap {
    public static void main(String[] args) {
        // Khai báo biến
        int n;
        // Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nguyen n:");
        n = sc.nextInt();
        // Chuyển đổi số nhị phân
        String nhiPhan = "";
        while (n > 0){
            nhiPhan = (n % 2) + nhiPhan; // chia lấy dưdư
            n /= 2; //chia để làm cho tới điều kiện dừng
        }
        System.out.println("So nhi phan la: "+nhiPhan);
        sc.close();
    }
}

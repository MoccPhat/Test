
import java.util.Scanner;


public class BaiTapChanLe {
    public static void main(String[] args) {
        // khai báo
        int n;
        // Nhập dữ liệu
        System.out.println("Nhap so nguyen n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Xử lý
        if(n % 2 == 0) {
            System.out.println(n+" Chan ");
        } else System.out.println(n+" Le ");
       // Kết thúc nhập
        sc.close();
    }
}

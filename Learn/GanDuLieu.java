package Learn;
import java.util.Scanner;
public class GanDuLieu {
    public static void  main (String[] args){
        // Khai báo biến
        int a, b;
        // Nhập biến
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a: ");
        a = sc.nextInt();
        System.out.println("Nhap gia tri b: ");
        b = sc.nextInt();
        // Phép gán
        a += 3;
        System.out.println("Gia tri a + 3 = "+a);
        a += b;
        System.out.println("Gia tri a + b = "+a);
        a *= b;
        System.out.println("Gia tri a * b = "+a);
        a /= b;
        System.out.println("Gia tri a / b = "+a);
        a %= b;
        System.out.println("Gia tri a % b = "+a);
        sc.close();
    }
}

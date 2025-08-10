package Learn;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        // Khai báo biến 
        int n;
        // Nhập biến
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n(0 - 8): ");
        n = sc.nextInt();
        // Kiểm tra n
        switch (n) {
            case 2: 
                System.out.println("thu 2");
                break;
            case 3: 
                System.out.println("thu 3");
                break;
            case 4: 
                System.out.println("Thu 4");
                break;
            case 5: 
                System.out.println("Thu  5");
                break;
            case 6: 
                System.out.println("Thu 6");
                break;
            case 7: 
                System.out.println("Thu 7");
                break;
            case 8: 
                System.out.println("Chu nhat");
                break;
            default:
            System.out.println("Nhap du lieu sai!"); 
            break;
        }
        // Kết thúc nhập
        sc.close();
    }
}

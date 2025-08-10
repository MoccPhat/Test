package Learn;
import java.util.Scanner;
public class MathVaHamToanHoc {
    public static void main (String[] args){
        // khai báo biến
        double a, b;
        // Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap so b: ");
        b = sc.nextDouble();
        // Hàm toán học
        System.out.println("|a| = " +Math.abs(a)); // trị tuyệt đối
        System.out.println("Gia tri min(a,b): "+ Math.min(a,b)); // tìm min
        System.out.println("Gia tri max(a,b): "+ Math.max(a,b)); // tìm max
        System.out.println("Gia tri nguyen lon gan bang nhat: "+ Math.ceil(a)); // làm tròn số thập phân với số lớn gần bằng nhất
        System.out.println("Gia tri nguyen nhon gan bang nhat: "+ Math.floor(a)); // làm tròn số thập phân với số nhỏ gần bằng nhất
        System.out.println("sqrt(2): "+Math.sqrt(a)); // căn bậc 2 lên
        System.out.println("luy thua(a,b): "+Math.pow(a, b));
        sc.close();
    }
}

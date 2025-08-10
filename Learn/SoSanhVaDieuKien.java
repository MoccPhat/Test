package Learn;
import java.util.Scanner;

public class SoSanhVaDieuKien {
    public static void main (String[] agrrs){
        // Khai báo biến
        int a,b;
        // Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a: ");
        a = sc.nextInt();
        System.out.println("Nhap gia tri b: ");
        b = sc.nextInt();
        // so sánh và điều kiện cách 11
        if(a == b){
            System.out.println("Gia tri a, b bang nhau");
        } else {
            System.out.println("Gia tri a, b khong bang nhau");
        } 
        if (a > b){
            System.out.println("Gia tri a lon hon b");
        } else System.out.println(("Gia tri a nho hon b"));
        if (a == 8 || b == 8){
            System.out.println("Dung");
        } else System.out.println("Sai");
        if (a == 10 && b == 10){
            System.out.println("Dung");
        } else System.out.println("Sai");
        // so sánh và điều kiện cách 2 kiểm tra bằng true false
        System.out.println("------------------------------------");
        System.out.println(a+ " va " + b + " bang nhau? "+ (a == b));
        System.out.println(a+ " va " + b + " khong bang nhau ? "+(a != b));
        System.out.println(a+" lon hon " + b + " ? "+ (a>b));
        System.out.println(b+" lon " + a + " ? "+ (a<b));
        System.out.println("co 2 so chan? " +(a % 2 == 0 && b % 2 == 0));
        System.out.println("co 2 so chan? "+(a % 2 == 0 || b % 2 == 0));
        sc.close();
    }
}

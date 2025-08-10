import java.util.Scanner;


public class BaiTapHinhTron {
    public static void main (String[] agrs){
        // khai báo biến
        double R, A, C;
        // Nhập dữ liệu từ phím
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap vao ban kinh R:");
        R = sc.nextDouble();
        // Tính chu vi hinh tròn
        C = 2 * Math.PI * R;
        System.out.println("Chu vi hinh tron: "+C);
        System.out.println("Chu vi hinh tron: "+Math.round(C)); // Dùng round để làm tròn 
        // Tính diện tích hình tròn 
        A = Math.PI * Math.pow(R,2);
        System.out.println("Dien tich hinh tron la: "+A);
        System.out.println("Dien tich hinh tron la: "+Math.round(A)); // Dùng round để làm tròn 
        sc.close();
    }
}

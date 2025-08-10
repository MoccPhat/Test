import java.util.Scanner;

public class DienTichHinhTron {
    public static void main(String[] args) {
        double r;
        System.out.println("Nhap vao ban kinh: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        System.out.println("Dien tich ban kinh(S) = " + Math.PI * Math.pow(r, 2));
        sc.close();
    }
}
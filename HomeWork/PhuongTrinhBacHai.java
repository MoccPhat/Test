import java.util.Scanner;


public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        // Khai báo biến
        double a,b,c,delta;
        // Nhập dữ liệu
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.out.println("Nhap c: ");
        c = sc.nextDouble();
        // Tính toán
        if (a == 0){
                System.out.println("Day khong phai phuong trinh bac 2!");
            } else {
                 delta = (Math.pow(b,2)) - (4 * a * c);
                System.out.println("Delta = "+delta);
        if(delta > 0){
            double ValueX1 = (-b + Math.sqrt(delta)) / (2 * a);
            double ValueX2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co nghiem phan biet: ");
            System.out.println("X1 = "+ValueX1);
            System.out.println("X2 = "+ValueX2);
            } else if (delta == 0){
            double x = -b / (2 * a);
             System.out.println("Phuong trinh co nghiem kep:");
             System.out.println("x = "+x);
            } else {
            System.out.println("Phuong trinh vo nghiem!");
            }
        }
        // Kết thúc nhập
        sc.close();
    }
}

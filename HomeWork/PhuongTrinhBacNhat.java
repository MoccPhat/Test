import java.util.Scanner;



public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        // khai báo
        double a,b;
        // nhập dữ liệu
        System.out.println("Nhap a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println("Nhap b:");
        b = sc.nextDouble();
        // tính toán
        if (a != 0){
            double x = -(double)b/a;
            System.out.println("Phuong trinh co nghiem: " +x);
            if (a == 0 && b == 0){
                System.out.println("Phuong trinh co vo so nghiem!");
            }
        } else System.out.println("Phuong trinh vo nghiem!");
        // kết thúc nhập
        sc.close();
    }
}

import java.util.Scanner;

public class TinhTongTrongKhoangChoTruoc {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Nhap vao 2 nguyen bat ki");
        int soNguyen1, soNguyen2;
        Scanner sc = new Scanner(System.in);
        System.out.print("So nguyen 1: ");
        soNguyen1 = sc.nextInt();
        System.out.print("So nguyen 2: ");
        soNguyen2 = sc.nextInt();
        System.out.print("Tong 2 so nguyen bat ki la: ");
        for (int i = soNguyen1; i <= soNguyen2; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
        System.out.println("\nDap an = " + sum);
        sc.close();
    }
}

import java.util.Scanner;

public class TinhTongN {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.print("Nhap vao so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Tong tu 1 den n: ");
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
        System.out.println("\nDap an = " + sum);
        sc.close();
    }
}

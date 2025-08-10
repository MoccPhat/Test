package BT_binarySearch;
import java.util.Arrays;
import java.util.Scanner;

public class Bai_tap_binarySearch {
    public static void main(String[] args) {
        // Nhập kích thước phần tử
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        System.out.println("---------------------------------");
        System.out.println("Nhap so nguyen n bang " + n + " phan tu");
        System.out.println("---------------------------------");

        // Nhập một mảng số nguyên từ bàn phím.
        System.out.println("Nhap vao so nguyen n: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            mang[i] = sc.nextInt();
        }
        System.out.println("---------------------------------");

        // Sắp xếp mảng theo thứ tự tăng dần.
        Arrays.sort(mang);
        for (int a : mang) {
            System.out.print(a + " ");
        }
        System.out.println("\n---------------------------------");

        // Nhập một số nguyên cần tìm.
        System.out.print("\nNhap vao so x can tim: ");
        int x = sc.nextInt();
        System.out.println("---------------------------------");
        // Sử dụng Arrays.binarySearch() để tìm số đó trong mảng.
        int index = Arrays.binarySearch(mang, x);
        if (index >= 0) {
            System.out.println("So " + x + " can tim nam o vi tri so " + Arrays.binarySearch(mang, x) + " trong mang");
        } else {
            System.out.println("Khong tim thay!");
        }

        sc.close();
    }
}

package Learn;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        double [] mang1; // cách 1
        double mang2[]; // cách 2
        
        mang1 = new double[10]; // cách 1 
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i < mang1.length;i++){
            System.out.println("Nhap phan tu thu "+i+ " : ");
            mang1[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < mang1.length;i++) {
            sum += mang1[i];
        }
        System.out.println("tong = "+sum);
        System.out.println("Mang 2:");
        mang2 = new double [] {1,2,3,4,5}; // cách 22
        for(int i = 0; i < mang2.length;i++){
            System.out.println(mang2[i]);
        }
        sc.close();
    }
}

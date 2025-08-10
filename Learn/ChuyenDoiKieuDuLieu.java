package Learn;
import java.util.Scanner;

public class ChuyenDoiKieuDuLieu {
    public static void main(String[] agrs){
        // nhập dữ liệu từ phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a: ");
        int a = sc.nextInt();
        System.out.println("Nhap gia tri b: ");
        int b = sc.nextInt();
        // Xuất dữ liệu
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        // Ép kiểu ngầm định 
        float c = a; float d = b;
        System.out.println("c = "+c);
        System.out.println("b = "+d);
        // Ép kiểu tường minh
        float e = 3.5f; float f = 9.5f;
        System.out.println("e = "+e);
        System.out.println("f = "+f);
        int g = (int)e; int h = (int)f;
        System.out.println("g = "+g);
        System.out.println("h = "+h); 
        // Ép kiểu giữa biến nguyên thủy và đối tượng
        int x = Integer.valueOf(32);
        System.out.println("x = "+x);
        sc.close();
    }
}

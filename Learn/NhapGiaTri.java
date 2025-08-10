package Learn;
import java.util.Scanner;

/**
 * nextBoolean(): đọc giá trị boolean từ bàn phím
 * nextByte(): đọc giá trị byte từ bàn phím
 * nextDouble(): đọc giá trị double từ bàn phím
 * nextFloat(): đọc giá trị float từ bàn phím
 * nextInt(): đọc giá trị int từ bàn phím
 * nextLine(): đọc giá trị line từ bàn phím
 * nextLong(): đọc giá trị long từ bàn phím
 * nextShort(): đọc giá trị short từ bàn phím
 */
public class NhapGiaTri {
    public static void main(String[] agrs){
        // Nhập thông tin
        Scanner scan = new Scanner(System.in); // Nhập thông tin từ bàn phím
        System.out.println("Nhap vao ho va ten: ");
        String hoVaTen = scan.nextLine(); // nextLine nhập chuỗi từ phím
        System.out.println("Nhap ma sinh vien: "); // mã sinh viên trường sốố
        long maSinhVien = scan.nextLong();
        System.out.println("Nhap vao diem thi: "); // điểm số thập phân
        float diemThi = scan.nextFloat();
        // xuất thông tin
        System.out.println("-----------");
        System.out.println("Ho va ten:: "+hoVaTen);
        System.out.println("Ma sinh vien: "+maSinhVien);
        System.out.println("Diem thi: "+diemThi);
        scan.close();
    }
}

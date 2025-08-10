package Learn;
import java.util.Scanner;

public class ToanTu {
    public static void main (String[] args){
        // Nhập giá trị
        Scanner n = new Scanner(System.in);
        System.out.println("Nhap gia tri a: ");
        int ValueA = n.nextInt();
        System.out.println("Nhap gia tri b: ");
        int ValueB = n.nextInt();
        // Tính toán
        int Tong = ValueA + ValueB;
        int Hieu = ValueA - ValueB;
        int Tich = ValueA * ValueB;
        float Thuong = (float)ValueA / ValueB;
        float ThuongDu = ValueA % ValueB;
        // Xuất giá trị
        System.out.println(ValueA+ " + " + ValueB + " = " +Tong);
        System.out.println(ValueA+ " - " + ValueB + " = " +Hieu);
        System.out.println(ValueA+ " * " + ValueB + " = " +Tich);
        System.out.println(ValueA+ " % " + ValueB + " = " +Thuong);
        System.out.println(ValueA+ " % " + ValueB + " = " +ThuongDu);
        // Đóng scanner
        n.close();
    }
}

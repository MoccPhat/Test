import java.util.Scanner;


public class KiemTraSoNgay {
    public static void main(String[] args) {
        // Khai báo biến
        int day, month, year;
        // Nhap dữ liệu
        Scanner sc = new Scanner (System.in);
        // Kiem tra ngay 
        System.out.println ("Nhap vao so ngay");
        day = sc.nextInt();
        System.out.println("Nhap vao so thang: ");
        month = sc.nextInt();
        System.out.println("Nhap vao so nam: ");
        year = sc.nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println(day+" thang " +month+ " nam " +year+ " co 31 ngay"); 
            break;
            case 4: case 6: case 9: case 11:
            System.out.println(day+ " thang " +month+ " nam " +year+ "co 30 ngay");
            break;
            case 2:
            month = (year % 4 == 0 && year != 100) || (year % 400 == 0)?29:28;
            System.out.println(day+ " thang 2 nam " +year+ " co " +month+ " ngay"); // 29 là năm nhuận - 28 không phải là năm nhuận
            break;
            default:
            System.out.println("Nhap sai so ngay!"); break;
        }
        // Kết thúc nhập
        sc.close();
    }
}

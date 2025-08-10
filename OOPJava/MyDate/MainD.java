package OOPJava.MyDate;
import java.sql.Date;
import java.util.Scanner;

public class MainD {
    public static void main (String[] args){
        int d, m , y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ngay thang nam: ");
        d = sc.nextInt();
        m = sc.nextInt();
        y = sc.nextInt(); 

        Date date = new Date (d , m , y);
        System.out.println("Ngay thang nam la: ");
        System.out.println(date);



    sc.close();
    }
}

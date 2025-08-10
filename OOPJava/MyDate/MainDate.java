package OOPJava.MyDate;
import java.util.Scanner;

public class MainDate {
    public static void main (String[] agrs){
        int d , m , y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ngay thang nam: ");
        d = sc.nextInt();
        m = sc.nextInt();
        y = sc.nextInt();

        date dtt= new date (d , m , y);
        System.out.println(dtt);
        sc.close();

        // int a = 5, b = 6;
        // System.out.println("a == b "+(a==b));
        // System.out.println("a != b "+(a!=b));
        date dt = new date (9 , 12 , 2006);
        date dt2 = new date (9 , 12 , 2006);
        date dt3 = new date (9 , 12 , 2005);
        date dt4 = new date (9 , 12 , 2007);
        System.out.println("dt == dt2 "+(dt.equals(dt2)));
        System.out.println("dt3 == dt4 "+(dt3.equals(dt4)));

        System.out.println("HashCode 1:" +(dt.hashCode()));
        System.out.println("HashCode 2: "+(dt2.hashCode()));
        System.out.println("HashCode 3: "+(dt3.hashCode()));
        System.out.println("HashCode 4: "+(dt4.hashCode()));
    }
}

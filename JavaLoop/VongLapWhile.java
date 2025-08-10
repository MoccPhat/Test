package JavaLoop;
// import java.util.Scanner;

public class VongLapWhile {
    public static void main (String[] agrs){
        // khai báo biến
        // int x = 1;
        // // Nhập dữ liệu
        // Scanner sc = new Scanner(System.in);
        
        // Vòng lặp
        // while (x != 0){
        //     System.out.println("Nhap x = 0 de thoat ");
        //     x = sc.nextInt();
        // }
        int i = 0;
        while(true){
            System.out.println(i);
            i++;
            if (i == 10) break;
        }
        // sc.close();
    }
}

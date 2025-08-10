package JavaLoop;
import java.util.Scanner;
public class VongLap {
    public static void main(String[] args) {
        // khai báo biến
        int n;
        // Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri n:");
        n = sc.nextInt();
        // Chạy vòng lặp
         System.out.println("Vong lap chay tu:");
        for(int i = 0; i < n;i++){
            System.out.println(i+" CODE");
        }
        // System.out.println("Vong lap chay tu:");
        // for(int i = n; i > 0;i--){
        //     System.out.println(i+" CODE");
        // }
        // Kết thúc nhập 
    sc.close();;
    }
}

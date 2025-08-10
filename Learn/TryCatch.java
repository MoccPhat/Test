package Learn;
import java.util.Scanner;

public class TryCatch{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = 0;
        try {
            System.out.println("Input n: ");
            n = sc.nextInt();
        } catch (Exception e){
            System.out.println("Input error!");
        } finally { 
            System.out.println("Error!"); 
        }
        System.out.println("Value n: "+n);
        System.out.println("The end the programing!");
        sc.close();
    }
}
/* Sử dụng try catch finally để bắt giữ các ngoại lệ Sử dụng khi có ngoại lệ hoặc không có ngoại lệ (có lỗi hay không có lỗi) đều xuất finally */
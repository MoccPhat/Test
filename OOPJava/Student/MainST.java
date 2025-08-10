package OOPJava.Student;
import java.util.Scanner;

public class MainST {
    public static void main (String[] agrs){
        Student st = new Student ("24638311", "MoccPhat", 18, 9.0);
        int choice = 0;
        do{
            System.out.println("-----MENU-----");
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. Xuat danh thong tin");
            System.out.println("Nhap vao lua chon cua ban: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            if (choice == 1){
                st.InputStudent();
            }
            if (choice == 2){
                st.StudentList();
            }
             sc.close();
        } while (choice != 0);
        // st.InputStudent();
       
    }
}

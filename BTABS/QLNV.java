package BTABS;
import java.util.Scanner;

public class QLNV {
    public static void main (String[] args){
        int age; 
        String name, sex, address;
        Scanner sc = new Scanner(System.in);
        System.err.println("-----Nhap nhan vien-----");
        System.err.print("Nhap vao ten: ");
        name = sc.nextLine();
        System.err.print("Nhap vao tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.err.print("Nhap vao gioi tinh: ");
        sex = sc.nextLine();
        System.err.print("Nhap vao dia chi: ");
        address = sc.nextLine();
        System.err.println("--------------------------");
        Staff st1 = new Staff(name, age, sex, address);
        FullTimeEmployee nvf1 = new FullTimeEmployee(st1, 3000000);
        nvf1.Input();
        nvf1.Output();
        System.err.println(nvf1.Salary());

        PartTimeEmployee nvp1 = new PartTimeEmployee(st1, 5, 30);
        nvp1.Input();
        nvf1.Output();
        System.err.println(nvp1.Salary());
        sc.close();
    }
}

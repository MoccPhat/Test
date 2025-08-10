package BT_binarySearch;
// import java.util.Scanner;

// import java.util.Arrays;

public class Bai_tap_split {
    public static void main(String[] args) {
        // String ten = " Toi la sinh vien truong Dai Hoc Cong Nghiep TPHCM ";
        // String[] a = ten.trim().split("\\s+");
        // System.out.println("Cac tu trong chuoi: ");
        // for(String b : a){
        // System.out.println(b);
        // }

        // String n;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhap vao chuoi");
        // n = sc.nextLine();
        // System.out.println("Chuoi da nhap la:\n"+n);
        // String[] words = n.trim().split("/");
        // System.out.println("Xuat chuoi: ");
        // for(String day: words){
        // System.out.println(day);
        // }
        // int count = words.length;
        // System.out.println(count);
        // sc.close();

        // String cvs = "An,20,HCM";
        // String[] a = cvs.trim().split(",");
        // System.out.println("Xuat Chuoi");
        // if (a.length == 3) {
        //     System.out.println("Ten: " + a[0]);
        //     System.out.println("Tuoi: " + a[1]);
        //     System.out.println("Noi o: " + a[2]);
        // } else{
        //      System.out.println("Khong hop le!");
        // }

            String doan_van = "Toi la Phat. Ban khoe khong? Hom nay dep troi!";
            String[] cau = doan_van.trim().split("[.!?]");
            System.out.println("Cac cau trong doan van: ");
            int count = 0;
            for(String dv : cau){
                if(!dv.trim().isEmpty()){
                    count++;
                    System.out.println(dv);
                }
            }
            System.out.println("So cau: "+count);
    }
}

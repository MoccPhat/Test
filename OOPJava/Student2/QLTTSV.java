package OOPJava.Student2;

public class QLTTSV {
    public static void main(String[] args) {
        NgaySinh date1 = new NgaySinh(9, 12, 2006);
        NgaySinh date2 = new NgaySinh(9, 12, 2006);
        NgaySinh date3 = new NgaySinh(9, 11, 2006);
        Class class1 = new Class("DHTH20A", "Khoa Cong Nghe Thong Tin");
        Class class2 = new Class("DHTH20B", "Khoa Cong Nghe Thong Tin");
        Student st1 = new Student(24638311, "Nguyen Van A", date1, 9.0);
        Student st2 = new Student(24638311, "Nguyen Van B", date2, 4.0);
       
        System.out.println("Ten Khoa ma sinh vien 1 dang hoc la: "+class1.getTenKhoa());
        System.out.println("Ten Khoa ma sinh vien 2 dang hoc la: "+class2.getTenKhoa());

        System.out.println("Sinh vien co co DTB >= 5: "+st1.SinhVienDau());
        System.out.println("Sinh vien co co DTB >= 5: "+st2.SinhVienDau());

        System.out.println("Sinh vien 1 va sinh vien 2 co ngay sinh giong nhau la: "+date1.equals(date2));
        System.out.println("Sinh vien 2 va sinh vien 3 co ngay sinh giong nhau la: "+date2.equals(date3));
    }
}

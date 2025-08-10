package Learn;
public class find_string {  
    public static void main(String[] args) {
        String s1 = "Xin chao co chu, xin chao cac ban, Xin chao!";
        String s2 = "Xin chao";
        String s3 = "Xin chao 123";
        char c1 = 'o';
        // indexOf (0 tim thay) (-1 khong tim thay)
        System.out.println("Vi tri cua s2 trong s1: " + s1.indexOf(s2));
        System.out.println("Vi tri cua s3 trong s1: " + s1.indexOf(s3));
        System.out.println("----------------------------------------------");

        // vi tri bat ki tro di
        System.out.println("Vi ftri cua s2 trong s1: " + s1.indexOf(s2, 2));
        System.out.println("----------------------------------------------");

        // tim kiem char
        System.out.println("Vi tri cua c1 trong s1: " + s1.indexOf(c1));
        System.out.println("Vi tri cua c1 trong s1: " + s1.indexOf(c1, 20));
        System.out.println("----------------------------------------------");

        // lastIndexOf => tim kiem tu phai sang trai
        System.out.println("Vi tri cua s2 trong s1 (tu phai sang trai): " + s1.lastIndexOf(s2));

        // ten_file = "Bai tap.excel.lop_12.xls"
    }
}
package Learn;
public class chuyen_doi_chuoi {
    public static void main(String[] args) {
        String s1 = "mOcC";
        String s2 = "pHaT";
        String s3 = s1 + s2;

        // ham concat => noi chuoi
        String s4 = s1.concat(s2);
        System.out.println("s3 = "+s3);
        System.out.println("s4 = "+s4);

        // replaceAll => thay the chuoi con thanh chuoi con khac 
        String s5 = "Phat.com";
        String s6 = s5.replaceAll("Phat", "mocc");
        System.out.println(s6);

        // toLowerCase => chuyen ve viet thuong
        // toTuperCaes => chuyen ve viet hoa
        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println("s7 = "+s7);
        System.out.println("s8 = "+s8);

        // trim => xoa khoang trang du thua o hai dau chuoi
        String s9 = " Xin chao cac ban, minh la moccphat      ";
        System.out.println(s9.trim());

        // toCharArray => chuyen chuoi thanh mang ki tu
        String s10 = "Hello";
        char [] c1 = s10.toCharArray();
        for(char c: c1){
            System.out.println(c);
        }

        // subString => cat chuoi con
        String s11 = "Xin chao cac ban, minh la moccphat";
        String s12 = s11.substring(10);
        String s13 = s11.substring(10,15);
        System.out.println(s12);
        System.out.println(s13);
    }
}

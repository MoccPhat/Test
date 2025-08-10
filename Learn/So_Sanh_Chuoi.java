package Learn;
public class So_Sanh_Chuoi {
    public static void main(String[] args) {
        String s1 = "MoccPhat";
        String s2 = "moccphat";
        String s3 = "moccphat";

        // So sanh 2 chuoi giong nhau (equals)
        System.out.println("----------------------------------------------");
        System.out.println("S1 equals S2: "+s1.equals(s2));
        System.out.println("S2 equals S3: "+s2.equals(s3));
        System.out.println("----------------------------------------------");

        // equalsIgnoreCase => so sanh khong phan biet HOA, THUONG
        System.out.println("S1 equalsIgnoreCase S2: "+s1.equalsIgnoreCase(s2));
        System.out.println("S2 equalsIgnoreCase S3: "+s2.equalsIgnoreCase(s3)); 
        System.out.println("----------------------------------------------");
        
        // compareTo => so sanh (> , <, =)
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van";
        String sv4 = "Nguyen Van A";
        System.out.println("sv1 compareTo sv2: "+sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: "+sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: "+sv1.compareTo(sv4));
        System.out.println("----------------------------------------------");

        //  compareToIgnoreCase => tuong tu ham equalsIgnoreCase
        String sv5 = "Apple";
        String sv6 = "apple";
        String sv7 = "banana";
        String sv8 = "cherry";
        System.out.println("sv5 compareToIgnoreCase sv6: "+sv5.compareToIgnoreCase(sv6));
        System.out.println("sv7 compareToignoreCaes sv8: "+sv7.compareToIgnoreCase(sv8));
        System.out.println("----------------------------------------------");

        // regionMatches => so sanh 1 doan
        String r1 = "moccphat";
        String r2 = "ccph";
        boolean check = r1.regionMatches(true,2, r2, 0,4); // them "TRUE" or "FALSE" vao truoc toffset
        System.out.println(check);                                                        // TRUE khong phan biet va FALSE phan biet
        System.out.println("----------------------------------------------");
        // startsWith => kiem tra chuoi bat dau bang 1 doan nao do
        String sdt1= "0832620308";
        System.out.println(sdt1.startsWith("083"));
        System.out.println(sdt1.startsWith("084"));
        System.out.println("----------------------------------------------");
        
        // endsWith => kiem tra chuoi ket thuc bang 
        String ten_file = "I LOVE YOU 3000";
        String ten_file2 = "HOC JAVA";
        if(ten_file.endsWith("3000")){
            System.out.println("FILE 1 la 3000");
        } else if (ten_file.endsWith("JAVA")){
            System.out.println("FILE 1 la JAVA");
        }

        if(ten_file2.endsWith("3000")){
            System.out.println("FILE 2 la 3000");
        } else if (ten_file2.endsWith("JAVA")){
            System.out.println("FILE 2 la JAVA");
        }
        System.out.println("----------------------------------------------");
        
    }
}

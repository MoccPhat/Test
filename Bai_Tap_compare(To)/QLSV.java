public class QLSV {
    public static void main(String[] args) {
        Sinh_Vien sv1 = new Sinh_Vien(24638311, "Tran Moc Tan Phat", "DTKHMT20B", 3.0);
        Sinh_Vien sv2 = new Sinh_Vien(24638312, "Nguyen Van A", "DHTH20A", 3.0);
        Sinh_Vien sv3 = new Sinh_Vien(24638313, "Nguyen Van B", "DHTH20C", 5.0);
        System.out.println("---------------------------------------------");
        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv1.compareTo(sv3));
        System.out.println("---------------------------------------------");
    }
}

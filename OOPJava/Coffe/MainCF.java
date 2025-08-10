package OOPJava.Coffe;

public class MainCF {
    public static void main (String[] agrs){
        HoaDonCaPhe hoaDon = new HoaDonCaPhe("Trung Nguyen", 100000, 5.5);
        System.out.println("Tong tien: " +hoaDon.TinhTongTien());
        System.out.println("Kiem tra khoi luong > 1kg " +hoaDon.CheckMass(1));
        System.out.println("Kiem tra khoi luong > 2kg " +hoaDon.CheckMass(2));
        System.out.println("Kiem tra tong tien > 500: "+hoaDon.checkPrice());
        System.out.println("Giam gia cua hoa don "+hoaDon.Sale(10));
        System.out.println("Sauu khi giam gia: "+hoaDon.afterSale(10));
    }
}

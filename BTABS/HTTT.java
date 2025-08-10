package BTABS;

public class HTTT {
    public static void main(String[] args){
        System.err.println("Phuong thuc thanh toan: ");
        System.err.println("----------------------------------------");
        System.err.println("CreditCard");
        CreditCard crd1 = new CreditCard("A1235G1235HAXA",  "Nguyen Van Dui","7/7/2025");
        crd1.pay(2000000);
        System.err.println("----------------------------------------");
        System.err.println("PayPal");
        PayPal p1 = new PayPal("1234-12315-13311", "Nguyen Thi My Dieu", "9/8/2025");
        p1.pay(1000000);
        System.err.println("----------------------------------------");
        System.err.println("BankTransfer");
        BankTransfer b1 = new BankTransfer("1233-612-754-12", "Nguyen thi Dau", "9/9/2025");
        b1.pay(150000);
    }
}

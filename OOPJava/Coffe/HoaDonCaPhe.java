package OOPJava.Coffe;
public class HoaDonCaPhe {
    // private String NameCoffe;   
    private double price1kg;
    private double mass;
    public HoaDonCaPhe (String name, double money, double kg) {
        // this.NameCoffe = name ;
        this.price1kg = money;
        this.mass = kg;
    }
    public double TinhTongTien(){
        return this.price1kg * this.mass;
    }
    public boolean CheckMass(double massInput){
        return this.mass > massInput;
    }
    public boolean checkPrice(){
        return this.price1kg > 500000;
    }
    public double Sale(double x){
        if (this.TinhTongTien() > 500000){
            return (x/100) * this.TinhTongTien();
        } else return 0;
    }
    public double afterSale(double x){
        return this.TinhTongTien() - this.Sale(x);
    }
}

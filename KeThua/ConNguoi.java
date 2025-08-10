package KeThua;
public class ConNguoi {
    protected String HoVaTen;
    protected int NamSinh;

    public ConNguoi(String HoVaTen, int NamSinh){
        this.HoVaTen = HoVaTen;
        this.NamSinh = NamSinh;
    }

    public String getHoVaTen(){
        return this.HoVaTen;
    }
    public void setHoVaTen(String HoVaTen){
        this.HoVaTen = HoVaTen;
    }
    public int getNamSinh(){
        return this.NamSinh;
    }
    public void setNamSinh(int NamSinh){
        this.NamSinh = NamSinh;
    }
    public void an(){
        System.out.println("An lau bo");
    }
    public  void ngu(){
        System.out.println("Toi Dang Ngu");
    }
}

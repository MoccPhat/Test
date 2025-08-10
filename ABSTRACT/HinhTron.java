package ABSTRACT;

public class HinhTron extends Hinh {
    private double r;
    
    public HinhTron(ToaDo toado, double r){
        super(toado);
        this.r = r;
    }

    public double getR(){
        return this.r;
    }
    public void setR(double r){
        this.r = r;
    }

    @Override
    public double TinhDienTich() {
        return Math.PI * Math.pow(this.r,2);
    }
    
}

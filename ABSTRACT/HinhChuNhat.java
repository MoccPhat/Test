package ABSTRACT;

public class HinhChuNhat extends Hinh {
    private double chieuRong;
    private double chieuCao;

    public HinhChuNhat(ToaDo toado, double chieuRong, double chieuCao){
        super(toado);
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
        
    }

    @Override
    public double TinhDienTich() {
        return this.chieuRong * this.chieuCao;
    }
}

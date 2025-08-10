package KeThua;

public class MayBay extends PhuongTienDiChuyen {
    private String LoaiNhienLieu;

    public MayBay (String LoaiNhienLieu, HangSanXuat hangsanxuat){
        super("May Bay", hangsanxuat);
        this.LoaiNhienLieu = LoaiNhienLieu;
    }

    public String getLoaiNhienLieu(){
        return this.LoaiNhienLieu;
    }
    public void setLoaiNhienLieu(String LoaiNhienLieu){
        this.LoaiNhienLieu = LoaiNhienLieu;
    }
    
    public void CatCanh(){
        System.out.println("Tren duong bang");
    }
    public void HaCanh(){
        System.out.println("Bai dap tren Duong Bang");
    } 
    @Override
    public double LayVanToc(){
        return 500;
    }
}

package KeThua;
public class XeOto extends PhuongTienDiChuyen {
    private String LoaiNhienLieu;

    public XeOto (String LoaiNhienLieu, HangSanXuat hangsanxuat){
        super("Oto", hangsanxuat);
        this.LoaiNhienLieu = LoaiNhienLieu;
    }

    public String getLoaiNhienLieu(){
        return this.LoaiNhienLieu;
    }
    public void setLoaiNhienLieu(String LoaiNhienLieu){
        this.LoaiNhienLieu = LoaiNhienLieu;
    }
    @Override
    public double LayVanToc(){
        return 100;
    }
}

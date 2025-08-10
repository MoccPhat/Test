package KeThua;
public abstract class PhuongTienDiChuyen {
    protected String LoaiPhuongTien;
    protected HangSanXuat hangsanxuat;

    public PhuongTienDiChuyen(String LoaiPhuongTien, HangSanXuat hangsanxuat){
        this.LoaiPhuongTien = LoaiPhuongTien;
        this.hangsanxuat = hangsanxuat;
    }
    
    public String getLoaiPhuongTien(){
        return this.LoaiPhuongTien;
    }
    public void setLoaiPhuongTien(String LoaiPhuongTien){
        this.LoaiPhuongTien = LoaiPhuongTien;
    }
    public HangSanXuat getHangsanxuat(){
        return this.hangsanxuat;
    }
    public void setHangsanxuat(HangSanXuat hangsanxuat){
        this.hangsanxuat = hangsanxuat;
    }

    public String LayTenHangSanXuat(){
        return this.hangsanxuat.getTenHangSanXuat();
    }
    public void BatDau(){
        System.out.println("Bat Dau: --------------");
    }
    public void TangToc(){
        System.out.println("Tang Toc: ----------------");
    }
    public void DungLai(){
        System.out.println("Dung Lai: --------------------");
    }
    public abstract double LayVanToc();
}

package KeThua;
public class HangSanXuat {
    private String TenHangSanXuat;
    private String TenQuocGia;

    public HangSanXuat (String TenHangSanXuat, String TenQuocGia){
        this.TenHangSanXuat = TenHangSanXuat;   
        this.TenQuocGia = TenQuocGia;
    }

    public String getTenHangSanXuat(){
        return this.TenHangSanXuat;
    }
    public void setTenHangSanXuat(String TenHangSanXuat){
        this.TenHangSanXuat = TenHangSanXuat;
    }
    public String getTenQuocGia(){
        return this.TenQuocGia;
    }
    public void setTenQuocGia(String TenQuocGia){
        this.TenQuocGia = TenQuocGia;
    }
}

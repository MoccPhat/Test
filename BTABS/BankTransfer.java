package BTABS;
public class BankTransfer extends PaymentMethod {
     private String SoThe;
    private String TenChuThe;
    private String ngayHetHan;

    public BankTransfer (String SoThe, String TenChuThe, String ngayHetHan){
        this.SoThe = SoThe;
        this.TenChuThe = TenChuThe;
        this.ngayHetHan = ngayHetHan;
    }

    public String getSoThe(){
        return this.SoThe;
    }
    public void setSoThe(String SoThe){
            this.SoThe = SoThe;
    }
    public String getTenChuThe(){
        return this.TenChuThe;
    }
    public void setTenChuThe(String TenChuThe){
        this.TenChuThe = TenChuThe;
    }
    public String getNgayHetHan(){
        return this.ngayHetHan;
    }
    public void setNgayHetHan(String ngayHetHan){
        this.ngayHetHan = ngayHetHan;
    }

    public void pay(float amount){
        System.err.println("So tien: "+amount+" Thanh toan bang BankTransfer");
    }
}

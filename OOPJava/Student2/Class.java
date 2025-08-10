package OOPJava.Student2;
public class Class {
    private String TenLop;
    private String TenKhoa;

    public Class(String tenLop, String tenKhoa){
        this.TenLop = tenLop;
        this.TenKhoa = tenKhoa;
    }

    public String getTen(){
        return this.TenLop;
    }
    public void setTenLop(String tenLop){
        this.TenLop = tenLop; 
    }
    public String getTenKhoa(){
        return this.TenKhoa;
    }
    public void setTenKhoa(String tenKhoa){
        this.TenKhoa = tenKhoa;
    }

     public void tenKhoaHS(){
        System.out.println(this.TenKhoa);
    }
    
}

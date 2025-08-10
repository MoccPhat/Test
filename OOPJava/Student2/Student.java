package OOPJava.Student2;
public class Student {
    private int MaSoSV;
    private String HoVaTen;
    private NgaySinh ngaysinh;
    private double DTB;

    public Student(int MaSoSV, String HoVaTen, NgaySinh ngaysinh, double DTB){
        this.MaSoSV = MaSoSV;
        this.HoVaTen = HoVaTen;
        this.ngaysinh = ngaysinh;
        this.DTB = DTB;
    }

    public int getMaSoSV(){
        return this.MaSoSV;
    }
    public void setMaSoSV(int MaSoSV){
        if(MaSoSV >= '0'&& MaSoSV <= '9' ){
            this.MaSoSV = MaSoSV;
        }
    }
    public String getHoVaTen(){
        return this.HoVaTen;
    }
    public void setHoVaTen(String HoVaTen){
        this.HoVaTen = HoVaTen;
    }
    public NgaySinh getNgaySinh(){
        return this.ngaysinh;
    }
    public void setNgaySinh(NgaySinh ngaySinh){
        this.ngaysinh = ngaySinh;
    }
    public double getDTB(){
        return this.DTB;
    }
    public void setDTB(double DTB){
        if(DTB >= 1.0 && DTB <=  10.0){
            this.DTB = DTB;
        }
    }

   public boolean SinhVienDau(){
        return this.DTB >= 5;
    }

    
   
}

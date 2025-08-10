package KeThua;
// public class HocSinh {
//     private String hoVaTen;
//     private int namSinh;
//     private String tenLop;
//     private String tenTruong;

//     public HocSinh(String hoVaTen, int namSinh, String tenLop, String tenTruong){
//         this.hoVaTen = hoVaTen;
//         this.namSinh = namSinh;
//         this.tenLop = tenLop;
//         this.tenTruong = tenTruong;
//     }

//     public String getHoVaTen(){
//         return this.hoVaTen;
//     } 
//     public void setHoVaTen(String hoVaTen){
//         this.hoVaTen = hoVaTen;
//     }
//     public int getNamSinh(){
//         return this.namSinh;
//     }
//     public void setNamSinh(int namSinh){
//         this.namSinh = namSinh;
//     }
//     public String getTenLop(){
//         return this.tenLop;
//     }
//     public void setTenLop(String tenLop){
//         this.tenLop = tenLop;
//     }
//     public String getTenTruong(){
//         return this.tenTruong;
//     }
//     public void setTenTruong(String tenTruong){
//         this.tenTruong = tenTruong;
//     }
//     public void an(){
//         System.out.println("Eat");
//     }
//     public void uong(){
//         System.out.println("Drink");
//     }
//     public void ngu(){
//         System.out.println("Sleep");
//     }
//     public void BaiTap(){
//         System.out.println("Code thieu nhi");
//     }
// }

public class HocSinh extends ConNguoi{
    private String tenLop;
    private String tenTruong;

    public HocSinh(String hoVaTen, int namSinh, String tenLop, String tenTruong){
        super(hoVaTen, namSinh);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
   }

    public String getTenLop(){
         return this.tenLop;
    }
    public void setTenLop(String tenLop){
        this.tenLop = tenLop;
    }
    public String getTenTruong(){
        return this.tenTruong;
    }
    public void setTenTruong(String tenTruong){
         this.tenTruong = tenTruong;
    }
    public void BaiTap(){
        System.out.println("Code thieu nhi");
    }
}
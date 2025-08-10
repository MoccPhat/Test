package OOPJava.Movie;
public class HangSx {
    private String tenHangSx;
    private String QuocGia;

    public HangSx (String tenHangSx, String QuocGia){
        this.tenHangSx = tenHangSx;
        this.QuocGia = QuocGia;
    }
    public String getTenHangSx(){
        return this.tenHangSx;
    } 
    public void setTengHangSx(String tenHangSx){
        this.tenHangSx = tenHangSx;
    }
    public String getQuocGia(){
        return this.QuocGia;
    }
    public void setQuocGia(String QuocGia){
        this.QuocGia = QuocGia;
    }
}

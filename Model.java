import java.util.StringTokenizer;

public class Model {

    private String luaChon_mon_chinh;
    private String luaChon_mon_phu;
    private double TongTien;

    public Model() {
        this.luaChon_mon_chinh = "";
        this.luaChon_mon_phu = "";
        TongTien = 0;
    }

    public String getLuaChon_mon_chinh() {
        return this.luaChon_mon_chinh;
    }

    public void setLuaChon_mon_chinh(String luaChon_mon_chinh) {
        this.luaChon_mon_chinh = luaChon_mon_chinh;
    }

    public String getLuaChon_mon_phu() {
        return this.luaChon_mon_phu;
    }

    public void setLuaChon_mon_phu(String luaChon_mon_phu) {
        this.luaChon_mon_phu = luaChon_mon_phu;
    }

    public double getTongTien() {
        return this.TongTien;
    }

    public void setTongTien(double tongTien) {
        TongTien = tongTien;
    }

    public void Tong_Tien() {
        this.TongTien = 0;
        if (this.luaChon_mon_chinh.equals("COM")) {
            TongTien += 25000;
        } else if (this.luaChon_mon_chinh.equals("PHO")) {
            TongTien += 45000;
        } else if (this.luaChon_mon_chinh.equals("BANH MI")) {
            TongTien += 15000;
        }

        StringTokenizer stk = new StringTokenizer(this.luaChon_mon_phu, ";");
        while (stk.hasMoreElements()) {
            String mon_phu = stk.nextToken();
            if (mon_phu.equals("COM THEM")) {
                TongTien += 5000;
            } else if (mon_phu.equals("BUN THEM")) {
                TongTien += 5000;
            } else if (mon_phu.equals("CA KHO THEM")) {
                TongTien += 20000;
            } else if (mon_phu.equals("TRA DA")) {
                TongTien += 2000;
            }
        }
    }

}

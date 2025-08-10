package Java_Swing.Tra_tu;

public class Model {
    private String van_ban;
    private String tu_khoa;
    private String ket_qua;

    public Model() {
        this.van_ban = "";
        this.tu_khoa = "";
        this.ket_qua = "";
    }

    public String getVan_ban() {
        return this.van_ban;
    }

    public void setVan_ban(String van_ban) {
        this.van_ban = van_ban;
    }

    public String getTu_khoa() {
        return this.tu_khoa;
    }

    public void setTu_khoa(String tu_khoa) {
        this.tu_khoa = tu_khoa;
    }

    public String getKet_qua() {
        return this.ket_qua;
    }

    public void setKet_qua(String ket_qua) {
        this.ket_qua = ket_qua;
    };

    public void tim_kieṃ̣() {
        int dem = 0;
        int vi_tri = 0;
        while (true) {
            int i = this.van_ban.indexOf(this.tu_khoa, vi_tri);
            if (i == -1) {
                break;
            } else {
                dem++;
                vi_tri = i + 1;
            }
        }
        this.ket_qua = "Ket qua: co " + dem + " " + this.tu_khoa;
        System.out.println(this.ket_qua);
    }

}

package ENUM;
public class TKB {
    private Enum thu;
    private String cac_mon_hoc;

    public TKB(Enum thu, String cac_mon_hoc) {
        this.thu = thu;
        this.cac_mon_hoc = cac_mon_hoc;
    }

    public Enum getThu() {
        return thu;
    }

    public void setThu(Enum thu) {
        this.thu = thu;
    }

    public String getCac_mon_hoc() {
        return cac_mon_hoc;
    }

    public void setCac_mon_hoc(String cac_mon_hoc) {
        this.cac_mon_hoc = cac_mon_hoc;
    }

    @Override
    public String toString() {
        return "TKB [thu= " + thu + ", cac_mon_hoc= " + cac_mon_hoc + "]";
    }

}

package KeThua;

public class PhungTien {
    public static void main (String[] args){
        System.out.println("--------------------------------");
        HangSanXuat hang1 = new HangSanXuat("Petrolimex", "American");
        System.out.println("May Bay: ");
        MayBay mayBay1 = new MayBay("Xang (Avgas)", hang1);
        mayBay1.BatDau();
        mayBay1.CatCanh();
        mayBay1.DungLai();
        mayBay1.HaCanh();
        mayBay1.TangToc();
        System.out.println(mayBay1.LayVanToc()+"km/h");
        System.out.println(mayBay1.getLoaiNhienLieu());
        System.out.println("Hang San Xuat: "+mayBay1.LayTenHangSanXuat());
        System.out.println("--------------------------------");

        HangSanXuat hang2 = new HangSanXuat("ReBulls", "American");
        System.out.println("Oto: ");
        XeOto oto1 = new XeOto("Dau ", hang2);
        oto1.BatDau();
        System.out.println(oto1.LayVanToc());
        System.out.println("--------------------------------");

        HangSanXuat hang3 = new HangSanXuat("ByBike", "VietNam");
        System.out.println("Xe Dap: ");
        XeDap xedap1 = new XeDap(hang3);
        System.out.println(xedap1.LayVanToc());

    }
}

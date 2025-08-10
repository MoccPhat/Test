package KeThua;
public class XeDap extends PhuongTienDiChuyen {
    public XeDap(HangSanXuat hangsanxuat){ 
        super("Xe Dap",hangsanxuat);
    }

    @Override 
    public double LayVanToc(){
        return 40;
    }
}

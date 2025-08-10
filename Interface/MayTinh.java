package Interface;

public class MayTinh {
    public static void main (String[] args){
        // System.out.println("Test cau a: ");
        // MayTinhCasio500FX mfx500 = new MayTinhCasio500FX();
        // MayTinhVinacal500 mvn500 = new MayTinhVinacal500();

        // System.out.println("5 + 3 = "+mfx500.Cong(5, 3));
        // System.out.println("4 * 5 = "+mfx500.Nhan(4, 5));
        // System.out.println("4 % 0 = "+mfx500.Chia(4, 0));
        // System.out.println("----------------------------");
        // System.out.println("5 + 3 = "+mvn500.Cong(5, 3));
        // System.out.println("4 * 5 = "+mvn500.Nhan(4, 5));
        // System.out.println("4 % 0 = "+mvn500.Chia(4, 0));
        // System.out.println("----------------------------");
        
        // System.out.println("Test cau b: ");
        // double []arr1 = new double[]{5,3,4,1,2};
        // double []arr2 = new double[]{6,8,7,10,9};
        // SapXepChen sxchen = new SapXepChen();
        // SapXepChon sxchon = new SapXepChon();

        // sxchen.SapXepGiamDan(arr1);
        // for(int i = 0; i < arr1.length;i++){
        //     System.out.print(arr1[i]+" ");
        // }
        // System.out.println();
        // sxchon.SapXepGiamDan(arr2);
        //  for(int i = 0; i < arr2.length;i++){
        //     System.out.print(arr2[i]+" ");
        // }

        System.out.println("Test cau c: ");
        PhanMemMayTinh pmmt1 = new PhanMemMayTinh();
        System.out.println("3 + 5 = "+pmmt1.Cong(3, 5));
        double []arr3 = new double[]{4,2,5,6,8,10};
        pmmt1.SapXepTangDan(arr3);
        for(int i = 0 ; i < arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}

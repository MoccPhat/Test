package Learn;
import java.util.Arrays;

public class Array_3 {
    public static int[] reverse(int[] x) {
        int[] ket_qua = new int[x.length];
        int index = 0;
        for (int i = x.length - 1; i >= 0; i--) {
            ket_qua[index] = x[i];
            index++;
        }
        return ket_qua;
    }

    public static void main(Chuoi_2[] args) {
        int[] a = new int[] { 1, 8, 2, 6, 4, 3, 7, 9 };
        int[] b = new int[15];

        //
        System.out.println("a ban dau: " + Arrays.toString(a));
        System.out.println("----------------------");
        // Ham sap xep
        Arrays.sort(a);
        System.out.println("a sau khi sap xep: " + Arrays.toString(a));
        System.out.println("----------------------");
        // Ham tim kiem
        System.out.println(Arrays.binarySearch(a, 4));
        System.out.println(Arrays.binarySearch(a, -1));
        System.out.println("----------------------");
        // Ham dien gia tri
        Arrays.fill(b, 5);
        System.out.println("b sau khi dien gia tri: " + Arrays.toString(b));
        System.out.println("----------------------");
        // ham sap xep giam dan
        Arrays.sort(a);
        a = Array_3.reverse(a);
        System.out.println("b sau khi sap xep giam dan: " + Arrays.toString(a));
        System.out.println("----------------------");
    }
}

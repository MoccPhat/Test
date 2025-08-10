package Learn;
import java.util.Arrays;

public class Array_2 {
    public static void main(String[] args) {
        // Kieu du lieu nguyen thuy
        int[] array_1 = new int[] { 1, 2, 3 };

        // Copy array 1
        int[] array_2 = array_1;
        array_2[0] = 100;
        System.out.println("Array 1: " + Arrays.toString(array_1));
        System.out.println("Array 2: " + Arrays.toString(array_2));
        System.out.println("----------------------------------");

        // Copy arrray 2 (use clone)
        int[] array_3 = array_1.clone();
        array_3[0] = 50;
        System.out.println("Array 3: " + Arrays.toString(array_3));
        System.out.println("----------------------------------");

        // Copy array 3 (use System.arraycopy)
        int[] array_4 = new int[array_1.length];
        System.arraycopy(array_1, 0, array_4, 0, array_1.length);
        array_4[0] = 90;
        System.out.println("Array 4: " + Arrays.toString(array_4));
        System.out.println("----------------------------------");

        // Array object
        String[] object_1 = { "Tran","Moc","Tan","Phat"};
        
        // Gan gia tri
        String [] object_2;
        object_2 = object_1;
        object_2[0] = "Nguyen";
        System.out.println("Object_1: "+Arrays.toString(object_1));
        System.out.println("Object_2: "+Arrays.toString(object_2));
        System.out.println("----------------------------------");
        
        // Tao ban sao 
        String [] object_3;
        object_3 = object_1.clone();
        object_3[0] = "Lai";
        System.out.println("Object_1: "+Arrays.toString(object_1));
        System.out.println("Object_2: "+Arrays.toString(object_3));
        System.out.println("----------------------------------");
    
        String [] object_4;
        object_4 = new String[object_1.length];
        System.arraycopy(object_1,0,object_4,0,object_1.length);
        object_4[0] = "Hue";
        System.out.println("Object_1: "+Arrays.toString(object_1));
        System.out.println("Object_4: "+Arrays.toString(object_4));
        System.out.println("----------------------------------");
    }
}
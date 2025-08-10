package Learn;
import java.util.Scanner;

public class Chuoi{
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi");
        s = sc.nextLine();
        System.out.println("-----------------------");

        // Do dai cua chuoi (length)
        System.out.println(s.length());
        int do_dai = s.length();

        // Lay ki tu chi dinh trong chuoi (charAt)
        for(int i = 0 ; i < do_dai; i++){
            System.err.println("Vi tri "+i+ " la: "+s.charAt(i));
        }
        
        // Lay hang loat ki tu trong chuoi (getChars)
        char [] array_char = new char[100];
        s.getChars(2, 5, array_char, 0);
        for(int i = 0 ; i < array_char.length; i++){
            System.err.println("Gia tri cua mang tai "+i+ " la: "+array_char[i]);
        }

        // getBytes => bien ki tu thanh bang ma ascii
        byte [] array_bytes = s.getBytes();
        for(byte b : array_bytes){
            System.err.print(b+" ");
        }
        sc.close();
        
    }
}
package Learn;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Stack<String> stack_chuoi = new Stack<String>();

        // Stack.push("Gia tri"): dua gia tri vao
        // Stack.pop(): lay gia tri ra, xoa gia tri khoi stack
        // Stack.peek(): lay gia tri ra,, khong xoa gia tri khoi stack
        // Stack.clear(): xoa tat ca phan tu trong stack
        // Stack.contains("Gia tri"): xac dinh gia tri co ton tại trong stack khong
        // Stack.size(): lay ra do lon cua stack

        // dao nguoc chuoi
        // String s = sc.nextLine();
        // mocccphat
        // for (int i = 0; i < s.length(); i++) {
        //     stack_chuoi.push(s.charAt(i) + "");
        // }
        // System.out.println("Chuoi dao nguoc: ");
        // for (int i = 0; i < s.length(); i++) {
        //     System.out.println(stack_chuoi.pop());
        // }

        // Chuyen so thap phan sang nhi phan
        Stack<String> stack_du = new Stack<String>();
        System.out.println("Nhap 1 so nguyen tui ban phim: ");
        int x = sc.nextInt();
        while (x > 0) {
            int so_du = x % 2;
            stack_du.push(so_du+"");
            x /= 2;
        }
        System.out.println("So nhi phan la: ");
        int n = stack_du.size();
        for(int i = 0 ; i < n;i++){
            System.out.print(stack_du.pop());
        }
        sc.close();
    }
}

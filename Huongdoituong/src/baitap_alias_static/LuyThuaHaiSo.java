package baitap_alias_static;

import java.util.Scanner;

public class LuyThuaHaiSo {
	static int coSo, soMu;  // khai báo biến tĩnh
	 
    // khai báo phương thức tĩnh để tính lũy thừa 2 sô
    public static long tinhLuyThua(int coSo, int soMu) {
        long ketQua = 1;
         
        for (int i = 0; i < soMu; i++) {
            ketQua *= coSo;
        }
        return ketQua;
    }
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cơ số: ");
        coSo = scanner.nextInt();
        System.out.print("Nhập số mũ: ");
        soMu = scanner.nextInt();
        System.out.println(coSo + "^" + soMu + " = " + LuyThuaHaiSo.tinhLuyThua(coSo, soMu));
    }
 

	
}

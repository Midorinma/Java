package baitap_chuvidientich;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int canh;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Nhập chiều dài cạnh hình vuông: ");
        canh = scanner.nextInt();
        
        HinhVuong hinhVuong=new HinhVuong(canh);
        System.out.println("Chu vi hình vuông= "+hinhVuong.tinhChuVi());
        System.out.println("Diện tích hinh vuông= "+hinhVuong.tinhDienTich());
	}

}

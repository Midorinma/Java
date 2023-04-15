package chuvidientich_hinhchunhat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chieuDai,chieuRong;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Chiều dài hình chữ nhật: ");
		chieuDai=scanner.nextInt();
		System.out.print("Chiều rộng hình chữ nhật: ");
		chieuRong=scanner.nextInt();
		
		HinhChuNhat hinhChuNhat=new HinhChuNhat(chieuDai, chieuRong);
		hinhChuNhat.setChieuDai(chieuDai);
		hinhChuNhat.setChieuRong(chieuRong);
		if(chieuDai<=0 || chieuRong<=0 || chieuDai<chieuRong) {
			return;
		}
		else {
			System.out.println("Chu vi hình chữ nhật: "+hinhChuNhat.tinhChuVi());
			System.out.println("Diện tích hình chữ nhật: "+hinhChuNhat.tinhDienTich());
		}
				

	}

}

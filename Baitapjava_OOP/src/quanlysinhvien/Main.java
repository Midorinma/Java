package quanlysinhvien;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		SinhVien sv[]=null;
		int soLuongSinhVien;
		
		System.out.print("Nhập vào số lượng sinh viên: ");
		soLuongSinhVien=scanner.nextInt();
		sv=new SinhVien[soLuongSinhVien];
		
		for(int i=0; i<soLuongSinhVien; i++) {
			System.out.println("Thông tin sinh viên thứ "+(i+1)+" : ");
			sv[i]=new SinhVien();
			
			System.out.print("maSV: ");
			sv[i].setMaSinhVien(scanner.nextInt());scanner.nextLine();
			System.out.print("Họ tên: ");
			sv[i].setHoTen(scanner.nextLine());
			System.out.print("Địa chỉ: ");
			sv[i].setDiaChi(scanner.nextLine());
			System.out.print("Số điện thoại: ");
			sv[i].setSoDienThoai(scanner.nextLine());
			
		}
		System.out.println();
		
		//Tạo hàm hoán đổi
		SinhVien temp=sv[0];
		for(int i=0; i<sv.length-1; i++) {
			for(int j=i+1; j<sv.length; j++) {
				if(sv[i].getMaSinhVien()>sv[j].getMaSinhVien()) {
					temp=sv[j];
					sv[j]=sv[i];
					sv[i]=temp;
				}
			}
		}
		
		for(int i=0; i<sv.length; i++) {
			System.out.println(sv[i].toString());
		}
	
		
		

	}

}

package baitap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NhanVien {
	//Viết chương trình tạo 1 lớp NhanVien lưu trữ họ tên và số điện
	//thoại của 3 nhân viên và sau đó tìm kiếm nhân viên theo tên.
	private String tenNhanVien,soDienThoai,thongTin,ketQua;
	static ArrayList<String> arrNhanVien=new ArrayList<>(3);
	static Scanner scanner=new Scanner(System.in);
	
	public void nhapThongTinNhanVien() {
		for(int i=0; i<3; i++) {
			System.out.print("Nhập tên nhân viên: ");
			tenNhanVien=scanner.nextLine();
			System.out.print("Nhập sdt: ");
			soDienThoai=scanner.nextLine();
			
			arrNhanVien.add(tenNhanVien);
		}
	}
	
	public void timNhanVienTheoTen(String tenNV) {
		/*
		 * phương thức split () chia chuỗi tại regex được chỉ định và trả về một mảng các chuỗi con.
		 */
		//String thongTinNV[]=thongTin.split("\t");
		for(int i=0; i<3; i++) {
			if(arrNhanVien.get(i).equals(tenNV)) {
				//System.out.println(Arrays.toString(thongTinNV));
				System.out.println("Có nhân viên tên "+tenNV);
				return;
				
			}
		}
		
		System.out.println("Không có nhân viên tên "+tenNV);
	
		
	}
	

	public static void main(String[] args) {
		NhanVien nhanVien=new NhanVien();
		nhanVien.nhapThongTinNhanVien();
		
		System.out.println("Nhập tên nhân viên cần tìm: ");
		String tenNVCanTim=scanner.nextLine();
		
		nhanVien.timNhanVienTheoTen(tenNVCanTim);
	
		
		

	}

}

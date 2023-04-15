package baitap_luongnhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soNhanVienToanThoiGian,soNhanVienThoiVu;
		Scanner scanner=new Scanner(System.in);
		
		NhanVien nhanVien;
		
		ArrayList<NhanVien> arrNhanVien=new ArrayList<>();
		
		System.out.print("Nhập số nhân viên toàn thời gian: ");
		soNhanVienToanThoiGian=scanner.nextInt();
		
		System.out.println("NHẬP THÔNG TIN NHÂN VIÊN TOÀN THỜI GIAN");
		for(int i=0; i<soNhanVienToanThoiGian; i++) {
			System.out.println("Thông tin nhân viên toàn thời gian thứ "+(i+1)+" : ");
			nhanVien=new NhanVienToanThoiGian();	// lúc này nhanVien là nhân viên toàn thời gian
			nhanVien.nhapThongTin();
			arrNhanVien.add(nhanVien);
		}
		
		System.out.print("Nhập số nhân viên thời vụ:");
		soNhanVienThoiVu=scanner.nextInt();
		
		System.out.println("NHẬP THÔNG TIN NHÂN VIÊN THỜI VỤ");
		for(int j=0; j<soNhanVienThoiVu; j++) {
			System.out.println("Thông tin nhân viên thời vụ thứ "+(j+1)+" : ");
			nhanVien=new NhanVienThoiVu(); 	// còn bây giờ nhanVien là nhân viên thời vụ
			nhanVien.nhapThongTin();
			arrNhanVien.add(nhanVien);
		}
		
		System.out.println("THÔNG TIN NHÂN VIÊN");
		for(NhanVien nv : arrNhanVien) {
			nv.tinhLuong();
			System.out.println(nv.toString());
		}

	}

}

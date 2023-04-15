package baitap_quanlychuyenxe;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Định dạng tiền tệ
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		
		// Tạo DS liên kết lưu trữ thông tinh chuyến xe
		ArrayList<ChuyenXeNoiThanh> arrChuyenXeNoiThanh=new ArrayList<>();
		ArrayList<ChuyenXeNgoaiThanh> arrChuyenXeNgoaiThanh=new ArrayList<>();
		
		int soChuyenNoiThanh,soChuyenNgoaiThanh;
		double doanhThuXeNoiThanh=0.0,doanhThuXeNgoaiThanh=0.0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhập Số  chuyến xe nội thành: ");
		soChuyenNoiThanh=scanner.nextInt();
		System.out.print("Nhập số chuyến xe ngoại thành: ");
		soChuyenNgoaiThanh=scanner.nextInt();
		
		System.out.println("Nhập thông tin chuyến xe nội thành: ");
		for(int i=0; i<soChuyenNoiThanh; i++) {
			System.out.println("Nhập thông tin chuyến xe thứ "+(i+1)+" : ");
			ChuyenXeNoiThanh chuyenXeNoiThanh=new ChuyenXeNoiThanh();
			chuyenXeNoiThanh.nhapThongTinChuyenXe();
			
			doanhThuXeNoiThanh+=chuyenXeNoiThanh.getDoanhThu();
			
			arrChuyenXeNoiThanh.add(chuyenXeNoiThanh);
		}
		
		System.out.println("Nhập thông tin chuyến xe ngoại thành: ");
		for(int j=0; j<soChuyenNgoaiThanh; j++) {
			System.out.println("Nhập thông tin chuyến xe thứ "+(j+1)+" : ");
			ChuyenXeNgoaiThanh chuyenXeNgoaiThanh=new ChuyenXeNgoaiThanh();
			chuyenXeNgoaiThanh.nhapThongTinChuyenXe();
			
			doanhThuXeNgoaiThanh+=chuyenXeNgoaiThanh.getDoanhThu();
			
			arrChuyenXeNgoaiThanh.add(chuyenXeNgoaiThanh);
		}
		
		System.out.println("--------> Thông tin chuyến xe nội thành <-----------");
		for(int i=0; i<arrChuyenXeNoiThanh.size(); i++) {
			System.out.println(arrChuyenXeNoiThanh.get(i).toString());
		}
		
		System.out.println("--------> Thông tin chuyến xe ngoại thành <-----------");
		for(int j=0; j<arrChuyenXeNgoaiThanh.size(); j++) {
			System.out.println(arrChuyenXeNgoaiThanh.get(j).toString());
		}
		
		 String str = currencyFormat.format(doanhThuXeNoiThanh);
		 String str1 = currencyFormat.format(doanhThuXeNgoaiThanh);
		System.out.println("Doanh thu từng chuyến xe: ");
		System.out.println("Doanh thu chuyến xe nội thành: "+str);
		System.out.println("Doanh thu chuyến xe ngoại thành: "+str1);
		
	}

}

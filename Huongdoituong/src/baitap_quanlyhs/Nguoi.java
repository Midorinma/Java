package baitap_quanlyhs;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private String gioiTinh;
	private String queQuan;
	
	
	public Nguoi() {
		super();
	}

	public void nhapDoiTuong() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Họ và tên: ");
		hoTen=scanner.nextLine();
		System.out.print("Gioi tính: ");
		gioiTinh=scanner.nextLine();
		System.out.print("Quê quán: ");
		queQuan=scanner.nextLine();
	}
	
	
	public Nguoi(String hoTen, String gioiTinh, String queQuan) {
		super();
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
	}
	
	

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public void xuatDoiTuong() {
		System.out.println("Họ và tên: "+hoTen);
		System.out.println("Gioi tính: "+gioiTinh);
		System.out.println("Quê quán: "+queQuan);
	}

	

}

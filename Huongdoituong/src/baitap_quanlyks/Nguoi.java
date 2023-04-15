package baitap_quanlyks;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private String soCMND;
	private String queQuan;
	
	public Nguoi() {
		super();
	}
	
	public Nguoi(String hoTen, String soCMND, String queQuan) {
		super();
		this.hoTen = hoTen;
		this.soCMND = soCMND;
		this.queQuan = queQuan;
	}
	
	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	
	public void nhapThongTinKhachTro() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Nhập họ tên khách hàng: ");
		hoTen=scanner.nextLine();
		
		System.out.print("Nhập quê quán: ");
		queQuan=scanner.nextLine();
		
		System.out.println("Nhập số CMND: ");
		soCMND=scanner.nextLine();
	}
	
	public void hienThiThongTinKhachTro() {
		System.out.println("Họ và tên khách hàng: "+hoTen);
		System.out.println("Quê quán: "+queQuan);
		System.out.println("Số CMNH: "+soCMND);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

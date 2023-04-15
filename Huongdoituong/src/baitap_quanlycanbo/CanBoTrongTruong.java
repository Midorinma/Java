package baitap_quanlycanbo;

import java.util.Scanner;

public class CanBoTrongTruong {
	public String hoTen;
	
	private float heSoLuong;
	Scanner scanner=new Scanner(System.in);
	
	public CanBoTrongTruong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CanBoTrongTruong(String hoTen, float heSoLuong) {
		super();
		this.hoTen = hoTen;
		
		this.heSoLuong = heSoLuong;
	}

	/**
	 * @return the heSoLuong
	 */
	public double getHeSoLuong() {
		return heSoLuong;
	}

	/**
	 * @param heSoLuong the heSoLuong to set
	 */
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	//Khởi tạo phương thức ghi đè
	public long phuCap() {
		
		return 0;
	}
	
	public long luong() {
		return 0;
	}
	
	public void nhapThongTinCanBo() {
		System.out.print("Họ và tên: ");
		hoTen=scanner.nextLine();
		do {
			System.out.print("Hệ số lương: ");
			heSoLuong=Float.parseFloat(scanner.nextLine());
		}while(heSoLuong<=0);
	}

	@Override
	public String toString() {
		return "hoTen: " + this.hoTen + ", phuCap: " +this.phuCap() + ", heSoLuong: " +this.heSoLuong+", Lương: "+this.luong();
	}
	
	
	
	
	
	

}

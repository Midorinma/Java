package baitap_quanlysach;

import java.util.Scanner;

public class SachThamKhao extends Sach{
	private double thue;
	private double thanhTien;
	Scanner scanner=new Scanner(System.in);
	public SachThamKhao(double thue) {
		super();
		this.thue = thue;
	}
	
	public SachThamKhao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	public void nhapThongTinSach() {
		super.nhapThongTinSach();
		System.out.print("Thuế: ");
		thue=scanner.nextDouble();
	}
	
	public String toString() {
		return super.toString()+", Thuế: "+this.thue;
		
	}
	
}

package baitap_quanlychuyenxe;

import java.util.Scanner;

public class ChuyenXe {
	protected String msChuyen,hoTenTaiXe,soXe;
	protected double doanhThu;
	Scanner scanner=new Scanner(System.in);
	
	public ChuyenXe(String msChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
		super();
		this.msChuyen = msChuyen;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	public ChuyenXe() {
		// TODO Auto-generated constructor stub
		super();
		this.msChuyen="";
		this.hoTenTaiXe="";
		this.soXe="";
		this.doanhThu=0;
	}
	
	public String getMsChuyen() {
		return msChuyen;
	}

	public void setMsChuyen(String msChuyen) {
		this.msChuyen = msChuyen;
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	public void nhapThongTinChuyenXe() {
		System.out.print("Mã số chuyến: ");
		msChuyen=scanner.nextLine();
		System.out.print("Họ tên tài xế: ");
		hoTenTaiXe=scanner.nextLine();
		System.out.print("Số xe: ");
		soXe=scanner.nextLine();
		System.out.print("Doanh thu: ");
		doanhThu=scanner.nextDouble();
	}
	
	public String toString() {
		//System.out.println("Mã số chuyến: "+this.msChuyen+", Họ tên tài xế: "+this.hoTenTaiXe+", Số xe: "+this.soXe+", Doanh thu: "+this.doanhThu);
		return "Mã số chuyến: "+this.msChuyen+", Họ tên tài xế: "+this.hoTenTaiXe+", Số xe: "+this.soXe+", Doanh thu: "+this.doanhThu;
	}
	
	
	
	
	
	

}

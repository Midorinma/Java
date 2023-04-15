package quanlytk_nganhang;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account implements ImplementAccount{
	private int soTaiKhoan;
	private String tenTaiKhoan;
	private double soTienTrongTaiKhoan;
	Scanner scanner=new Scanner(System.in);
	
	//Khởi tạo Constructor
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int soTaiKhoan, String tenTaiKhoan, double soTienTrongTaiKhoan) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
	}
	
	//Phương thức get/set
	public long getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public void setSoTaiKhoan(int soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public double getSoTienTrongTaiKhoan() {
		return soTienTrongTaiKhoan;
	}

	public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
		this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
	}
	
	//Nhập xuất thông tin
	public void themThongTin() {
		System.out.print("Nhập số tài khoản: ");
		soTaiKhoan=Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập tên tài khoản: ");
		tenTaiKhoan=scanner.nextLine();
		setSoTienTrongTaiKhoan(50);
	}
	
	public void hienThi() {
		NumberFormat currency=NumberFormat.getCurrencyInstance();
		String str1=currency.format(soTienTrongTaiKhoan);
		System.out.printf("%3d %7s %15s\n",soTaiKhoan,tenTaiKhoan,str1);
	}
	

	@Override
	public double napTienVaoTaiKhoan() {
		// TODO Auto-generated method stub
		double soTienNap;
		do {
			System.out.println("số tiền cần nạp: ");
			soTienNap=scanner.nextDouble();
			if(soTienNap<0) {
				System.out.println("Số tiền trong tài khoản phải (>=0)!");
			}
		}while(soTienNap<0);
		soTienTrongTaiKhoan=soTienNap+soTienTrongTaiKhoan;
		
		NumberFormat currencyEN=NumberFormat.getCurrencyInstance();
		String srt1=currencyEN.format(soTienNap);
		System.out.println("Bạn vừa nạp "+srt1+" vào tài khoản!");
		return soTienNap;
	}

	@Override
	public double rutTien() {
		// TODO Auto-generated method stub
		double soTienRut;
		double phi=5;
		
		do {
			System.out.print("Nhập vào số tiền cần rút: ");
			soTienRut=scanner.nextDouble();
			if(soTienRut>soTienTrongTaiKhoan+phi) {
				System.out.println("Số tiền rút không hợp lệ! yêu cầu nhập lại.");
			}
		}while(soTienRut>soTienTrongTaiKhoan-phi);
		soTienTrongTaiKhoan=soTienTrongTaiKhoan-(soTienRut+phi);
		
		NumberFormat currencyEN1=NumberFormat.getCurrencyInstance();
		String str2=currencyEN1.format(soTienRut);
		System.out.println("Bạn vừa rút "+str2+" Số tiền, với phí là 5$");
		return soTienRut;
	}

	@Override
	public double daoHan() {
		// TODO Auto-generated method stub
		soTienTrongTaiKhoan=soTienTrongTaiKhoan+soTienTrongTaiKhoan*laiSuat;
		NumberFormat numberFormat=NumberFormat.getInstance();
		
		String str3=numberFormat.format(soTienTrongTaiKhoan);
		System.out.println("Bạn vừa được "+str3+" từ đáo hạn 1 tháng.");
		return soTienTrongTaiKhoan;
		
	}
	
}

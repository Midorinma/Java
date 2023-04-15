package baitap_nhadat;

import java.util.Scanner;

public class GiaoDich {
	private String maGiaoDich,ngayGiaoDich;
	protected double donGia,dienTich;
	Scanner scanner=new Scanner(System.in);
	public GiaoDich() {
		super();
		
	}

	public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public String getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(String ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	
	public void nhapThongTinGiaoDich() {
		System.out.print("Mã giao dịch: ");
		maGiaoDich=scanner.nextLine();
		System.out.print("Ngày giao dịch: ");
		ngayGiaoDich=scanner.nextLine();
		System.out.print("Đơn giá: ");
		donGia=scanner.nextDouble();
		System.out.print("Diện tích: ");
		dienTich=scanner.nextDouble();
	}
	
	public String toString() {
		return "Mã giao dịch: "+this.maGiaoDich+", Ngày giao dịch: "+
	this.ngayGiaoDich+", Đơn giá: "+this.donGia+", Diện tích: "+this.dienTich;
	}
	
	
	

}

package baitap_quanlysach;

import java.util.Scanner;

public class Sach {
	private String maSach;
	public double donGia;
	private int soLuong;
	public String nhaXuatBan;
	Scanner scanner=new Scanner(System.in);
	
	public Sach(String maSach, double donGia, int soLuong, String nhaXuatBan) {
		super();
		this.maSach = maSach;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}
	
	public Sach() {
		// TODO Auto-generated constructor stub
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	public void nhapThongTinSach() {
		System.out.print("Mã sách: ");
		maSach=scanner.nextLine();
		System.out.print("Nhà xuất bản: ");
		nhaXuatBan=scanner.nextLine();
		System.out.print("Đơn giá: ");
		donGia=scanner.nextDouble();
		System.out.print("Số lượng: ");
		soLuong=scanner.nextInt();
		
	}
	
	public String toString() {
		return "Mã sách: "+this.maSach+", Đơn giá: "+this.donGia+", Số lượng: "+this.soLuong+", Nhà xuất bản: "+this.nhaXuatBan;
	}

}

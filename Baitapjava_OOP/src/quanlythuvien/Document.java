package quanlythuvien;

import java.util.Scanner;

public class Document {
	protected int maTaiLieu;
	protected String tenNhaXuatBan;
	protected int soBanPhatHanh;
	Scanner scanner=new Scanner(System.in);
	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Document(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public int getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}

	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	public void nhapThongTinTaiLieu() {
		System.out.print("Mã tài liệu: ");
		maTaiLieu=Integer.parseInt(scanner.nextLine());
		System.out.print("Tên nhà xuất bản: ");
		tenNhaXuatBan=scanner.nextLine();
		System.out.print("Số bản phát hành: ");
		soBanPhatHanh=Integer.parseInt(scanner.nextLine());
	}
	
	@Override
	public String toString() {
		return "MaTaiLieu: " + maTaiLieu + ", tenNhaXuatBan: " + tenNhaXuatBan + ", soBanPhatHanh: "
				+soBanPhatHanh;
	}
	
	

}

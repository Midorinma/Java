package bt_quanlynhanvienphanmem;

import java.util.Scanner;

public class NhanVien {
	private String maNhanVien,hoTen;
	protected int tuoi;
	private String soDienThoai;
	private String email;
	private long luongCoBan;
	private long luong;
	Scanner scanner=new Scanner(System.in);
	
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NhanVien(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, long luongCoBan) {
		super();
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.luongCoBan = luongCoBan;
	}

	/**
	 * @return the maNhanVien
	 */
	public String getMaNhanVien() {
		return maNhanVien;
	}

	/**
	 * @param maNhanVien the maNhanVien to set
	 */
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	/**
	 * @return the luongCoBan
	 */
	public long getLuongCoBan() {
		return luongCoBan;
	}

	/**
	 * @param luongCoBan the luongCoBan to set
	 */
	public void setLuongCoBan(long luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	

	public long luong() {
		return 0;
	}
	
	public void nhapThongTinNhanVien() {
		System.out.print("Mã nhân viên: ");
		maNhanVien=scanner.nextLine();
		System.out.print("Họ và tên: ");
		hoTen=scanner.nextLine();
		System.out.print("Số điện thoại: ");
		soDienThoai=scanner.nextLine();
		System.out.print("Email: ");
		email=scanner.nextLine();
		System.out.print("Tuổi: ");
		tuoi=scanner.nextInt();
		System.out.print("Lương cơ bản: ");
		luongCoBan=scanner.nextLong();
	}

	@Override
	public String toString() {
		return "Mã nhân viên: "+this.maNhanVien+", Họ tên: "+this.hoTen+", Tuổi: "+this.tuoi+", Số điện thoại: "+this.soDienThoai
				+", Email: "+this.email+", Lương cơ bản: "+this.luongCoBan+", Lương: "+this.luong();
	}
	
	
	
	

	
	
	
}

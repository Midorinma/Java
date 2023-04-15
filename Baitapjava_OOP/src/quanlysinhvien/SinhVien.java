package quanlysinhvien;

public class SinhVien {
	private int maSinhVien;
	private String hoTen;
	private String diaChi;
	private String soDienThoai;
	
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVien(int maSinhVien, String hoTen, String diaChi, String soDienThoai) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", soDienThoai="
				+ soDienThoai + "]";
	}
	
	
	
	

}

package thongtinsinhvien;

public class SinhVien {
	//Khai báo thuộc tính đối tượng, có sử dụng tính đóng gói là private
	private int maSinhVien;
	private String hoTen;
	private float diemLyThuyet;
	private float diemThucHanh;
	
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
		maSinhVien=0;
		hoTen="";
		diemLyThuyet=0.0f;
		diemThucHanh=0.0f;
		
	}

	public SinhVien(int maSinhVien, String hoTen, float diemLyThuyet, float diemThucHanh) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
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

	public float getDiemLyThuyet() {
		return diemLyThuyet;
	}

	public void setDiemLyThuyet(float diemLyThuyet) {
		this.diemLyThuyet = diemLyThuyet;
	}

	public float getDiemThucHanh() {
		return diemThucHanh;
	}

	public void setDiemThucHanh(float diemThucHanh) {
		this.diemThucHanh = diemThucHanh;
	}
	
	public float diemTrungBinh() {
		return (this.diemLyThuyet+this.diemThucHanh)/2;
	}
	
	


	public void inSV() {
		System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n",maSinhVien,hoTen,diemLyThuyet,diemThucHanh,diemTrungBinh());
	}

	
	
	
	
	
	
	
	
	
	

}

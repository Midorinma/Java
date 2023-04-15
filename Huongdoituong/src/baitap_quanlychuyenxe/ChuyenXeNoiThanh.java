package baitap_quanlychuyenxe;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe{
	private String soTuyen;
	private double soKmDiDuoc;
	Scanner scanner=new Scanner(System.in);
	
	
	public ChuyenXeNoiThanh() {
		super();
		// Hàm khởi tạo cho biến
		this.soTuyen="";
		this.soKmDiDuoc=0;
	}

	public ChuyenXeNoiThanh( String soTuyen,Double soKmDiDuoc) {
		super();
		this.soTuyen = soTuyen;
		this.soKmDiDuoc = soKmDiDuoc;
	}

	public String getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	public Double getSoKmDiDuoc() {
		return soKmDiDuoc;
	}

	public void setSoKmDiDuoc(Double soKmDiDuoc) {
		this.soKmDiDuoc = soKmDiDuoc;
	}
	
	public void nhapThongTinChuyenXe() {
		super.nhapThongTinChuyenXe();	// gọi hàm nhapThongTinChuyenXe() của lớp ChuyenXe
		System.out.print("Số tuyến: ");
		soTuyen=scanner.nextLine();
		System.out.print("Số km đi được: ");
		soKmDiDuoc=scanner.nextDouble();
	}
	
	public String toString() {
		return super.toString()+", Số tuyến: "+this.soTuyen+", Số km đi được: "+this.soKmDiDuoc;
	}
	
}

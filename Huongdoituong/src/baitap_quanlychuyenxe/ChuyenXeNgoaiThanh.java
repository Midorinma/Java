package baitap_quanlychuyenxe;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
	private String noiDen;
	private int soNgayDiDuoc;
	Scanner scanner=new Scanner(System.in);
	
	public ChuyenXeNgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
		this.noiDen="";
		this.soNgayDiDuoc=0;
	}

	public ChuyenXeNgoaiThanh(String noiDen,int soNgayDiDuoc) {
		super();
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	public void nhapThongTinChuyenXe() {
		super.nhapThongTinChuyenXe();//Nhập thông tin từ lớp chuyến xe 
		System.out.print("Nơi đến: ");
		noiDen=scanner.nextLine();
		System.out.print("Số ngày đi được: ");
		soNgayDiDuoc=scanner.nextInt();
	}
	
	public String toString() {
		return super.toString()+", Nơi đến: "+this.noiDen+", Số ngày đi được: "+this.soNgayDiDuoc;
	}
	
	
	
	


}

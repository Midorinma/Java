package baitap_nhadat;

import java.util.Scanner;

public class GiaoDichDat extends GiaoDich{
	protected String loaiDat;
	private double thanhTien;
	Scanner scanner=new Scanner(System.in);
	
	public GiaoDichDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichDat(String loaiDat, char kiTu) {
		super();
		this.loaiDat = loaiDat;
		
	}

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
	
	public void nhapThongTinGiaoDich() {
		super.nhapThongTinGiaoDich();
		System.out.print("Loại đất (loại:A/B/C) : ");
		loaiDat=scanner.nextLine();
	}
	
	public String toString() {
		return super.toString()+", Loại đất: "+this.loaiDat;
	}
	
	
	
	
		
	

}

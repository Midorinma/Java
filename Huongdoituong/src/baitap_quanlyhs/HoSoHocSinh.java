package baitap_quanlyhs;

import java.util.Scanner;

public class HoSoHocSinh {
	private String lop;
	private Nguoi nguoi;
	
	
	public HoSoHocSinh() {
		super();
	}

	public void nhapHoSo() {
		Scanner scanner=new Scanner(System.in);
		nguoi=new Nguoi();
		
		nguoi.nhapDoiTuong();
		System.out.print("Lớp: ");
		lop=scanner.nextLine();
	}

	public HoSoHocSinh(String lop, Nguoi nguoi) {
		super();
		this.lop = lop;
		this.nguoi = nguoi;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	
	
	public Nguoi getNguoi() {
		return nguoi;
	}

	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}

	public void hienThiHoSoHocSinh() {
		nguoi.xuatDoiTuong();
		System.out.println("Lớp: "+lop);
	}
	
	

}

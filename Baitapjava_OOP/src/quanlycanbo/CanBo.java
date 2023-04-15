package quanlycanbo;

import java.util.Scanner;

public class CanBo {
	protected String hoTen;
	protected int tuoi;
	protected String gioiTinh;
	protected String diaChi;
	Scanner scanner=new Scanner(System.in);
	
	public CanBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void nhapThongTinCanBo() {
		System.out.print("Họ tên: ");
		hoTen=scanner.nextLine();
		System.out.print("Tuổi: ");
		tuoi=Integer.parseInt(scanner.nextLine());
		System.out.print("giới tính: ");
		gioiTinh=scanner.nextLine();
		System.out.print("Địa chỉ: ");
		diaChi=scanner.nextLine();
	}

	@Override
	public String toString() {
		return "hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi;
	}
	
	

}

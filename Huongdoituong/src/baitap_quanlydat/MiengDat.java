package baitap_quanlydat;

import java.util.Scanner;

public class MiengDat {
	public String maSo;
	private long donGia;
	Scanner scanner=new Scanner(System.in);
	
	public MiengDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MiengDat(String maSo, long donGia) {
		super();
		this.maSo = maSo;
		this.donGia = donGia;
	}

	public long getDonGia() {
		return donGia;
	}

	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}
	
	public long tinhDienTich() {
		return 0;
	}
	
	public long thanhTien() {
		return this.donGia * this.tinhDienTich();
	}
	
	public void nhapThongTinMiengDat() {
		System.out.print("Mã Số: ");
		maSo=scanner.nextLine();
		System.out.print("Đơn giá 1m2: ");
		donGia=scanner.nextLong();
	}

	@Override
	public String toString() {
		return "Mã số: "+this.maSo+", Đơn giá: "+this.donGia+", Diện tích: "+this.tinhDienTich()+", Thành tiền: "+this.thanhTien();
	}
}

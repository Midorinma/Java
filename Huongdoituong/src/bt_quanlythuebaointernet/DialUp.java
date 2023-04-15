package bt_quanlythuebaointernet;

import java.util.Scanner;

public class DialUp extends ThueBao{
	private int khoangThoiGianTruyCap;
	protected static long THUE_BAO_HANG_THANG=30000;
	protected static int DON_GIA_TREN_PHUT=30;
	
	public DialUp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DialUp(int khoangThoiGianTruyCap) {
		super();
		this.khoangThoiGianTruyCap = khoangThoiGianTruyCap;
	}

	/**
	 * @return the khoangThoiGianTruyCap
	 */
	public int getKhoangThoiGianTruyCap() {
		return khoangThoiGianTruyCap;
	}

	/**
	 * @param khoangThoiGianTruyCap the khoangThoiGianTruyCap to set
	 */
	public void setKhoangThoiGianTruyCap(int khoangThoiGianTruyCap) {
		this.khoangThoiGianTruyCap = khoangThoiGianTruyCap;
	}
	
	@Override
	public long tinhTien() {
		// TODO Auto-generated method stub
		return THUE_BAO_HANG_THANG+DON_GIA_TREN_PHUT*this.khoangThoiGianTruyCap;
	}

	@Override
	public String toString() {
		return "Thuê bao Dial Up có thuê bao hằng tháng = "+
	this.THUE_BAO_HANG_THANG+", Đơn giá phút = "+this.DON_GIA_TREN_PHUT+"/phút"+", số phút truy cập = "+this.khoangThoiGianTruyCap
	+", Tổng tiền = "+this.tinhTien();
	}
	
	
	
	

}

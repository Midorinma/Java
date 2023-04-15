package baitap_chuvidientich;

import java.util.Scanner;

public class HinhChuNhat {
	protected int chieuDai,chieuRong;
	

	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhChuNhat(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public int tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }
     
    public int tinhDienTich() {
        return chieuDai * chieuRong;
    }

}

package baitap_quanlynhanvien;

import java.util.Scanner;

public class NhanVien {
	private String ho,ten;
	private int soSP;
	private double donGia,luong;
	
	public NhanVien(String ho, String ten, int soSP) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.soSP = soSP;
		if(this.soSP<0) {
			this.soSP=0;
		}
	}
	
	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSoSP() {
		return soSP;
	}

	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	
	
	
	public double getLuong(int soSP) {
		if (soSP >= 1 && soSP <= 199) {
            donGia = 0.5;
        } else if (soSP >= 200 && soSP <= 399) {
            donGia = 0.55;
        } else if (soSP >= 400 && soSP <= 599) {
            donGia = 0.6;
        } else {
            donGia = 0.65;
        }
        luong = (double) soSP * donGia;
		return luong;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nhanVien=new NhanVien("Nguyen","Binh", 500);
		NhanVien nhanVien2=new NhanVien("Le","Vy", 199);
		
		System.out.println("Tiền lương của nhân viên 1: "+nhanVien.getLuong(nhanVien.getSoSP()));
		System.out.println("Tiền lương của nhân viên 2: "+nhanVien2.getLuong(nhanVien2.getSoSP()));
	
	}

}

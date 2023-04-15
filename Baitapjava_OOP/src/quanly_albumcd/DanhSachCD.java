package quanly_albumcd;

import java.util.Scanner;

public class DanhSachCD {
	CD cd[]=null;
	int kichThuocMang;
	Scanner scanner=new Scanner(System.in);
	
	public void themCD() {
		System.out.print("Nhập vào số lượng CD: ");
		kichThuocMang=scanner.nextInt();
		  cd=new CD[kichThuocMang];
		for(int i=0; i<kichThuocMang; i++) {
			cd[i]=new CD();
			System.out.println("Số CD thứ "+(i+1)+" : ");
			System.out.print("maCD: ");
			cd[i].setMaCD(scanner.nextInt());scanner.nextLine();
			System.out.print("TuaCD: ");
			cd[i].setTuaCD(scanner.nextLine());
			System.out.print("Ca sĩ: ");
			cd[i].setCaSi(scanner.nextLine());
			System.out.print("Số bài hát: ");
			cd[i].setSoBaiHat(scanner.nextInt());
			System.out.println("Gía thành: ");
			cd[i].setGiaThanh(scanner.nextDouble());
		}
	}
	
	public int tongCD() {
		int tong=0;
		for(int i=0; i<cd.length; i++) {
			cd[i].getMaCD();
			tong++;
		}
		return tong;
	}
	
	public double tongGiaThanh() {
		double tong=0;
		for(int i=0; i<cd.length; i++) {
			tong+=cd[i].getGiaThanh();
		}
		return tong;
	}
	
	//sắp xếp giảm dần theo giá thành
	public void sapXepGiamDan() {
		CD dia=cd[0];
		for(int i=0; i<cd.length-1; i++) {
			for(int j=i+1; j<cd.length; j++) {
				if(cd[i].getGiaThanh()<cd[j].getGiaThanh()) {
					dia=cd[i];
					cd[i]=cd[j];
					cd[j]=dia;
				}
			}
		}
		for(int j=0; j<cd.length; j++) {
			cd[j].outPut();
		}
	}
	
	//Sắp xếp danh sách tăng dần theo tựa CD
	public void sapXepTangDan() {
		CD temp=cd[0];
		for(int i=0; i<cd.length-1; i++) {
			for(int j=i+1; j<cd.length; j++) {
				if(cd[i].getTuaCD().compareTo(cd[j].getTuaCD())>0) {
					temp=cd[j];
					cd[j]=cd[i];
					cd[i]=temp;
				}
			}
		}
		
		for(int j=0; j<cd.length; j++) {
			cd[j].outPut();
		}
	}
	
	public void hienThiDS() {
		for(int i=0; i<cd.length; i++) {
			cd[i].outPut();
		}
	}

}

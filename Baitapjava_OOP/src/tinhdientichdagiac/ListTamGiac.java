package tinhdientichdagiac;

import java.util.Scanner;

public class ListTamGiac {
	private int n;
	private TamGiac list[]=new TamGiac[100];
	Scanner scanner=new Scanner(System.in);
	
	public void listTG() {
		for(int i=0; i<100; i++) {
			list[i]=new TamGiac();
		}
	}
	
	public void list() {
		System.out.print("Nhập số tam giác: ");
		n=scanner.nextInt();
		for(int i=0; i<n; i++) {
			TamGiac tg=new TamGiac();
			tg.nhapThongTinTamGiac();
			list[i]=tg;
		}
	}
	
	public void xuat() {
		for(int i=0; i<n; i++) {
			System.out.println("Tam giác thứ "+(i+1)+" : ");
			list[i].xuatDaGiac();
		}
	}
	
	public void xuatLN() {
		double max=list[0].tinhDienTich();
		int Max=0;
		for(int i=0; i<n; i++) {
			if(list[i].tinhDienTich()>max) {
				max=list[i].tinhDienTich();
				Max=i;
			}
		}
		System.out.println("Lớn nhất: ");
		list[Max].xuatDaGiac();
	}
	
	public void timKiem() {
		System.out.println("Nhập vị trí tam giác cần tìm kiếm: ");
		int t=scanner.nextInt();
		if(t>n) {
			System.out.println("Vị trí không tồn tại.");
		}
		else {
			list[t-1].xuatDaGiac();
		}
	}
	
	public void xoa() {
		int k=0;
		System.out.print("Nhập vào vị trí của tam giác cần xóa: ");
		int x=scanner.nextInt();
		if(x>n) {
			System.out.println("Vị trí không tồn tại!");
		}else {
			for(int i=0; i<n; i++) {
				if(i!=(x-1)) {
					list[k]=list[i];
					k++;
				}
			}
		}
		n=k;
	}
	
	public void sapXep() {
		TamGiac temp=list[0];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(list[i].tinhDienTich()>list[j].tinhDienTich()) {
					temp=list[j];
					list[j]=list[i];
					list[i]=temp;
				}
			}
		}
	}

}

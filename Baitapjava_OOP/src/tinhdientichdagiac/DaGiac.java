package tinhdientichdagiac;

import java.util.Arrays;
import java.util.Scanner;

public class DaGiac {
	protected int soCanh;
	protected int a[];
	Scanner scanner=new Scanner(System.in);
	
	public DaGiac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DaGiac(int soCanh, int[] a) {
		super();
		this.soCanh = soCanh;
		this.a = a;
	}

	public int getSoCanh() {
		return soCanh;
	}

	public void setSoCanh(int soCanh) {
		this.soCanh = soCanh;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}
	
	//Khởi tạo phương thức nhập
	public void nhapThongTinHinhHoc() {
		do {
			System.out.print("Nhập vào số cạnh đa giác: ");
			soCanh=scanner.nextInt();
		}while(this.soCanh<3);
		
		System.out.print("Nhập vào kích thước các cạnh: ");
		for(int i=0; i<this.soCanh; i++) {
			System.out.println("Nhập kích thước cạnh thứ: "+(i+1)+" : ");
			a[i]=scanner.nextInt();
		}
	}
	
	//Khởi tạo phương thức tính chu vi
	protected int  tinhCV() {
		int cv=0;
		for(int i=0; i<this.soCanh; i++) {
			cv+=this.a[i];
		}
		return cv;
	}
	
	//Khởi tạo phương thức xuất đa giác
	protected void xuatDaGiac() {
		System.out.println("Độ dài các cạnh lần lượt là: ");
		for(int i=0; i<this.soCanh; i++) {
			if(i<(this.soCanh-1)) {
				System.out.print(this.a[i]+"\t\t");
			}else {
				System.out.print(this.a[i]);
			}
		}
		System.out.println();
		System.out.println("-------------------End----------------------");
	}

	@Override
	public String toString() {
		return "DaGiac [soCanh=" + soCanh + ", a=" + Arrays.toString(a) + "]";
	}
	
	

}

package baitap_vehinhdongian2;

import java.util.Scanner;

public class Rectangle extends Shape{
	private int chieuDai,chieuRong;
	Scanner scanner=new Scanner(System.in);

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int chieuDai, int chieuRong) {
		super();
		if(chieuDai<1 || chieuDai>15) {
			System.out.println("Gía trị nhập phải nằm trong đoạn [1-15]!");
			return;
		}
		else if(chieuRong<1 ||  chieuRong>15) {
			System.out.println("Gía trị nhập phải nằm trong đoạn [1-15]!");
			return;
		}
		else if(chieuDai<chieuRong) {
			System.out.println("Chiều dài phải lớn hơn chiều rộng!");
			return;
		}
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		
		this.chieuRong = chieuRong;
	}
	
	public void draw() {
		for(int i=1; i<=chieuRong; i++) {
			for(int j=1; j<=chieuDai; j++) {
				if((i==1 || i==chieuRong) || (j==1 || j==chieuDai)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	
	

}

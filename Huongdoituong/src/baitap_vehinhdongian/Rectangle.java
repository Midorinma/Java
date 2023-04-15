package baitap_vehinhdongian;

import java.util.Scanner;

public class Rectangle extends Shaper{
	protected int chieuDai,chieuRong;
	Scanner scanner=new Scanner(System.in);

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int chieuDai, int chieuRong) {
		super();
		if ((chieuDai < 1) || (chieuDai > 15)) {
            System.out.println("Giá trị của chiều dài phải nằm trong khoảng [1...15]");
            return;
        }
         
        if (chieuDai < chieuRong) {
            System.out.println("Chiều dài phải lớn hơn chiều rộng");
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
		 if ((chieuRong) < 1 || (chieuRong > 15)) {
	            System.out.println("Giá trị của chiều rộng phải nằm trong khoảng [1...15]");
	        }
		this.chieuRong = chieuRong;
	}
	
	public void draw() {
		//Vẽ chiều rộng
		for(int i=1; i<=chieuRong; i++) {
			//Vẽ chiều dài
			for(int j=1; j<=chieuDai; j++) {
				if((j == 1) || (j == chieuDai) || (i == 1) || (i == chieuRong)) {
					 System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
	}
	
	

}

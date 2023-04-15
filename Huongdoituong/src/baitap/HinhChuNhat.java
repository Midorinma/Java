package baitap;

import java.util.Scanner;

public class HinhChuNhat {
	//Thuộc tính hình chữ nhật
	public float chieuDai,chieuRong;
	protected float cv=0.0f,dt=0.0f;
	//Phương thức hình chữ nhật
	protected void nhap() {
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.print("Chiều dài hinh chữ nhật: ");
			chieuDai=scanner.nextFloat();
			System.out.print("Chiều rộng hình chữ nhật: ");
			chieuRong=scanner.nextFloat();
			if(chieuRong>chieuDai) {
				System.out.println("Chiều rộng phải nhỏ hơn chiều dài.");
			}
		}while(chieuRong>chieuDai);
	}
	
	public  void hienThi(float chieuDai, float chieuRong) {
		System.out.println("Chiều dài: "+chieuDai);
		System.out.println("Chiều rộng: "+chieuRong);
	}
	
	public float chuVi(float cv) {
		cv=(chieuDai+chieuRong)*2;
		return cv;
	}
	
	public float dienTich(float dt) {
		dt=chieuDai*chieuRong;
		return dt;
	}
	
	void ketQua(float cv, float dt) {
		System.out.println("Chu vi hcn: "+chuVi(cv));
		System.out.println("Diện tích hcn: "+dienTich(dt));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}

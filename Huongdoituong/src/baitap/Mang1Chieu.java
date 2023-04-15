package baitap;

import java.util.Scanner;

public class Mang1Chieu {
	//Khởi tạo và cấp phát bộ nhớ cho mảng
	static int mang[]=new int[5];
	static Scanner scanner=new Scanner(System.in);
	
	public void nhapM() {
		for(int i=0; i<mang.length; i++) {
			System.out.print("a["+i+"]= ");
			mang[i]=scanner.nextInt();
		}
	}
	
	public void xuatM() {
		for(int i=0; i<mang.length; i++) {
			System.out.print(mang[i]+"\t");
		}
	}
	
	public void timMaxMin() {
		int max=mang[0];
		int min=mang[0];
		for(int i=0; i<mang.length; i++) {
			if(mang[i]>max) {
				max=mang[i];
			}
			else if(mang[i]<min) {
				min=mang[i];
			}
		}
		System.out.println("MAX: "+max);
		System.out.println("MIN: "+min);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mang1Chieu mang1Chieu=new Mang1Chieu();
		
		mang1Chieu.nhapM();
		System.out.println("Mảng 1 chiều: ");
		mang1Chieu.xuatM();
		
		System.out.println();
		
		mang1Chieu.timMaxMin();
		
		
		
		


	}

}

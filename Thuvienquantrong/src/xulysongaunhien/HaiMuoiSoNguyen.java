package xulysongaunhien;

import java.util.Random;

public class HaiMuoiSoNguyen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		int a[]=new int[20];
		int tong=0;
		//In ra 20 số ngẫu nhiên
		for(int i=0; i<20; i++) {
			a[i]=rd.nextInt(101);
			System.out.println((i+1)+"-số nguyên ngẫu nhiên trong đoạn từ [0-100]: "+a[i]);
		}
		
		//Số chẳn lẽ, tính tổng
		System.out.println("Các số chẵn: ");
		for(int i=0; i<20; i++) {
			tong+=a[i];
			if(a[i]%2==0) {
				System.out.print(a[i]+"\t");
			}
		}
		System.out.println();
	
		System.out.println("Các số lẽ: ");
		for(int i=0; i<20; i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+"\t");
			}
		}
		System.out.println();
		System.out.println("Tổng của 20 số random= "+tong);

	}

}

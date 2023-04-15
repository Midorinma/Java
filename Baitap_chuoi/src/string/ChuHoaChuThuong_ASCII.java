package string;

import java.util.Scanner;

public class ChuHoaChuThuong_ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		//Khai báo mảng kiểu char để chuyển từ kiểu chuỗi sang kiểu mảng
		//chuyển về mảng để duyệt vòng lặp
		char mang[]=chuoi.toCharArray();
		
		for(int i=0; i<mang.length; i++) {
			if(mang[i]>=65 && mang[i]<=90) {
				mang[i]+=32;
			}
		}
		//chuyển từ mảng về chuỗi và xuất ra
		chuoi=String.valueOf(mang);
		System.out.println("Kí tự thường tương ứng: "+chuoi);

	}

}

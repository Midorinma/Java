package string;

import java.util.Scanner;

public class InHoaKiTuDau_MoiChu {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		System.out.println("Nhập vào một chuỗi cần in hoa kí tự đầu: ");
		chuoi=scanner.nextLine();
		/*
		 * Khai báo một mảng sau đó sử dụng phương thức toCharArray()
		 * để chuyển đổi chuỗi thành một mảng kiểu char
		 */
		char mang[]=chuoi.toCharArray();
		Boolean kt=true;
		for(int i=0; i<mang.length; i++) {
			//Nếu phần tử trong mảng là một chữ cái
			if(Character.isLetter(mang[i])) {
				// kiểm tra khoảng trắng có trước chữ cái
				if(kt) {
					//đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
					mang[i]=Character.toUpperCase(mang[i]);
					kt=false;
				}
			}
			else {
				kt=true;
			}
		}
		//Chuyển đổi mảng char thành string
		chuoi=String.valueOf(mang);
		System.out.println("Chuỗi sau khi đổi: "+chuoi);
	
		

	}

}

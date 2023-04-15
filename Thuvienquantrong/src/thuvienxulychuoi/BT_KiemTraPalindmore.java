package thuvienxulychuoi;

import java.util.Scanner;

public class BT_KiemTraPalindmore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		String chuoi;
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		
		StringBuilder stringBuilder=new StringBuilder(chuoi);
		
		 // tạo 1 StringBuilder chứa các ký tự được khai báo trong stringBuilder
		StringBuilder stringBuilder2=new StringBuilder(stringBuilder);
		stringBuilder2.reverse();
		
		// nếu stringBuilder giống stringBuilder1 sau khi đảo ngược
	    // thì chuỗi nhập vào là chuỗi Palindmore
	    // ngược lại không là chuỗi Palindmore
		
		if(stringBuilder.toString().equals(stringBuilder2.toString())) {
			System.out.println(chuoi+" Là chuỗi Palindmore.");
		}else {
			System.out.println(chuoi+" Không là chuỗi Palindmore.");
		}
		

	}

}

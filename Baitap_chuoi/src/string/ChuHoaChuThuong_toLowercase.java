package string;

import java.util.Scanner;

public class ChuHoaChuThuong_toLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		
		System.out.println("Chuỗi thường tương ứng: "+chuoi.toLowerCase());

	}
}

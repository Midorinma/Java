package string;

import java.util.Scanner;

public class ChuThuongChuHoa_ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		System.out.println("Nhập vào một chuỗi cần chuyển đổi: ");
		chuoi=scanner.nextLine();
		//Chuyển đổi chuỗi  thành mảng array để duyệt vòng lặp for
		//khởi tạo mảng cần chuyển rồi sử dụng phương thức tocharArray
		char mang[]=chuoi.toCharArray();
		
		for(int i=0; i<mang.length; i++) {
			if(mang[i]>=97 && mang[i]<=122) {
				mang[i]-=32;
			}
		}
		//Chuyển đổi mảng char thành string
		chuoi=String.valueOf(mang);
		System.out.println("Chữ hoa tương ứng: "+chuoi);

	}

}

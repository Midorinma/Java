package thuvienxulychuoi;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BT_CacTuVietTat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		StringTokenizer stringTokenizer=new StringTokenizer(chuoi," ");
		System.out.println("Các từ viết tắt là: ");
		while(stringTokenizer.hasMoreTokens()) {
			// lấy lần lượt từng token trong stringTokenizer
			String kiTuDau=stringTokenizer.nextToken();
			 // chuyển kiTuDau thành 1 mảng các ký tự in hoa
			char ch[]=kiTuDau.toUpperCase().toCharArray();
			// hiển thị ký tự đầu tiên của từng từ trong mảng
			System.out.print(ch[0]);
		}

	}

}

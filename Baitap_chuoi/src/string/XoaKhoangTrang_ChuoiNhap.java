package string;

import java.util.Scanner;

public class XoaKhoangTrang_ChuoiNhap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		System.out.println("Nhập chuỗi cần xóa khoảng trắng: ");
		chuoi=scanner.nextLine();
		System.out.println("Chuỗi sau khi xóa khoảng trắng: ");
		System.out.println(chuoi.replaceAll(" ", ""));
		
	

	}

}

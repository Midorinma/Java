package thuvienxulychuoi;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MaNganhMaKhoaSTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String maSinhVien;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Nhập mã số sinh viên (XXX - YY - ZZ): ");
		maSinhVien=scanner.nextLine();
		
		//Tách theo kí tự "-"
		StringTokenizer stringTokenizer=new StringTokenizer(maSinhVien," - ");
		
		//hiển thị mã ngành ,khóa và số thứ tự
		while(stringTokenizer.hasMoreElements()) {
			System.out.print("Mã ngành: ");
			System.out.println(stringTokenizer.nextElement());
			System.out.print("Khóa: ");
			System.out.println(stringTokenizer.nextElement());
			System.out.print("Số thứ tự: ");
			System.out.println(stringTokenizer.nextElement());
		}

	}

}

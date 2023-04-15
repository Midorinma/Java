package toan_tu;
import java.util.Scanner;
public class ThongTinSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khai báo
		String hoTen,diaChi;
		int namSinh;
		//Nhập
		System.out.println("Họ và tên SV: ");
		hoTen=scanner.nextLine();
		
		System.out.println("Năm sinh: ");
		/*
		 * Sử dụng Integer.parseInt() để khắc phục hiện tượng trôi lệnh
		 * Integer.parseInt() sẽ chuyển dữ liệu kiểu (string) về dạng số (Integer)
		 */
		namSinh=Integer.parseInt(scanner.nextLine());
		
		System.out.println("Địa chỉ: ");
		diaChi=scanner.nextLine();
		System.out.println("\n");
		//Xuat
		System.out.println("Tên SV: "+hoTen);
		System.out.println("Năm sinh: "+namSinh);
		System.out.println("Địa chỉ: "+diaChi);
		
		

	}

}

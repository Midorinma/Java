package baitap_quanlyks;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;	//Số khách trọ
		KhachSan ks;
		
		//Tạo 1 arraylist lưu thông tin khách trọ
		ArrayList<KhachSan> arrKhachSan= new ArrayList<>();
		
		System.out.println("Nhập số lượng khách trọ: ");
		n=Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<n; i++) {
			ks=new KhachSan();
			System.out.println("Nhập thông tin khách hàng thứ "+(i+1)+" : ");
			ks.nhapThongTinCanQuanLy();
			arrKhachSan.add(ks);
		}
		
		//Hiển thị danh sách khách trọ
		for(int i=0; i<arrKhachSan.size(); i++) {
			System.out.println("Thông tin khách hàng thứ "+(i+1)+" : ");
			arrKhachSan.get(i).hienThiThongTinCanQuanLy();
			System.out.println();
		}
		
		// tính tiền phòng khi khách hàng trả phòng
		System.out.println("\nNhập số chứng minh nhân dân của khách trả phòng: ");
		String tim=scanner.nextLine();
		for(int i=0; i<arrKhachSan.size(); i++) {
			if(arrKhachSan.get(i).getNguoi().getSoCMND().equalsIgnoreCase(tim)) {
				System.out.println("Số tiền phòng= "+arrKhachSan.get(i).tinhTien());
			}
		}

	}

}

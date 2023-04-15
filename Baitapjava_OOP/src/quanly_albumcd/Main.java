package quanly_albumcd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DanhSachCD dscd=new DanhSachCD();
		int chon;
		boolean kt=true;
		boolean th=true;
		
		do {
			System.out.println("--------------------MENU--------------------");
			System.out.println("1.Thêm 1CD vào danh sách.");
			System.out.println("2.Tính số lượng CD có trong danh sách.");
			System.out.println("3.Tính tổng giá thành của các CD.");
			System.out.println("4.Sắp xếp danh sách giảm dần theo giá thành.");
			System.out.println("5.Sắp xếp danh sách tăng dần theo tựa CD.");
			System.out.println("6.Xuất toàn bộ danh sách.");
			System.out.println("Chọn bất kì số nào để thoát.");
			System.out.print("Bạn chọn: ");
			chon=scanner.nextInt();
			switch(chon) {
			case 1:
				dscd.themCD();
				break;
			case 2:
				System.out.println("Tổng số lượng CD: "+dscd.tongCD());
				break;
			case 3:
				System.out.println("Tổng giá thành CD: "+dscd.tongGiaThanh());	
				break;
			case 4:
				dscd.sapXepGiamDan();
				break;
			case 5:
				dscd.sapXepTangDan();
				break;
			case 6:
				dscd.hienThiDS();
				break;
			default:
				System.out.println("EXIT");
				th=false;
				break;
				
			}
		}while(th);

	}

}

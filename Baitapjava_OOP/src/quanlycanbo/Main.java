package quanlycanbo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon,soLuongCanBo;
		int q=0;
		boolean check=true;
		Scanner scanner=new Scanner(System.in);
		QuanLyCanBo qlcb=new QuanLyCanBo();
		CanBo canBo;
		
		do {
			System.out.println("---------------Danh sách Cán Bộ--------------------");
			System.out.println("1.Thêm mới cán bộ.");
			System.out.println("2.Tìm kiếm theo họ tên.");
			System.out.println("3.Hiển thị thông tin về danh sách các cán bộ.");
			System.out.println("4.Exit.");
			System.out.print("Bạn chọn? ");
			chon=scanner.nextInt();
			switch(chon) {
			case 1:
				System.out.print("Nhập vào số lượng cán bộ:");
				soLuongCanBo=scanner.nextInt();
				scanner.nextLine();
				do {
					
					String ch;
					System.out.println("\n-----------------Cán bộ các cấp------------------");
					System.out.println("a.Công nhân.");
					System.out.println("b.Kĩ sư.");
					System.out.println("c.Nhân viên.");
					System.out.print("Bạn chọn?");
					ch=scanner.nextLine();
					switch(ch) {
					case "a":
						canBo=new CongNhan();
						canBo.nhapThongTinCanBo();
						qlcb.them(canBo);
						break;
					case "b":
						canBo=new KiSu();
						canBo.nhapThongTinCanBo();
						qlcb.them(canBo);
						break;
					case "c":
						canBo=new NhanVien();
						canBo.nhapThongTinCanBo();
						qlcb.them(canBo);
						break;
					default:
						System.out.println("Nhập sai rồi!");
						soLuongCanBo+=1;
					}
					q++;
				}while(q<soLuongCanBo);
				break;
			
			case 2:
				qlcb.timKiem();
				break;
			case 3:
				qlcb.hienThi();
				break;
			case 4:
				System.out.println("Tạm biệt!");
				check=false;
				break;
			default:
				System.out.println("Số bạn nhập không có trong danh sách! yêu cầu nhập lại.");
				
			}
			
		}while(check);

	}

}

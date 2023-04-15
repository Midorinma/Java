package quanlythuvien;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t=true;
		boolean f=true;
		int chon;
		String taiLieu;
		int to=0,from;
		Scanner scanner=new Scanner(System.in);
		Document document;
		ManagementDocument managementDocument=new ManagementDocument();
		do {
			System.out.println("\n-----------------> Quản lý sách <--------------------");
			System.out.println("1.Thêm mới tài liệu.");
			System.out.println("2.Xóa tài liệu theo mã tài liệu.");
			System.out.println("3.Hiển thị thông tin về tài liệu.");
			System.out.println("4.Tìm kiếm tài liệu theo loại.");
			System.out.println("Nhập bất kì số nào để thoát khỏi chương trình.");
			System.out.print("Bạn chọn: ");
			chon=scanner.nextInt();scanner.nextLine();
			switch(chon) {
			case 1:
				System.out.print("Nhập số tài liệu cần thêm: ");
				from=scanner.nextInt();scanner.nextLine();
				do {
					System.out.println("----------> Tài liệu <-----------");
					System.out.println("a.Book;");
					System.out.println("b.Magazine;");
					System.out.println("c.Newspaper;");
					System.out.print("Bạn chọn: ");
					taiLieu=scanner.nextLine();
					switch(taiLieu) {
					case "a":
						document=new KindOfBook();
						document.nhapThongTinTaiLieu();
						managementDocument.themMoiTaiLieu(document);
						break;
					case "b":
						document=new Magazine();
						document.nhapThongTinTaiLieu();
						managementDocument.themMoiTaiLieu(document);
						break;
					case "c":
						document=new Newspaper();
						document.nhapThongTinTaiLieu();
						managementDocument.themMoiTaiLieu(document);
						break;
					default:
						System.out.println("Kí tự nhập không có trong danh sách.Yêu cầu nhập lại!");
						from++;
					}
					to++;
				}while(to<from);
				break;
			case 2:
				managementDocument.xoaTaiLieu();
				break;
			case 3:
				managementDocument.hienThi();
				break;
			case 4:
				String loai;
				System.out.println("---------------Loại tài liệu----------------");
				System.out.println("enter:Sách");
				System.out.println("enter:Tạp chí");
				System.out.println("enter:Báo");
				System.out.print("Nhập vào loại tài liệu bạn muốn tìm: ");
				loai=scanner.nextLine();
				if(loai.equalsIgnoreCase("Sách")) {
					managementDocument.timKiemTheoSach();
				}
				else if(loai.equalsIgnoreCase("Tạp chí")) {
					managementDocument.timKiemTheoTapChi();
				}
				else if(loai.equalsIgnoreCase("Báo")) {
					managementDocument.timKiemTheoBao();
				}
					break;
			default:
				System.out.println("Goodbye!");
				t=false;
				break;
			}
		}while(t);

	}

}

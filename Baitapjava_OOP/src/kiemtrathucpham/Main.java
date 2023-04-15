package kiemtrathucpham;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ThucPham tp=new ThucPham();
		boolean kt=true;
		boolean th=true;
		
		System.out.print("Nhập mã hàng: ");
		tp.setMaHang(scanner.nextInt());
		scanner.nextLine();
		
		do {
			System.out.print("Nhập tên hàng: ");
			tp.setTenHang(scanner.nextLine());
		}while(tp.kiemTraTenHang(kt));
		
		System.out.print("Nhập đơn giá: ");
		tp.setDonGia(scanner.nextDouble());
		
		do {
			System.out.println("Nhập ngày sản xuất(nam/thang/ngay): ");
			tp.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
			System.out.print("Nhập hạn sử dụng(nam/thang/ngay): ");
			tp.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
			
		}while(tp.kiemTraNgay(th));
		
		System.out.println(tp);
		tp.kiemTraHanSuDung();

	}

}

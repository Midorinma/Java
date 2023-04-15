package xulydulieuso;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TinhTienLuong {

	public static void main(String[] args) {
		/*
		 * Viết chương trình tính tiền lương của 1 người trong 1 
		 * tháng sau khi đã trừ đi các khoản thuế thu nhập cá nhân.
		 */
		final double phanTramThue=0.15d;
		long tienLuongNhan;
		double tienLuongThucTe,thueThuNhap;
		
		Scanner scanner=new Scanner(System.in);
		
		// định dạng số ở dạng tiền tệ sử dụng DecimalFormat
		//Với cách định dạng này thì phần nghàn sẽ được phân cách nhau bằng dấu phẩy
		//và phần thập phân sẽ bao gồm hai số 0
		DecimalFormat currency=new DecimalFormat("$#,###,##0.00");
		System.out.println("Nhập tiền lương hàng tháng: ");
		tienLuongNhan=scanner.nextLong();
		
		//Tính thuế thu nhập =15% lương được nhận
		thueThuNhap=tienLuongNhan*0.15;
		
		//tiền lương thực tế sau khi đóng thuế = tiền lương nhận - thuế thu nhập
		tienLuongThucTe=tienLuongNhan-thueThuNhap;
		
		System.out.println("Tiền lương còn lại sau khi đóng thuế thu nhập: "+currency.format(thueThuNhap)+" = "+currency.format(tienLuongThucTe));
		

	}

}

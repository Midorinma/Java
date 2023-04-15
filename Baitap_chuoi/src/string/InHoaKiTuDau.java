package string;
import java.util.Scanner;
public class InHoaKiTuDau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kiTuDau="xin chào bạn!";
		System.out.println("chuỗi ban đầu: "+kiTuDau);
		/*
		 * dùng subtring để tách kí tự 'x' trong chuổi thứ 0 lấy 1 kí tự
		 */
		String kiTu1=kiTuDau.substring(0,1);
		//dùng substring tách chuỗi còn lại begin
		String kiTu2=kiTuDau.substring(1);
		//in hoa kí tự đầu rồi
		//dùng toán tử + để gộp hai chuỗi con lại với nhau
		kiTu1=kiTu1.toUpperCase();
		kiTuDau=kiTu1+kiTu2;
		System.out.println("Chuỗi kí tự sau khi chuyển đổi: "+kiTuDau);
	
		
		

	}

}

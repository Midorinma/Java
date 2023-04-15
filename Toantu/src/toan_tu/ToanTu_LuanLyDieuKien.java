package toan_tu;
import java.util.Scanner;
public class ToanTu_LuanLyDieuKien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int so1,so2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập số thứ 1: ");
		so1=scanner.nextInt();
		System.out.println("Nhập số thứ 2: ");
		so2=scanner.nextInt();
		//sử dụng toán tử luận lý điều kiện
		System.out.println("Kết quả của điều kiện ( so1 < 10 ) && ( so2 < 10) là: "+((so1<10)&&(so2<10)));//TOAN TU AND
		System.out.println("Kết quả của điều kiện ( so1 < 10 ) || ( so2 < 10 ) là: "+((so1<10)||(so2<10)));//TOAN TU OR
		
	}
}

package baitap;
import java.util.Scanner;
public class NhanSoNguyen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int so1,so2,so3;
		System.out.println("Nhập vào số thứ 1: ");
		so1=scanner.nextInt();
		System.out.println("Nhập vào số thứ 2: ");
		so2=scanner.nextInt();
		so3=so1*so2;
		System.out.println(so1+" * "+so2+" = "+so3);

	}

}

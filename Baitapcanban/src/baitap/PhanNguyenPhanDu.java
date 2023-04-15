package baitap;
import java.util.Scanner;
public class PhanNguyenPhanDu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int phanNguyen,phanDu;
		int soChia,soBiChia;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập vào số bị chia: ");
		soBiChia=scanner.nextInt();
		System.out.println("Nhập vào số chia: ");
		soChia=scanner.nextInt();
		phanNguyen=soBiChia/soChia;
		phanDu=soBiChia%soChia;
		System.out.println(soBiChia+"/"+soChia+" có phần nguyên: "+phanNguyen+" phần dư: "+phanDu);
		

	}

}


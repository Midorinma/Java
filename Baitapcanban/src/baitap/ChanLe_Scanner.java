package baitap;
import java.util.Scanner;
public class ChanLe_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int soNhap;
		System.out.println("Nhập vào một số: ");
		soNhap=scanner.nextInt();
		if(soNhap%2==0) {
			System.out.println(soNhap+" là số chẵn.");
		}else {
			System.out.println(soNhap+" là số lẻ.");
		}
	}

}

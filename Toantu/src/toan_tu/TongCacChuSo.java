package toan_tu;
import java.util.Scanner;
public class TongCacChuSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int soNguyen,sum=0;
		System.out.println("Nhập vào một số nguyên: ");
		soNguyen=scanner.nextInt();
		while(soNguyen>0) {
			sum+=soNguyen%10;
			soNguyen/=10;
		}
		System.out.println("Tổng các số nguyên: "+sum);

	}

}

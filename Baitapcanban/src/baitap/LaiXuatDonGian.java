package baitap;
import java.util.Scanner;
public class LaiXuatDonGian {
	public static void laixuat(double p, float r, int t) {
		double lx=(p*r*t)/100;
		System.out.println("Lãi xuất đơn giản vào "+t+" năm: "+lx);
	}

	public static void main(String[] args) {
		LaiXuatDonGian imp=new LaiXuatDonGian();
		Scanner scanner=new Scanner(System.in);
		double p;
		float r;
		int t;
		System.out.println("Nhập vào số tiền gửi: ");
		p=scanner.nextDouble();
		System.out.println("Nhập vào lãi xuất (%): ");
		r=scanner.nextFloat();
		System.out.println("Nhập vào thời gian gửi(tính bằng năm): ");
		t=scanner.nextInt();
		imp.laixuat(p, r, t);
	}

}

package vonglapfor;
import java.util.Scanner;
import java.text.DecimalFormat;
public class TrungBinhCong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat decimalFormat=new DecimalFormat("#.##");
		int n,soNguyen,sum=0;
		float trungBinh=0;
		System.out.println("Nhập vào n số nguyên: ");
		n=scanner.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Số nguyên thứ "+i+" : ");
			soNguyen=scanner.nextInt();
			sum+=soNguyen;
			trungBinh=(float)sum/(i+1);
		}
		System.out.println("Trung bình cộng của "+n+" số nguyên: "+decimalFormat.format(trungBinh));

	}

}

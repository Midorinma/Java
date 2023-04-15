package vonglapfor;
import java.util.Scanner;
import java.text.DecimalFormat;
public class GiaTriBieuThuc9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat decimalFormat=new DecimalFormat("#.##");
		int n,giaiThua=1;
		float k=0;
		do {
			System.out.println("n: ");
			n=scanner.nextInt();
			if(n<0) {
				System.out.println("Nhập sai!(n>0).");
			}
		}while(n<0);
		for(int i=1; i<=n; i++) {
			giaiThua=giaiThua*i;
			k+=(float)1/giaiThua;
		}
		System.out.println("Kết quả: "+decimalFormat.format(k));

	}

}

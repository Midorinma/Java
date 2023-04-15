package vonglapfor;
import java.util.Scanner;
import java.text.DecimalFormat;
public class GiaTriBieuThuc10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat decimalFormat=new DecimalFormat("#.##");
		int n=0,sum=0;
		float giaiThua=1,k=0;
		do {
			System.out.println("n: ");
			n=scanner.nextInt();
			if(n<0) {
				System.out.println("Nhập sai! mời nhập lại.");
			}
		}while(n<0);
		for(int i=1; i<=n; i++) {
			sum+=i;
			giaiThua*=i;
			k+=(float)sum/giaiThua;
		}
		System.out.println("Kết quả: "+decimalFormat.format(k));

	}

}

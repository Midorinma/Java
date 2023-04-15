package vonglapfor;
import java.util.Scanner;
public class GiaTriBieuThuc7 {

	public static void main(String[] args) {
		//Tính giá trị của biểu thức R = 1 + 2^2 + 3^3 + ... + n^n (n > 0).
		Scanner scanner=new Scanner(System.in);
		int n,sum=0;
		do {
			System.out.println("n: ");
			n=scanner.nextInt();
			if(n<=0) {
				System.out.println("n phái lớn hơn hoặc băng 0!");
			}
		}while(n<=0);
		
		for(int i=1; i<=n; i++) {
			int temp=1;
			for(int j=1; j<=i; j++) {
				temp*=i;
			}
			sum+=temp;
		}
		System.out.println("Kết quả: "+sum);
	}

}

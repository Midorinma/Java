package vonglapfor;
import java.util.Scanner;
public class GiaTriBieuThuc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n,sum=0;
		do {
			System.out.println("n= ");
			n=scanner.nextInt();
			if(n<0) {
				System.out.println("Nhập sai! yêu cầu nhập lại.");
			}
		}while(n<=0);
		for(int i=1; i<=n; i++) {
			sum+=i*i;
		}
		System.out.println("Kết quả "+sum);

	}

}

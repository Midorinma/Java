package vonglapfor;
import java.util.Scanner;
public class GiaTriBieuThuc4 {

	public static void main(String[] args) {
		//  Tính giá trị của biểu thức S = 1 + 1.2 + 1.2.3 + ... + 1.2.3.n (n > 0).
		Scanner scanner=new Scanner(System.in);
		int n,sum=0,nhan=1;
		do {
			System.out.println("n: ");
			n=scanner.nextInt();
			if(n<0) {
				System.out.println("Nhập sai! xin mời nhập lại.");
			}
		}while(n<0);
		
			for(int j=1; j<=n; j++) {
				nhan*=j;
				sum+=nhan;
			}
		
		System.out.println("Kết quả: "+sum);
	}

}

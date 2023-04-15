package vonglapfor;
import java.util.Scanner;
public class GiaTriBieuThuc3 {

	public static void main(String[] args) {
		// Tính giá trị của biểu thức S = 1 - 2 + 3 - 4 + 5 + ... + ((-1)^(n+1)) * n (n > 0).
		Scanner scanner=new Scanner(System.in);
		int n,sum=0;
		do {
			System.out.println("n: ");
			n=scanner.nextInt();
			if(n<0) {
				System.out.println("Nhập sai! yêu cầu nhập lại.");
			}
		}while(n<0);
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				sum-=i;
			}else {
				sum+=i;
			}
		}
		System.out.println("Tổng "+sum);

	}

}

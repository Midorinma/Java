package vonglapfor;
import java.util.Scanner;
public class GiaTriBieuThuc2 {

	public static void main(String[] args) {
		//Tính giá trị của biểu thức S = 1 + 3 + 5 + n + ... + (2n + 1) (n >= 0).
		Scanner scanner=new Scanner(System.in);
		int n,sum=0;
		do {
			System.out.println("n: ");
			n=scanner.nextInt();
			if(n<0) {
				System.out.println("Nhập sai! yêu cầu nhập lại.");
			}
		}while(n<0);
		for(int i=0; i<=n; i++) {
			sum+=(2*i+1);
		}
		System.out.println("Tổng: "+sum);

	}

}

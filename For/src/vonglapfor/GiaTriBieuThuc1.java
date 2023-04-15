package vonglapfor;
import java.util.Scanner;
public class GiaTriBieuThuc1 {

	public static void main(String[] args) {
		//Tính giá trị của biểu thức P = 1.3.5...(2n+1) với n >= 0.
		Scanner scanner=new Scanner(System.in);
		int n,p=1;
		do {
			System.out.println("n: ");
			n=scanner.nextInt();
			if(n<0) {
				System.out.println("Nhập sai! yêu cầu nhập lại.");
				System.out.println("n phải lớn hơn 0");
			}
		}while(n<0);
		for(int i=1; i<=2*n+1; i+=2) {
			p*=i;
		}
		System.out.println("Kết quả: "+p);

	}

}

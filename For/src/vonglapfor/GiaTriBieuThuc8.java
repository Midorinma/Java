package vonglapfor;
import java.util.Scanner;
import java.text.DecimalFormat;
public class GiaTriBieuThuc8 {

	public static void main(String[] args) {
		// U = 1/2 + 2/3 + 3/4 + ... + n/(n+1) (n > 0).
		Scanner scanner=new Scanner(System.in);
		DecimalFormat decimalFormat=new DecimalFormat("#.##");
		int n;
		float sum=0;
		do {
			System.out.println("n: ");
			n=scanner.nextInt();
			if(n<0) {
				System.out.println("n phải lớn hơn 0!");
			}
		}while(n<0);
		for(int i=1; i<=n; i++) {
			for(int j=i+1; j<=n+1; j++) {
				sum+=(float)i/j;
				i++;
			}
		}
		System.out.println("Kết quả: "+decimalFormat.format(sum));
		

	}

}

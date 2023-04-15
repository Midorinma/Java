package vonglapfor;
import java.util.Scanner;
import java.text.DecimalFormat;
public class GiaTriBieuThuc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat decimalFormat=new DecimalFormat("#.##");
		float q,sum=0;
		do {
			System.out.println("q: ");
			q=scanner.nextFloat();
			if(q<=0) {
				System.out.println("Nhâp sai! mời nhập lại.");
			}
		}while(q<=0);
		for(int i=1; i<=q; i++) {
			sum+=(float)1/i;
		}
		System.out.println("Kết quả: "+decimalFormat.format(sum));

	}

}

package dowhile;
import java.util.Scanner;
public class TongSoNguyen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int so,sum=0;
		do {
			System.out.println("Nhập vào một chữ số: ");
			so=scanner.nextInt();
			sum+=so;
		}while(sum<100);
		System.out.println("Tổng các số nguyên: "+sum);

	}

}

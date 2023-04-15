package vonglap;
import java.util.Scanner;
public class TongCacSoNguyen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,nhap;
		Scanner scanner=new Scanner(System.in);
		while(sum<100) {
			System.out.println("Nhập vào một số nguyên: ");
			nhap=scanner.nextInt();
			sum+=nhap;
		}
		System.out.println("Tổng các số đã nhập: "+sum);

	}

}

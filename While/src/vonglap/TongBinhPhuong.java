package vonglap;
import java.util.Scanner;
public class TongBinhPhuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n,sum=0,x=1;
		System.out.println("Nhập vào một số: ");
		n=scanner.nextInt();
		while(x<=n) {
			sum+=x*x;
			x++;
		}
		System.out.println("Tổng bình phương của "+n+" : "+sum);

	}

}

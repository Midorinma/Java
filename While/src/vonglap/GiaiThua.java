package vonglap;
import java.util.Scanner;
public class GiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n,x=1,y=1;
		System.out.println("Nhập vào một giai thừa: ");
		n=scanner.nextInt();
		while(x<=n) {
			y*=x;
			x++;
		}
		System.out.println(n+"!= "+y);
	}

}

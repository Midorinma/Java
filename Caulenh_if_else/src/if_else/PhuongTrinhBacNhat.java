package if_else;
import java.util.Scanner;
import java.text.DecimalFormat;
public class PhuongTrinhBacNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat decimalFormat=new DecimalFormat("#.##");
		int a,b;
		float x;
		System.out.println("a: ");
		a=scanner.nextInt();
		System.out.println("b: ");
		b=scanner.nextInt();
		x=(float)-b/a;
		if(a==0 && b==0) {
			System.out.println("Phương trình có vô số nghiệm.");
			return;
		}
		else if(a==0) {
			System.out.println("Phương trình vô nghiệm.");
			return;
		}
		else {
			System.out.println("Chương trình bậc nhất một ẩn có dạng: "+a+"x +"+b+"= 0 ");
			System.out.println("x= "+decimalFormat.format(x));
		}
	}

}

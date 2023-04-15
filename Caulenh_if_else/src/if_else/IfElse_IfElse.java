package if_else;
import java.util.Scanner;
public class IfElse_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		float so1;
		System.out.println("Nhập vào một số: ");
		so1=scanner.nextFloat();
		if(so1<10) {
			System.out.println(so1+" Nhỏ hơn 10.");
		}
		else if(so1==10) {
			System.out.println(so1+" Bằng 10");
		}
		else {
			System.out.println(so1+" Lớn hơn 10");
		}

	}

}

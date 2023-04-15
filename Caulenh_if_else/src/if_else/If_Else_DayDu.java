package if_else;
import java.util.Scanner;
public class If_Else_DayDu {

	public static void main(String[] args) {
		// Kiểm  tra số chẵn lẻ
		Scanner cn=new Scanner(System.in);
		int soA;
		System.out.println("Nhập vào một số: ");
		soA=cn.nextInt();
		if(soA%2==0) {
			System.out.println(soA+" là số chẵn");
		}else {
			System.out.println(soA+" là số lẽ");
		}

	}

}

package if_else;
import java.util.Scanner;
public class SoSanhVoi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int so;
		System.out.println("Nhập vào một số: ");
		so=scanner.nextInt();
		if(so>5) {
			System.out.println(so+">5");
			return;
		}
		if(so==5) {
			System.out.println(so+"=5.");
		}
		else {
			System.out.println(so+"<5");
		}

	}

}

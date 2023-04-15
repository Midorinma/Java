package if_else;
import java.util.Scanner;
public class SoSanhDiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		float lapTrinhWeb,lapTrinhJava;
		do {
			System.out.println("Điểm lập trình WEB: ");
			lapTrinhWeb=scanner.nextFloat();
			System.out.println("Điểm lập trình JAVA: ");
			lapTrinhJava=scanner.nextFloat();
			if(lapTrinhWeb<0 || lapTrinhWeb>10 || lapTrinhJava<0 || lapTrinhJava>10) {
				System.out.println("Điểm số nhập vào không hợp lệ!\n xin mời nhập lại");
			}
		}while(lapTrinhWeb<0 || lapTrinhWeb>10 || lapTrinhJava<0 || lapTrinhJava>10 );
		if(lapTrinhWeb>lapTrinhJava) {
			System.out.println("Lập trình web lớn hơn lập trình java.");
			return;
		}
		else if(lapTrinhWeb==lapTrinhJava) {
			System.out.println("Điểm lập trình web bằng lập trình java.");
			return;
		}
		else {
			System.out.println("Điểm lập trình web nhỏ hơn lập trình java.");
			return;
		}

	}

}

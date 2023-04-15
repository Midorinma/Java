package string;
import java.util.Scanner;
public class BT_InRaSoDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int soNguyen;
		do {
				System.out.println("Nhập vào một số nguyên: ");
				soNguyen=scanner.nextInt();
				if(soNguyen<1) {
					System.out.println("Số nhập phải lớn hơn 1!");
				}
		}while(soNguyen<1);
		for(int i=1; i<=soNguyen; i++) {
			System.out.println("Alarm!");
		}

	}

}

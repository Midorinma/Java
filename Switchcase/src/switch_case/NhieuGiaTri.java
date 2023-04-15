package switch_case;
import java.util.Scanner;
public class NhieuGiaTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int so;
		System.out.println("Nhập vào một số:");
		so=scanner.nextInt();
		switch(so) {
		case 0:
			System.out.println("Số 0");
			break;
		case 1:
		case 2:
			System.out.println("Số nhỏ");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Số trung bình");
			break;
		default:
			System.out.println("Số lớn");
		}

	}

}

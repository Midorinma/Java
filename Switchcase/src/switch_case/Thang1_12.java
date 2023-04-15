package switch_case;
import java.util.Scanner;
public class Thang1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int thang;
		System.out.println("Nhập vào một số nguyên từ (1-12): ");
		thang=scanner.nextInt();
		switch(thang) {
		case 1:
			System.out.println("tháng 1");
			break;
		case 2:
			System.out.println("tháng 2");
			break;
		case 3:
			System.out.println("tháng 3");
			break;
		case 4:
			System.out.println("tháng 4");
			break;
		case 5:
			System.out.println("tháng 5");
			break;
		case 6:
			System.out.println("tháng 6");
			break;
		case 7:
			System.out.println("tháng 7");
			break;
		case 8:
			System.out.println("tháng 8");
			break;
		case 9:
			System.out.println("tháng 9");
			break;
		case 10:
			System.out.println("tháng 10");
			break;
		case 11:
			System.out.println("tháng 11");
			break;
		case 12:
			System.out.println("tháng 12");
			break;
		default:
			System.out.println("Giá trị nhập vào không hợp lệ!");
		
		}
		

	}

}

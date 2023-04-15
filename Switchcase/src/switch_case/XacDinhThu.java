package switch_case;
import java.util.Scanner;
public class XacDinhThu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int thu;
		System.out.println("Nhập vào một số: ");
		thu=scanner.nextInt();
		if(thu<2 || thu>8) {
			System.out.println("Số nhập vào không hợp lệ!");
			return;
		}
		System.out.println("Thứ tương ứng theo dương lịch: ");
		switch(thu) {
		case 2: System.out.println("Monday.");break;
		case 3: System.out.println("Tuesday.");break;
		case 4: System.out.println("Wednesday.");break;
		case 5: System.out.println("Thursday.");break;
		case 6: System.out.println("Friday.");break;
		case 7: System.out.println("Saturday.");break;
		case 8: System.out.println("Sunday.");break;
		
		
		}

	}

}

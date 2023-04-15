package switch_case;
import java.util.Scanner;
public class KiemTraNguyenAm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char kiTu;
		System.out.println("Nhập vào một kí tự thường: ");
		kiTu=scanner.next().charAt(0);
		switch(kiTu) {
			case 'u':case 'e':case 'o':case 'a':case 'i':case 'y':
			System.out.println(kiTu+" Là một nguyên âm.");
			break;
			default:
				System.out.println("Đây không phải là kí tự nguyên âm.");
		
		}
		
	}

}

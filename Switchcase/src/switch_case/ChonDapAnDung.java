package switch_case;
import java.util.Scanner;
public class ChonDapAnDung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char chon;
		System.out.println("Cách nào cho phép người dùng khai báo 1 giá trị boolean trong 4 đáp án sau?");
		System.out.println("a. boolean bool1 = true;");
		System.out.println("b. boolean bool2 = \"true\";");
		System.out.println("c. boolean bool3 = \"1\";");
		System.out.println("d. boolean bool4 = 1;");
		System.out.println("Bạn chọn? ");
		chon=scanner.next().charAt(0);
		switch(chon) {
		case 'a':
			System.out.println("Kết quả đúng!");break;
		case 'b':case 'c':case 'd':
			System.out.println("Bạn chọn không đúng!");break;
		default:
			System.out.println("Câu trả lời phải nằm trong 4 lựa chon a, b, c hoặc d.");
			
		}

	}

}

package dowhile;
import java.util.Scanner;
public class ChonDapAnDung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cách nào cho phép người dùng khai báo 1 giá trị số nguyên trong 4 đáp án sau?");
		System.out.println("a. int number = \"123\";");
		System.out.println("b. int number = '1';");
		System.out.println("c. int number = 123;");
		System.out.println("d. boolean number = 1;");
		System.out.println("e. thoát chương trình.");
		System.out.println("Bạn chọn? ");
		Scanner scanner=new Scanner(System.in);
		//Khai báo biến
		char chon;
		do {
			chon=scanner.next().charAt(0);
			switch(chon) {
			case 'a':case 'b':case 'd':
				System.out.println("Bạn chọn sai rồi!");break;
			case 'c':
				System.out.println("Kết quả đúng!");break;
			case 'e':
				return;
			default:
				System.out.println("Nhập sai xin mời nhập lại!");
			
			}
		}while(chon>='a' || chon<='z');
		

	}

}

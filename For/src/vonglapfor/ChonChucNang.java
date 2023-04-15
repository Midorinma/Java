package vonglapfor;
import java.util.Scanner;
public class ChonChucNang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int chon;
		for(;;) {
			System.out.println("Bảng chọn chức năng: ");
			System.out.println("1-> Nhập.");
			System.out.println("2-> Xem.");
			System.out.println("3-> Thoát.");
			System.out.print("Bạn chọn? ");
			do {
				chon=scanner.nextInt();
				if(chon<1 || chon>3) {
					System.out.println("Nhập sai! yêu cầu bạn nhập (1<=sô<=3): ");
				}
			}while(chon<1 || chon>3);
			switch(chon) {
			case 1: System.out.println("Bạn chọn chức năng nhập!");break;
			case 2: System.out.println("Bạn chọn chức năng xem!");break;
			case 3:System.out.println("Bạn chọn chức năng thoát!");
			System.out.println("Tạm biệt!");
			System.exit(0);//Thoát chương trình
			break;
			}
		}

	}

}

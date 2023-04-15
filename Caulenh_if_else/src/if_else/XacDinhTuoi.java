package if_else;
import java.util.Scanner;
public class XacDinhTuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String ten;
		int nam,tuoi;
		System.out.println("Nhập vào tên của bạn: ");
		ten=scanner.nextLine();
		System.out.println("Nhập vào số năm: ");
		nam=scanner.nextInt();
		tuoi=2022-nam;
		if(tuoi>=18) {
			System.out.println("Bạn "+ten+" đã già.");
		}
		else {
			if(tuoi>=16) {
				System.out.println("Bạn "+ten+" ở độ tuổi trưởng thành.");
			}
			else {
				System.out.println("Bạn "+ten+" ở độ tuổi vị thành niên.");
			}
		}

	}
}

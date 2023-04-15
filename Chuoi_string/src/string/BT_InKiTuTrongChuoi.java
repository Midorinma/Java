package string;
import java.util.Scanner;
public class BT_InKiTuTrongChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		for(int i=0; i<chuoi.length(); i++) {
			System.out.println(chuoi.charAt(i));
		}

	}

}

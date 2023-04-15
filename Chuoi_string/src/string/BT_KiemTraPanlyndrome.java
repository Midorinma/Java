package string;
import java.util.Scanner;
public class BT_KiemTraPanlyndrome {

	public static void main(String[] args) {
		// Kiểm tra chuỗi đối xứng
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		Boolean kt=false;
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		for(int i=0; i<chuoi.length(); i++) {
			char kiTu=chuoi.charAt(chuoi.length()-i-1);
			if(kiTu==chuoi.charAt(i)) {
				kt=true;
			}
			else {
				kt=false;
			}
		}
		if(kt==true) {
			System.out.println("Chuỗi này là chuỗi Panlyndrome.");
		}else {
			System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
		}
	}

}

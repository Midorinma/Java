package string;
import java.util.Scanner;
public class ViDu1 {

	public static void main(String[] args) {
		// Viết chương trình nhập từ bàn phím một chuỗi không quá 80 ký tự----- và một ký tự bất kỳ. 
		//Đếm và in ra màn hình số lần xuất hiện của ký tự đó trong chuỗi vừa nhập.
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		int count=0;
		do {
			System.out.println("Nhập vào một chuỗi: ");
			chuoi=scanner.nextLine();
			if(chuoi.length()>80) {
				System.out.println("Nhập sai! xin mời nhập lại.");
			}
		}while(chuoi.length()>80);
		System.out.println("Nhập một kí tự: ");
		char kiTu=scanner.next().charAt(0);
		
		for(int i=0; i<chuoi.length(); i++) {
			if(kiTu==chuoi.charAt(i)) {
				count++;
			}
			else {
				System.out.println("Không tìm thấy kí tự trong chuỗi.");
				return;
			}
		}
		System.out.println("Số lần xuất hiện của "+kiTu+" trong chuỗi "+chuoi+" Vừa nhập: "+count);

	}

}

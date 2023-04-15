package baitap;
import java.util.Scanner;
public class KiemTraNamNhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int nam;
		System.out.println("Nhập vào một năm: ");
		nam=scanner.nextInt();
		if(nam%400==0 ) {
			System.out.println(nam+" Là năm nhuận.");
		}
		else if(nam%4==0 && nam%100!=0 ) {
			System.out.println(nam+" Là năm nhuận.");
		}
		else {
			System.out.println("Không phải là năm nhuận.");
		}
	}
}

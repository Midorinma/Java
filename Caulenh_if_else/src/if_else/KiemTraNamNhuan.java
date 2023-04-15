package if_else;
import java.util.Scanner;
public class KiemTraNamNhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int soNam;
		System.out.println("Nhập vào một năm bất kì: ");
		soNam=scanner.nextInt();
		if(soNam%400==0 && soNam%100==0) {
			System.out.println(soNam+" Là năm nhuận.");
		}
		else if(soNam%4==0 && soNam%100!=0) {
			System.out.println(soNam+" Là năm nhuận.");
		}
		else {
			System.out.println(soNam+" Không phải là năm nhuận.");
		}
	}
}

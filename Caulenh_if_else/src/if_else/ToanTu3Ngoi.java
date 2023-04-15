package if_else;
import java.util.Scanner;
public class ToanTu3Ngoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int so1;
		System.out.println("Nhập vào một số: ");
		so1=scanner.nextInt();
		String ketQua=( so1 %2==0) ? "Số "+so1+" Là số chẵn." : "Số "+so1+" là số lẻ.";
		System.out.println(ketQua);
	}
}

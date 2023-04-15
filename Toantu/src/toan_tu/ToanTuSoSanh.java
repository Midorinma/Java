package toan_tu;
import java.util.Scanner;
public class ToanTuSoSanh {

	public static void main(String[] args) {
		// Nhap hai toan hang
		int variable1, variable2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập vào toán tử 1: ");
		variable1=scanner.nextInt();
		System.out.println("Nhập vào toán tử 2: ");
		variable2=scanner.nextInt();
		System.out.println("Kết quả của so sánh bằng "+variable1+" va "+variable2+" la: "+(variable1==variable2));
		System.out.println("Kết quả của so sánh không bằng "+variable1+" va "+variable2+" la: "+(variable1!=variable2));
		System.out.println("Kết quả của so sánh lớn hơn "+variable1+" va "+variable2+" la: "+(variable1>variable2));
		System.out.println("Kết quả của so sánh lớn hơn hoặc bằng "+variable1+" va "+variable2+" la: "+(variable1>=variable2));
		System.out.println("Kết quả của so sánh nhỏ hơn "+variable1+" va "+variable2+" la: "+(variable1<variable2));
		System.out.println("Kết quả của so sánh nhỏ hơn hoặc bằng "+variable1+" va "+variable2+" la: "+(variable1<=variable2));

	}

}

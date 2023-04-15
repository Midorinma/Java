package toan_tu;
import java.util.Scanner;
public class NhapTenSuDungScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập vào tên của bạn: ");
		String ten=scanner.nextLine();
		System.out.println("Chào bạn!"+ten+" chúc buổi sáng an lành");
		System.out.println("\n");
		
		//Nhập địa chỉ sử dụng phương thức next
		System.out.println("Nhập vào một địa chỉ: ");
		String yourAdress=scanner.next();
		System.out.println("Địa chỉ của bạn khi sử dụng phương thức next là "+yourAdress);

	}

}

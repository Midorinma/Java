package string;
import java.util.Scanner;
public class BT_TachVaHienThi {

	public static void main(String[] args) {
		//Tách các từ có trong chuỗi và hiển thị mỗi từ trên một dòng
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		for(int i=0; i<chuoi.length(); i++) {
			char kiTu=chuoi.charAt(i);
			if(Character.isSpace(kiTu)) {
				//Nếu gặp kí tự khoảng trắng thì sẽ xuống dòng
				System.out.println();
			}else {
				System.out.print(kiTu);
			}
		}
	}

}

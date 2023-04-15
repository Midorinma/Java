package string;
import java.util.Scanner;
public class BT_DemKhoangTrang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khởi tạo
		String chuoi;
		int dem=0;
		
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		
		for(int i=0; i<chuoi.length(); i++) {
			char kiTu=chuoi.charAt(i);
			if(Character.isSpace(kiTu)) {
				dem++;
			}
		}
		System.out.println("Số khoảng trắng có trong chuỗi "+chuoi+" là: "+dem);
		

	}

}

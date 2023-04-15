package string;
import java.util.Scanner;
public class BT_SoLanXuatHienKiTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khai báo
		String chuoi;
		char kiTu='a';
		int dem=0;
		//Nhập 
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		for(int i=0; i<chuoi.length(); i++) {
			if(kiTu==chuoi.charAt(i)) {
				dem++;
			}
		}
		System.out.println("Số kí tự 'a 'có trong chuỗi: ");
		System.out.println(chuoi+" là: "+dem);

	}

}

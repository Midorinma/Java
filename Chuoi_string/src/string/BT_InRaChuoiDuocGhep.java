package string;
import java.util.Scanner;
public class BT_InRaChuoiDuocGhep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khai báo
		String chuoi;
		int n;
		//Nhập
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		do {
			System.out.println("Nhập vào một số: ");
			n=scanner.nextInt();
			if(n<2) {
				System.out.println(chuoi);
				break;
			}
		}while(n<2);
		for(int i=1; i<=n; i++) {
			System.out.print(chuoi);
		}
		

	}

}

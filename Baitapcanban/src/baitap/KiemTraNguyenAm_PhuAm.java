package baitap;
import java.util.Scanner;
public class KiemTraNguyenAm_PhuAm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char chuCai;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập vào một chữa cái: ");
		chuCai=scanner.next().charAt(0);
		boolean th=false;
		switch(chuCai) {
		case 'U':case 'E': case 'O': case 'A': case 'I': case 'u': case 'e': case 'o': case 'a': case 'i':
			th=true;
			break;
		}
		if(th==true) {
			System.out.println("Là một nguyên âm.");
		}else {
			if(( chuCai >= 'a' && chuCai <= 'z')||(chuCai>='A' && chuCai<='Z')) {
				System.out.println("Là một phụ âm.");
			}else {
				System.out.println("Không nằm trong bảng chữa cái.");
			}
		}
		
	}

}

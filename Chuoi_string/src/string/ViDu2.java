package string;
import java.util.Scanner;
public class ViDu2 {

	public static void main(String[] args) {
		// Nhập một chuỗi bất kì:
		/*
		 * số
		 * kí tự thường
		 * kí tự hoa 
		 * Đếm và in ra số kí tự thường=? kí tự hoa=? sô=?
		 */
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		int so=0,kiTuThuong=0,kiTuHoa=0;
		System.out.println("Nhập vào một chuỗi bất kì: ");
		chuoi=scanner.nextLine();
		for(int i=0; i<chuoi.length(); i++) {
			if(chuoi.charAt(i)>='a' && chuoi.charAt(i)<='z') {
				kiTuThuong++;
			}
			else if(chuoi.charAt(i)>='A' && chuoi.charAt(i)<='Z') {
				kiTuHoa++;
			}
			else if(chuoi.charAt(i)>='0' && chuoi.charAt(i)<='9') {
				so++;
			}
		}
		System.out.println("Số kí tự thường: "+kiTuThuong+" Số kí tự hoa: "+kiTuHoa+" Số: "+so);

	}

}

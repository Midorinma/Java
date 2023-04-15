package string;
import java.util.Scanner;
public class ViDu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		int so=0,kiTuThuong=0,kiTuHoa=0;
		System.out.println("Nhập vào một chuỗi bất kì: ");
		chuoi=scanner.nextLine();
		for(int i=0; i<chuoi.length(); i++) {
			if(Character.isLowerCase(chuoi.charAt(i))) {
				kiTuThuong++;
			}
			else if(Character.isUpperCase(chuoi.charAt(i))) {
				kiTuHoa++;
			}
			else if(Character.isDigit(chuoi.charAt(i))) {
				so++;
			}
		}
		System.out.println("Số kí tự thường: "+kiTuThuong+" Số kí tự hoa: "+kiTuHoa+" Số: "+so);

	}

}

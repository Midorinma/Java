package vonglap;
import java.util.Scanner;
public class DemSoChuSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int so,dem=0;
		System.out.println("Số: ");
		so=scanner.nextInt();
		if(so<0) {
			System.out.println("cần nhập chữ số >0");
			return;
		}
		while(so>0) {
			so/=10;
			dem++;
		}
		System.out.println("Có "+dem+" Chữ số");

	}

}

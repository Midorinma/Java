package string;
import java.util.Scanner;
public class BT_SoSanhHaiChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khai báo
		String chuoi1,chuoi2;
		int result;
		//nhập  chuỗi
		System.out.println("Chuỗi 1: ");
		chuoi1=scanner.nextLine();
		System.out.println("Chuỗi 2: ");
		chuoi2=scanner.nextLine();
		//So sánh có sử dụng compare to
		result=chuoi1.compareTo(chuoi2);
		if(result==0) {
			System.out.println(chuoi1+" = "+chuoi2);
		}
		else if(result>0) {
			System.out.println(chuoi1+" > "+chuoi2);
		}
		else if(result<0) {
			System.out.println(chuoi1+" < "+chuoi2);
		}
		//So sánh sử dụng compareToignorecase
		result=chuoi1.compareToIgnoreCase(chuoi2);
		if(result==0) {
			System.out.println(chuoi1+" = "+chuoi2);
		}
		else if(result>0) {
			System.out.println(chuoi1+" > "+chuoi2);
		}
		else if(result<0) {
			System.out.println(chuoi1+" < "+chuoi2);
		}

	}

}

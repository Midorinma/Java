package thuvienxulychuoi;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BT_DemSoTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		StringTokenizer strtStringTokenizer=new StringTokenizer(chuoi, " ");
		while(strtStringTokenizer.hasMoreTokens()){
			int dem=strtStringTokenizer.countTokens();
			System.out.println("Số từ có trong chuỗi: "+dem);
			return;
		}
		

		
		

	}

}

package xulysongaunhien;

import java.text.DecimalFormat;
import java.util.Random;

public class HaiSoRDTinhTB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		DecimalFormat dcf=new DecimalFormat("#.##");
		int so1=-10+rd.nextInt(21);
		int so2=-10+rd.nextInt(21);
		double trungBinh;
		System.out.println("Hai số vừa được sinh ra là "+so1+" và "+so2);
		trungBinh=(so1+so2)/2.0;
		System.out.println("Trung bình của hai số: "+dcf.format(trungBinh));
		
	}

}

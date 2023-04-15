package xulydulieuso;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class TBCuaChinSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numBer=0,soTB,tong=0;
		int n=9;
		Scanner scanner=new Scanner(System.in);
		//Nhập vào 9 số thực bất kì từ bàn phím
		for(int i=0; i<n; i++) {
			System.out.println("Nhập vào số thực thứ "+i+": ");
			numBer=scanner.nextFloat();
			tong+=numBer;
		}
		//Tính số TB
		soTB=tong/n;
		
		//định dạng số trung bình ở dạng
		//dùng dấu chấm phẩy (;) để phân cách phần  thập phân và phần nguyên của số đó
		//Bằng cách sử dụng phương thức setDecimalSeperator() của DecimalformatSymboy
		DecimalFormatSymbols symbois=DecimalFormatSymbols.getInstance();
		symbois.setDecimalSeparator(';');
		String pattern="#.###";
		//Làm tròn đến 3 chữ số phần thập phân và có dấu chấm phẩy phân cách
		DecimalFormat dcf=new DecimalFormat(pattern, symbois);
		String Stbstr=dcf.format(soTB);
		System.out.println("Trung bình của 10 số vừa nhập= "+Stbstr);
				

	}

}

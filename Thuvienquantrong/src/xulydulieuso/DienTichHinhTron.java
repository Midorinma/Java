package xulydulieuso;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DienTichHinhTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int banKinh;
		double soPi=3.14d;
		double area;
		DecimalFormat dcf=new DecimalFormat("#.##");
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Nhập vào bán kính hình tròn: ");
		banKinh=scanner.nextInt();
		
		area=soPi*banKinh*banKinh;
		
		System.out.println("Diện tích hình tròn: "+dcf.format(area));

	}

}

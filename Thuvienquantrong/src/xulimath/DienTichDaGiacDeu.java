package xulimath;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DienTichDaGiacDeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soCanh;
		double doDaiMoiCanh,dienTich;
		Scanner scanner=new Scanner(System.in);
		
		//Làm tròn đến hai chữ số thập phân
		DecimalFormat dcf=new DecimalFormat("#.##");
		 System.out.println("Nhập vào số cạnh của đa giác: ");
		 soCanh=scanner.nextInt();
		 
		 System.out.println("Nhập vào độ dài của cạnh: ");
		 doDaiMoiCanh=scanner.nextDouble();
		 
		 //Tính diện tích đa giác
		 dienTich=(soCanh*Math.pow(doDaiMoiCanh,2)/(4*Math.tan(Math.PI/soCanh)));
		 System.out.println("Diện tích đa giác: "+dcf.format(dienTich));

	}

}

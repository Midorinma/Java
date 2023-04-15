package xulimath;

import java.util.Scanner;

public class DoDaiDoanThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double xA,yA;
		double xB,yB;
		double AB;
		System.out.println("Nhập tọa độ điểm A: ");
		System.out.print("Xa: ");
		xA=scanner.nextDouble();
		
		System.out.print("Ya: ");
		yA=scanner.nextDouble();
		System.out.println("Tọa độ A("+xA+","+yA+")");
		
		System.out.println("Nhập tọa độ điểm B: ");
		System.out.print("Xb: ");
		xB=scanner.nextDouble();
		
		System.out.print("Yb: ");
		yB=scanner.nextDouble();
		
		System.out.println("Tọa độ B("+xB+","+yB+")");
		AB=Math.sqrt(Math.pow((xB-xA),2)+Math.pow((yB-yA),2));
		
		System.out.println("Độ dài đoạn thẳng AB: "+AB);
		

	}

}

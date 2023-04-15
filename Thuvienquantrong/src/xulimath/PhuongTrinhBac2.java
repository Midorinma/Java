package xulimath;

import java.util.Scanner;

public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		//Viết chương trình giải phương trình bậc 2 2 ẩn ax2 + bx + c = 0.
		double a,b,c,x1,x2,delta;
		String ketQua="";
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Giải phương trình ax^2 + bx + c = 0");
		
		do {
			System.out.println("Nhập a (a!=0): ");
			a=scanner.nextDouble();
		}while(a==0);
		System.out.println("Nhập b: ");
		b=scanner.nextDouble();
		System.out.println("Nhập c: ");
		c=scanner.nextDouble();
		
		//Tính delta = b*b-4*a*c
		delta=Math.pow(b,2)-4*a*c;
		
		//Kiểm tra nếu delta <0 thì phương trình vô nghiệm
		//Delta=0 thì phương trình có nghiệm kép
		//Delta >0 thì phương trình có 2 nghiệm phân biệt
		if(delta<0) {
			ketQua="Phương trình vô nghiệm.";
		}
		else if(delta==0){
			x1=x2=(-b)/(2*a);
		}
		else {
			x1=(-b+Math.sqrt(delta))/(2*a);
			x2=(-b-Math.sqrt(delta))/(2*a);
			ketQua="Phương trình có hai nghiệm x1= "+x1+" và x2= "+x2;
		}
		System.out.println(ketQua);

	}

}

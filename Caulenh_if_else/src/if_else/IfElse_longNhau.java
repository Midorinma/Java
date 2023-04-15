package if_else;
import java.util.Scanner;
public class IfElse_longNhau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int so1,so2,so3,so4;
		System.out.println("Nhập vào số thứ 1: ");
		so1=scanner.nextInt();
		System.out.println("Nhập vào số thứ 2: ");
		so2=scanner.nextInt();
		System.out.println("Nhập vào số thứ 3: ");
		so3=scanner.nextInt();
		if(so1>=so2) {
			if(so1>=so3) {
				so4=so1;
			}
			else {
				so4=so3;
			}
		}
		else if(so2>=so3) {
			so4=so2;
		}else {
			so4=so3;
		}
		System.out.println("Số lớn nhất giữa "+so1+" "+so2+" "+so3+" là: "+so4);

	}

}

package baitap;
import java.util.Scanner;
public class NhanSoThuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float so1,so2,so3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập vào một số thực");
		so1=scanner.nextFloat();
		System.out.println("Nhập vào một số thực");
		so2=scanner.nextFloat();
		so3=so1*so2;
		System.out.println(so1+" * "+so2+" = "+so3);

	}

}

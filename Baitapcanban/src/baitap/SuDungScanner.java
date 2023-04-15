package baitap;
import java.util.Scanner;
public class SuDungScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a,b,c;
		System.out.println("Nhập vào số thứ 1: ");
		a=scanner.nextInt();
		System.out.println("Nhập vào số thứ 2: ");
		b=scanner.nextInt();
		c=a+b;
		System.out.println("result: "+c);

	}
}

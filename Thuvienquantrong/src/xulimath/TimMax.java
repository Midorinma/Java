package xulimath;

import java.util.Scanner;

public class TimMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int soA,soB;
		System.out.println("Nhập vào số A: ");
		soA=scanner.nextInt();
		System.out.println("Nhập vào số B: ");
		soB=scanner.nextInt();
		int max=Math.max(soA, soB);
		System.out.println("Max của "+soA+" và số "+soB+" là: "+max);

	}

}

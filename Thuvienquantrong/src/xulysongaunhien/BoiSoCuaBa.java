package xulysongaunhien;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BoiSoCuaBa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,number;
		Random rd=new Random();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Nhập số phần tử của arrlist: ");
		n=scanner.nextInt();
		
		ArrayList<Integer> arrList=new ArrayList<>(n);
		
		for(int i=0; i<n; i++) {
			number=3+rd.nextInt(298);
			arrList.add(number);
		}
		
		for(int i=0; i<n; i++) {
			if(arrList.get(i)%3==0) {
				System.out.print(arrList.get(i)+"\t");
			}
		}

	}

}

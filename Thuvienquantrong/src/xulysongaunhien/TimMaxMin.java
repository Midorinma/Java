package xulysongaunhien;

import java.util.Random;

public class TimMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		double so1,so2,so3,max,min;
		so1=rd.nextDouble();
		System.out.println("Số ngẫu nhiên thứ 1: "+so1);
		
		so2=rd.nextDouble();
		System.out.println("Số ngẫu nhiên thứ 2: "+so2);
		
		so3=rd.nextDouble();
		System.out.println("Số ngẫu nhiên thứ 3: "+so3);
		
		//Tìm số lớn nhất
		max=so1;
		if(so2>max) {
			max=so2;
		}
		else if(so3>max) {
			max=so3;
		}
		System.out.println("Số lớn nhất là: "+max);
		
		//Tìm số nhỏ nhất
		min=so1;
		if(so2<min) {
			min=so2;
		}
		else if(so3<min) {
			min=so3;
		}
		System.out.println("Số nhỏ nhất là: "+min);
	}

}

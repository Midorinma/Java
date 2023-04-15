package xulimath;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MaxMinTrungBinhHaiSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double randomNumber,max,min,trungBinh,tong=0.0;
		DecimalFormat decimalFormat=new DecimalFormat("#.##");
		ArrayList<Double> arrayList=new ArrayList<>();
		
		//Phát sinh hai số ngẫu nhiên
		for(int i=0; i<2; i++) {
			randomNumber=Math.random();
			arrayList.add(randomNumber);
		}
		
		System.out.println("Hai số vừa được sinh ra là: ");
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(decimalFormat.format(arrayList.get(i)));
		}
		
		//Tìm số nhỏ nhất
		min=Math.min(arrayList.get(0), arrayList.get(1));
		System.out.println("Số nhỏ nhất trong hai số là: "+decimalFormat.format(min));
		
		//Tìm số lớn nhất
		max=Math.max(arrayList.get(0),arrayList.get(1));
		System.out.println("Số lớn nhất trong hai số là: "+decimalFormat.format(max));
		
		//Tính trung bình cộng hai số trên
		for(int i=0; i<arrayList.size(); i++) {
			tong+=arrayList.get(i);
		}
		trungBinh=tong/(arrayList.size());
		System.out.println("Trung bình cộng: "+decimalFormat.format(trungBinh));
		

	}

}

package baitap_quanlyhs;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoSoHocSinh hoSoHocSinh;
		int n;	//Số lượng học sinh
		
		Scanner scanner=new Scanner(System.in);
		
		ArrayList<HoSoHocSinh> hs=new ArrayList<>();
		
		System.out.println("Nhập vào số học sinh: ");
		n=Integer.parseInt(scanner.nextLine());
			
		//Nhập vào ds Học Sinh
			for(int i=0; i<n; i++) {
				hoSoHocSinh=new HoSoHocSinh();
				System.out.println("Số học sinh thứ "+(i+1)+" : ");
				hoSoHocSinh.nhapHoSo();
				hs.add(hoSoHocSinh);
			}
		
		//Xuất ds học sinh
			for(int i=0; i<n; i++) {
				System.out.println("Số học sinh thứ "+(i+1)+" : ");
				hs.get(i).hienThiHoSoHocSinh();
				System.out.println();
			}
		
		//Hiển thị tất cả học sinh quê ở Thái Nguyên
			System.out.println("Những học sinh quê ở Thái nguyên: ");
			for(int i=0; i<hs.size(); i++) {
				if(hs.get(i).getNguoi().getQueQuan().equalsIgnoreCase("Thái Nguyên")) {
					hs.get(i).hienThiHoSoHocSinh();	
				}
				System.out.println();
			}
			
		//Hiển thị tất cả học sinh của lớp 10A1
			System.out.println("Những học sinh của lớp 10A1: ");
			for(int i=0; i<hs.size(); i++) {
				if(hs.get(i).getLop().equalsIgnoreCase("10A1")) {
					hs.get(i).hienThiHoSoHocSinh();
				}
				System.out.println();
			}
			
	}

}

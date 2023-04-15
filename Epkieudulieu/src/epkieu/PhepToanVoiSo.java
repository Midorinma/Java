package epkieu;
import java.util.Scanner;
public class PhepToanVoiSo {
	public static void nhiPhan(int so1, int so2, int so3) {
		System.out.println("integer-->nhị phân(so1): "+Integer.toBinaryString(so1));
		System.out.println("integer-->nhị phân(so2): "+Integer.toBinaryString(so2));
		System.out.println("integer-->nhị phân(so3): "+Integer.toBinaryString(so3));
	}
	public static void thapLucPhan(int so1, int so2, int so3) {
		System.out.println("integer-->thập lục phân(so1): "+Integer.toHexString(so1));
		System.out.println("integer-->thập lục phân(so2): "+Integer.toHexString(so2));
		System.out.println("integer-->thập lục phân(so3): "+Integer.toHexString(so3));
	}
	public static void batPhat(int so1, int so2, int so3) {
		System.out.println("integer-->bát phân(so1): "+Integer.toOctalString(so1));
		System.out.println("integer-->bát phân(so2): "+Integer.toOctalString(so2));
		System.out.println("integer-->bát phân(so3): "+Integer.toOctalString(so3));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int so1,so2,so3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập vào số nguyên thứ 1: ");
		so1=scanner.nextInt();
		System.out.println("Nhập vào số nguyên thứ 2: ");
		so2=scanner.nextInt();
		System.out.println("Nhập vào số nguyên thứ 3: ");
		so3=scanner.nextInt();
		//So lon nhat trong 3 so
		boolean max=false;
		int number=0;
		if(so1>so2) {
			if(so1>so3) {
				number=so1;
				max=true;
			}
			else {
				number=so3;
				max=true;
			}
		}else {
			if(so2>so3) {
				number=so2;
				max=true;
			}
			else {
				number=so3;
				max=true;
			}
		}
		if(max==true) {
			System.out.println(number+" Là số lớn nhất.");
		}
		//So nho nhat trong 3 so
		int min=0;
		boolean trick=false;
		if(so1<so2) {
			if(so1<so3) {
				min=so1;
				trick=true;
			}
			else {
				min=so3;
				trick=true;
			}
		}else {
			if(so2<so3) {
				min=so2;
				trick=true;
			}else {
				min=so3;
				trick=true;
			}
		}
			if(trick==true) {
				System.out.println(min+" Là số nhỏ nhất.");
			}
		//Chuyên đổi sang số nhị phân
		PhepToanVoiSo pt=new PhepToanVoiSo();
		pt.nhiPhan(so1, so2, so3);
		//Chuyển đổi sang số thập lục phân
		pt.thapLucPhan(so1, so2, so3);
		//Chuyển đổi sang số bát phân
		pt.batPhat(so1, so2, so3);
		//Tổng của ba số vừa nhập
		int sum=0;
		sum=Integer.sum(so1, so2);
		System.out.println("Tỗng của ba số vừa nhập là: "+Integer.sum(sum, so3));

	}
}
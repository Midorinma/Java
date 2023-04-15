package array;
import java.util.Scanner;
public class SapXepTangDan {
	public static int max=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khai báo
		int n;
		int mang[]=new int[max];
		do {
			System.out.println("n= ");
			n=scanner.nextInt();
			if(n<2 || n>max-1) {
				System.out.println("n nhập vào không trong phạm vi cho phép!");
			}
		}while(n<2 || n>max-1);
		
		//Nhap mảng
		for(int i=0; i<n; i++) {
			System.out.println("a[ "+i+" ]= ");
			mang[i]=scanner.nextInt();
		}
		//Xuat mảng ban đầu 
		System.out.println("Mảng ban đầu: ");
				for(int i=0; i<n; i++) {
					System.out.print(mang[i]+" ");
				}
			System.out.println();
		//Săp xếp
		for(int i=0; i<n-1; i++) {
			int temp;
			for(int j=i+1; j<n; j++) {
				if(mang[i]>mang[j]) {
					temp=mang[i];
					mang[i]=mang[j];
					mang[j]=temp;
				}
			}
		}
		System.out.println("Mảng sau khi sắp xếp: ");
		//Xuat mảng
		for(int i=0; i<n; i++) {
			System.out.print(mang[i]+" ");
		}
		

	}

}

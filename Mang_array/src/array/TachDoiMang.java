package array;
import java.util.Scanner;
public class TachDoiMang {
	public static int max=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		int mang[]=new int[max];
		int mang1[]=new int[max];
		int mang2[]=new int[max];
		do {
			System.out.println("Nhập n: ");
			n=scanner.nextInt();
			if(n<=0 || n>max) {
				System.out.println("Nhập sai! xin mời nhập lại.");
			}
		}while(n<=0 || n>max);
		//Nhập mảng
		for(int i=0; i<n; i++) {
			System.out.print("a[ "+i+" ]= ");
			mang[i]=scanner.nextInt();
		}
		//Tách mảng
		int m1=0,m2=0;//Khai báo phần tử của hai mảng
		for(int i=0; i<n/2; i++) {//Chia đôi số phần tử mảng
			mang1[m1]=mang[i];
			m1++;
		}
		for(int i=n/2; i<n; i++) {
			mang2[m2]=mang[i];
			m2++;
		}
		//Xuất mảng sau khi tách
		System.out.println("Mảng đầu: ");
		for(int i=0; i<m1; i++) {
			System.out.print(mang1[i]+"\t");
		}
		System.out.println();
		System.out.println("Mảng cuối: ");
		for(int i=0; i<m2; i++) {
			System.out.print(mang2[i]+"\t");
		}
		
		

	}

}

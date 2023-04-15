package array;
import java.util.Scanner;
public class BT_CacThaoTacTrenMang {
	public static int max=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n,tong=0,min=0;
		int mang[]=new int[max];
		do {
			System.out.println("n= ");
			n=scanner.nextInt();
			if(n<=0 || n>max) {
				System.out.println("Nhập sai! ");
			}
		}while(n<=0 || n>max);
		//Nhập Mảng
		for(int i=0; i<n; i++) {
			System.out.print("a[ "+i+" ]= ");
			mang[i]=scanner.nextInt();
			tong+=mang[i];
		}
		System.out.println("Mảng ban đầu: ");
		//Xuất mảng
		for(int i=0; i<n; i++) {
			System.out.print(mang[i]+"\t");
		}
		System.out.println();
		System.out.println("Tổng các phần tử có trong mảng = "+tong);
		for(int i=0; i<n-1; i++) {
			int temp;
			for(int j=i+1; j<n; j++) {
				if(mang[i]<mang[j]) {
					temp=mang[i];
					mang[i]=mang[j];
					mang[j]=temp;
				}
			}
		}
		System.out.println("Mảng sau khi sắp xếp là: ");
		for(int i=0; i<n; i++) {
			System.out.print(mang[i]+"\t");
			min=mang[n-1];
		}
		System.out.println();
		System.out.println("Phần tử nhỏ nhất trong mảng là: "+min);

	}

}

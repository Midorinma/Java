package array;
import java.util.Scanner;
public class TachMangChanLe {
	public static int max=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;//Số lượng phần tử
		int c,l;//số phần tử trong mảng
		c=l=0;
		int mang[]=new int[max];
		int chan[]=new int[max];
		int le[]=new int[max];
		do {
			System.out.println("Nhập số lượng phần tử: ");
			n=scanner.nextInt();
			if(n<=0 || n>max) {
				System.out.println("Bạn nhập sai rồi!");
			}
		}while(n<=0 || n>max);
		//Nhập mảng
		for(int i=0; i<n; i++) {
			System.out.print("a[ "+i+" ]= ");
			mang[i]=scanner.nextInt();
		}
		System.out.println("Mảng sau khi nhập: ");
		//Xuất mảng
		for(int i=0; i<n; i++) {
			System.out.print(mang[i]+"\t");
		}
		System.out.println();
		//Tách mảng
		for(int i=0; i<n; i++) {
			if(mang[i]%2==0) {
				chan[c]=mang[i];
				c++;
			}
			else {
				le[l]=mang[i];
				l++;
			}
		}
		//Mảng chẵn
		
		System.out.println("Mảng chẵn: ");
		for(int i=0; i<c; i++) {
			System.out.print(chan[i]+"\t");
		}
		System.out.println();
		//Mảng lẽ
		
		System.out.println("Mảng lẽ: ");
		for(int i=0; i<l; i++) {
			System.out.print(le[i]+"\t");
		}
		
	}

}

package array;
import java.util.Arrays;
import java.util.Scanner;
public class BaiTapTongHop {
	public static int max=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		int mang[]=new int[max];
		do {
			System.out.println("n= ");
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
		//Xuất mảng
		System.out.println("Xuất mảng: ");
		for(int i=0; i<n; i++) {
			System.out.print(mang[i]+"\t");
		}
		System.out.println();
		//tim max
		int temp=mang[0];
		for(int i=1; i<n; i++) {
			temp=mang[i]>temp? mang[i]:temp;
		}
		System.out.println("Gía trị lớn nhất là: "+temp);
		//Tìm min
		int min=mang[0];
		for(int i=1; i<n; i++) {
			if(min>mang[i]) {
				min=mang[i];
			}
		}
		System.out.println("Gía trị nhỏ nhất là: "+min);
		//Đếm số phần tử
		int dem=0;
		for(int i=0; i<n; i++) {
			if(mang[i]%2==0) {
				dem++;
			}
		}
		System.out.println("Số phần tử chẵn có trong mảng là : "+dem);
		//Sắp xếp mảng tăng dần
		Arrays.sort(mang, 0, n);
		System.out.println("Mảng sau khi sắp xếp: ");
		for(int i=0; i<n; i++) {
			System.out.print(mang[i]+"\t");
		}
	}
}

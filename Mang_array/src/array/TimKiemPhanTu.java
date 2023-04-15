package array;
import java.util.Scanner;
public class TimKiemPhanTu {
	public static int max=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		int mang[]=new int[max];
		int k;
		do {
			System.out.println("n= ");
			n=scanner.nextInt();
			if(n<=0 || n>max) {
				System.out.println("Số nhập vào không thỏa mãn điều kiện!");
			}
		}while(n<=0 || n>max);
		//Nhập mảng
		for(int i=0; i<n; i++) {
			System.out.print("a[ "+i+" ]= ");
			mang[i]=scanner.nextInt();
		}
		//Xuất mảng
		for(int i=0; i<n; i++) {
			System.out.print(mang[i]+" ");
		}
		System.out.println();
		System.out.println("Nhập vào giá trị cần tìm: ");
		k=scanner.nextInt();
		for(int i=0; i<n; i++) {
			if(mang[i]==k) {
				System.out.println("Tìm thấy giá trị "+k+" tại vị trí: "+(i+1));
				return;
			}
		}
		System.out.println("Không tìm thấy giá trị "+k);
	}

}

package array;
import java.util.Scanner;
public class SoNguyenLe_Chan {
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
				System.out.println("Nhập sai! xin mời nhập lại ");
			}
		}while(n<=0 || n>max);
		//Nhập mảng
		for(int i=0; i<n; i++) {
			System.out.print("a[ "+i+" ]= ");
			mang[i]=scanner.nextInt();
		}
		//Xuất mảng
		for(int i=0; i<n; i++) {
			System.out.print(mang[i]+"\t");
		}
		System.out.println();
		//So nguyen le so nguyen chan
		int dem1=0,dem2=0;
		for(int i=0; i<n; i++) {
			if(mang[i]>0 && mang[i]%2==0) {
				dem1++;
			}
			else {
				dem2++;
			}
		}
		System.out.println("Số lượng số nguyên chẵn có trong mảng: "+dem1);
		System.out.println("Số lượng số nguyên le có trong mảng: "+dem2);

	}

}

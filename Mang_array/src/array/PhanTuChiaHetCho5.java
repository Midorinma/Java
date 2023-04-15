package array;
import java.util.Scanner;
public class PhanTuChiaHetCho5 {
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
		//Lọc ra những phần tử chia hết cho 5
		System.out.println("Những phần tử chi hết cho 5: ");
		for(int i=0; i<n; i++) {
			if(mang[i]%5==0) {
				System.out.print(mang[i]+"\t");
			}
		}

	}

}

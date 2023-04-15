package array;
import java.util.Scanner;
public class SoLanXuatHien {
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
		//Dem so lan xuat hien
		int k,dem=0;
		System.out.println("Nhập một phần tử: ");
		k=scanner.nextInt();
		for(int i=0; i<n; i++) {
			if(mang[i]==k) {
				dem++;
			}
		}
		if(dem==0) {
			System.out.println("Không tìm thấy "+k+" trong mảng.");
			
		}else {
			System.out.println(k+" Xuất hiện: "+dem+" lần  trong mảng.");
		}
		
		

	}

}
